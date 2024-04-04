package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

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
    public Lop editingLop;
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
        
        /*classView.addCbChonlop1Listener(new CbChonlop1Listener());
        classView.addThemsubListener(new ThemsubListener());
        classView.addXoasubListener(new XoasubListener());
        classView.addSortCTbyIDListener(new SortCTbyIDListener());
        classView.addSortCTbyNameListener(new SortCTbyNameListener());
        classView.addSortCTbyPtsListener(new SortCTbyPtsListener());
        
        
        classView.addListTBSubjectSelectionListener(new ListTBSubjectSelectionListener());*/
    }

    public void showClassView() {
        List<Monhoc> listMonhoc = subjectDAO.readListSubjects();
        List<Student> listStudent = studentDAO.readListStudents();
        List<Lop> listLop = lopDAO.readListLops();

        classView.showClassList(listLop);

        classView.setVisible(true);

    }


    class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Lop lop = classView.getLopInfo(editingLop);
            if (lop != null) {
                lopDAO.addA(lop);
                classView.showClassList(lopDAO.readListLops());
                classView.showMessage("Thêm lớp thành công!");
            }

        }
    }

    class EditButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Lop lop = classView.getLopInfo(editingLop);
            if (lop != null) {

                lopDAO.editA(lop);
                classView.clearClassInfo();
                classView.showClassList(lopDAO.readListLops());
                classView.showMessage("Sửa lớp thành công!");
            }

        }
    }

    class DeleteButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Lop lop = classView.getLopInfo(editingLop);
            if (lop != null) {
                lopDAO.deleteA(lop);
                classView.clearClassInfo();
                classView.showClassList(lopDAO.readListLops());
                classView.showMessage("Xóa lớp thành công!");
            }

        }
    }

    class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            classView.clearClassInfo();
        }
    }

    class ListTBClassSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            classView.fillLopFromSelectedRow();
            editingLop = lopDAO.getLopByID(classView.getLopID());
        }
    }

    class SortClassByIDButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            lopDAO.sortClassListbyID();
            classView.showClassList(lopDAO.readListLops());
        }
    }

    class SortClassBySLButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            lopDAO.sortClassListbySL();
            classView.showClassList(lopDAO.readListLops());
        }
    }

    //----------------------------------------

    class TabChangeListener implements ChangeListener
    {
        public void stateChanged(ChangeEvent e) {
            classView.resetforTab2();
        }
    }

    class CbChonlopListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            int value = classView.getClassChoice();
            listStudentInClass.clear();
            List<Student> listStudent = studentDAO.readListStudents();
            List<Student> listStudentInClass = new ArrayList<Student>();
            for (Student s : listStudent)
            {
                if(s.getClass().equals(value))
                {
                    listStudentInClass.add(s);
                }
            }
            classView.showStudentList(listStudentInClass);
        }
    }

    class FindStudentButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            String value = classView.getSearchBoxStudent();
            int criteria = classView.getCriteria();
            List<Student> list = new ArrayList<Student>();

            if ("".equals(value)) {
                classView.showStudentList(listStudentInClass);
            } else {
                switch (criteria)
                {
                    case 0:
                        for (Student s : listStudentInClass) {
                            if (s.getId() == Integer.parseInt(value)) {
                                list.add(s);
                            }
                        }
                        break;
                    case 1:
                        for (Student s : listStudentInClass) {
                            if (s.getName().contains(value)) {
                                list.add(s);
                            }
                        }
                        break;
                    case 2:
                        for (Student s : listStudentInClass) {
                            if (s.getAddress().contains(value)) {
                                list.add(s);
                            }
                        }
                    default:
                        break;
                }
                classView.showStudentList(list);
            }
        }
    }

    class ListTBStudentSelectionListener implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e) {
            classView.fillStudentFromSelectedRow();

            editingStudent = lopDAO.getStudentById(classView.getStudentID());        
        }
    }

    class UpdateCLButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            Student student = classView.getStudentInfo(editingStudent);
            if(student != null)
            {
                studentDAO.edit(student);
                classView.showStudentList(studentDAO.readListStudents());
                classView.showMessage("Sửa thông tin học sinh thành công!");
            }
        }
    }
    class clearCLButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            classView.clearStudentInfo();
        }
    }

    public void dothesamething()
    {
        int value = classView.getClassChoice();
        listStudentInClass.clear();
        List<Student> listStudent = studentDAO.readListStudents();
        List<Student> listStudentInClass = new ArrayList<Student>();
        for (Student s : listStudent)
        {
            if(s.getClass().equals(value))
            {
                listStudentInClass.add(s);
            }
        }
        classView.showStudentList(listStudentInClass);
    }
    class SortCLByIDButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            lopDAO.sortStudentListbyID();
            dothesamething();
        }
    }

    class SortCLByNameButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            lopDAO.sortStudentListbyName();
            dothesamething();
        }
    }

    class SortCLByPtsButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            lopDAO.sortStudentListbyDiem();
            dothesamething();
        }
    }




}
