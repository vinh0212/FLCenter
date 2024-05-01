package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vn.tad_sebs.DAO.LopDAO;
import vn.tad_sebs.DAO.SubjectDAO;
import vn.tad_sebs.Model.Monhoc;
import vn.tad_sebs.Model.Lop;
import vn.tad_sebs.Model.Student;
import vn.tad_sebs.DAO.StudentDAO;
import vn.tad_sebs.View.ClassView;

public class ClassController {

    private ClassView classView;
    private LopDAO lopDAO;
    private StudentDAO studentDAO;
    private SubjectDAO subjectDAO;
    public List<Student> listStudentInClass = new ArrayList<Student>();
    public Lop editingLop = new Lop();
    public Student editingStudent;

    public ClassController(ClassView classView) {
        this.classView = classView;

        studentDAO = new StudentDAO();
        subjectDAO = new SubjectDAO();
        lopDAO = new LopDAO();

        classView.addAddClassListener(new AddButtonListener());
        classView.addEditClassListener(new EditButtonListener());
        classView.addDeleteClassListener(new DeleteButtonListener());
        classView.addClearClassListener(new ClearButtonListener());
        classView.addSortClassbyIDListener(new SortClassByIDButtonListener());
        classView.addSortClassbySLListener(new SortClassBySLButtonListener());
        classView.addListTBClassSelectionListener(new ListTBClassSelectionListener());
        classView.addTabChangeListener(new TabChangeListener());

        classView.addCbChonlopListener(new CbChonlopListener());
        classView.addFindStudentListener(new FindStudentButtonListener());
        classView.addUpdateCLListener(new UpdateCLButtonListener());
        classView.addClearCLListener(new clearCLButtonListener());
        classView.addSortCLbyIDListener(new SortCLByIDButtonListener());
        classView.addSortCLbyNameListener(new SortCLByNameButtonListener());
        classView.addSortCLbyPtsListener(new SortCLByPtsButtonListener());
        classView.addListTBStudentSelectionListener(new ListTBStudentSelectionListener());

        /*
         * classView.addCbChonlop1Listener(new CbChonlop1Listener());
         * classView.addThemsubListener(new ThemsubListener());
         * classView.addXoasubListener(new XoasubListener());
         * classView.addSortCTbyIDListener(new SortCTbyIDListener());
         * classView.addSortCTbyNameListener(new SortCTbyNameListener());
         * classView.addSortCTbyPtsListener(new SortCTbyPtsListener());
         * 
         * 
         * classView.addListTBSubjectSelectionListener(new
         * ListTBSubjectSelectionListener());
         */
    }

    public void showClassView() {
        List<Monhoc> listMonhoc = subjectDAO.getListSubjects();
        List<Student> listStudent = studentDAO.getListStudents();
        List<Lop> listLop = lopDAO.getListLops();

        classView.showClassList(listLop);
        classView.showClassListinCbChonlop(listLop);

        classView.setVisible(true);

    }

    class AddButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Lop lop = classView.getLopInfo();
            if (lop != null) {
                lopDAO.addA(lop);
                classView.showClassList(lopDAO.getListLops());
                classView.showMessage("Thêm lớp thành công!");
            }

        }
    }

    class EditButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Lop lop = classView.getLopInfo();
            if (lop != null) {

                lopDAO.editA(lop);
                classView.clearClassInfo();
                classView.showClassList(lopDAO.getListLops());
                classView.showMessage("Sửa lớp thành công!");
            }

        }
    }

    class DeleteButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Lop lop = classView.getLopInfo();
            
            if (lop != null) {
                if(lopDAO.deleteA(lop))
                {
                    classView.clearClassInfo();
                    classView.showClassList(lopDAO.getListLops());
                    classView.showMessage("Xóa lớp thành công!");
                }
            }

        }
    }

    class ClearButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            classView.clearClassInfo();
            editingLop = new Lop();
        }
    }

    class ListTBClassSelectionListener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
            classView.fillLopFromSelectedRow();
        }
    }

    class SortClassByIDButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            lopDAO.sortClassListbyID();
            classView.showClassList(lopDAO.getListLops());
        }
    }

    class SortClassBySLButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            lopDAO.sortClassListbySL();
            classView.showClassList(lopDAO.getListLops());
        }
    }

    // ----------------------------------------
    //ATTENTION: Interesting code
    class TabChangeListener implements ChangeListener {

        public void stateChanged(ChangeEvent e) {
            JTabbedPane sourceTabbedPane = (JTabbedPane) e.getSource();
            int index = sourceTabbedPane.getSelectedIndex();

            if (index == 0) { // tab1
                classView.resetforTab1();
            } else if (index == 1) { // tab2
                classView.resetforTab2();

                // Xoá tất cả các mục trong cbChonlop
                ActionListener[] listeners = classView.getCbChonlop().getActionListeners();
                for (ActionListener listener : listeners) {
                    classView.getCbChonlop().removeActionListener(listener);
                }

                classView.getCbChonlop().removeAllItems();

                // Load lại dữ liệu từ cơ sở dữ liệu
                classView.showListCl(lopDAO.getListLops());

                for (ActionListener listener : listeners) {
                    classView.getCbChonlop().addActionListener(listener);
                }
                // Gọi hàm hiển thị bảng lại
                new CbChonlopListener().actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));

            }
        }
    }

    class CbChonlopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int value = classView.getClassChoice();
            listStudentInClass.clear();
            List<Student> listStudent = studentDAO.getListStudents();

            for (Student s : listStudent) {
                if (s.getLop().equals(String.valueOf(value))) {
                    listStudentInClass.add(s);
                }
            }
            classView.showStudentList(listStudentInClass);
        }
    }

    class FindStudentButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String value = classView.getSearchBoxStudent();
            int criteria = classView.getCriteria();
            List<Student> list = new ArrayList<Student>();

            if ("".equals(value)) {
                classView.showStudentList(listStudentInClass);
                return;
            } else {
                switch (criteria) {
                    case 0:
                        if (!classView.validateID()) {
                            return;
                        }
                        for (Student s : listStudentInClass) {
                            if (s.getId() == Integer.parseInt(value)) {
                                list.add(s);
                            }
                        }
                        break;
                    case 1:
                        for (Student s : listStudentInClass) {
                            if (s.getName().toLowerCase().contains(value.toLowerCase())) {
                                list.add(s);
                            }
                        }
                        break;
                    case 2:
                        for (Student s : listStudentInClass) {
                            if (s.getAddress().toLowerCase().contains(value.toLowerCase())) {
                                list.add(s);
                            }
                        }
                        break;
                    default:
                        break;
                }
                classView.showStudentList(list);

            }
            if (list.isEmpty()) {
                classView.showMessage("Không tìm thấy!");
                classView.showStudentList(listStudentInClass);
            }
        }
    }

    class ListTBStudentSelectionListener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
            classView.fillStudentFromSelectedRow();

        }
    }

    class UpdateCLButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Student student = classView.getStudentInfo();

            if (student != null) {
                studentDAO.editB(student);
                dothesamething();
                classView.clearStudentInfo();
                classView.showMessage("Sửa thông tin học sinh thành công!");
            }
        }
    }

    class clearCLButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            classView.clearStudentInfo();
        }
    }

    public void dothesamething() {
        int value = classView.getClassChoice();

        List<Student> listStudent = studentDAO.getListStudents();
        List<Student> listStudentInClass = new ArrayList<Student>();
        for (Student s : listStudent) {
            if (s.getLop().equals(String.valueOf(value))) {
                listStudentInClass.add(s);
            }
        }
        classView.showStudentList(listStudentInClass);
    }

    class SortCLByIDButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentDAO.sortListStudentsByID();
            dothesamething();
        }
    }

    class SortCLByNameButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentDAO.sortListStudentsByName();
            dothesamething();
        }
    }

    class SortCLByPtsButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentDAO.sortListStudentsByDiem();
            dothesamething();
        }
    }

}
