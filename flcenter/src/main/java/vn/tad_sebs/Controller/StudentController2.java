package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingWorker;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vn.tad_sebs.DAO.StudentDAO;
import vn.tad_sebs.DAO.SubjectDAO;
import vn.tad_sebs.DAO.CanboDAO.TeacherDAO;
import vn.tad_sebs.Model.Student;
import vn.tad_sebs.Model.Teacher;
import vn.tad_sebs.View.StudentCustomSearch;
import vn.tad_sebs.View.StudentView;
import vn.tad_sebs.DAO.CanboDAO;
import vn.tad_sebs.DAO.LopDAO;
import vn.tad_sebs.Model.Lop;
import vn.tad_sebs.Model.Monhoc;
import vn.tad_sebs.View.StudentView2;

public class StudentController2 {

    private boolean isStudentSelectionChanged = false;
    private StudentView2 studentView2;
    private StudentDAO studentDao;
    private LopDAO lopDao;
    private StudentCustomSearch filterView;
    private TeacherDAO teacherDao;
    private SubjectDAO subjectDao;

    public StudentController2(StudentView2 studentView2) {
        this.studentView2 = studentView2;
        studentDao = new StudentDAO();
        lopDao = new LopDAO();
        teacherDao = new TeacherDAO();
        subjectDao = new SubjectDAO();
        studentView2.addAddStudentListener(new AddStudentListener());
        studentView2.addEditGVListener(new EditGVListener());
        studentView2.addListMonhocSelectionListener(new ListMonhocSelectionListener());
        //add push and pull listener
        studentView2.addPullListener(new PullListener());
        studentView2.addPushListener(new PushListener());
        studentView2.addListChooseSelectionListener(new ListChooseSelectionListener());
        studentView2.addListInvSelectionListener(new ListInvSelectionListener());
        
        
    }
    

    public void showStudentView2() {
        List<Student> studentList = studentDao.getListStudents();
        List<Lop> lopList = lopDao.getListLops();
        List<Teacher> teacherList = teacherDao.getListTeachers();
        List<Monhoc> subjectList = subjectDao.getListSubjects();
        studentView2.getListLops(lopList);
        studentView2.showPackagesFromData(lopList);
        studentView2.getListTeachers(teacherList);
        studentView2.getListSubjects(subjectList);
        studentView2.setVisible(true);
        
    }

    class ListChooseSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {

            
            //if studentView2.getSelectedPackageFromListChoose() is null, return

            /* if (studentView2.getSelectedPackageFromListChoose() == -1) {
                return;
            } */
            for (Lop lop : lopDao.getListLops())
                if (lop.getId() == studentView2.getSelectedPackageFromListChoose()) {
                    studentView2.showPackageInfo(lop);
                    break;
                }
        }
    }

    class ListInvSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            
            /* if (studentView2.getSelectedPackageFromListInv() == -1) {
                return;
            } */
            for (Lop lop : lopDao.getListLops())
                if (lop.getId() == studentView2.getSelectedPackageFromListInv()) {
                    studentView2.showPackageInfo(lop);
                    break;
                }
        }
    }

    class PullListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            studentView2.moveSelectedItems(studentView2.getListChoose(), studentView2.getListInv());
            if(studentView2.getListChoose().getModel().getSize() > 0)
            studentView2.getListChoose().setSelectedIndex(0);
        }

    }

    class PushListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            studentView2.moveSelectedItems(studentView2.getListInv(), studentView2.getListChoose());
            if(studentView2.getListInv().getModel().getSize() > 0)
            studentView2.getListInv().setSelectedIndex(0);
        }

    }

    class EditGVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
         
            
            // Perform action...
            int id = studentView2.getSelectedPackage();
            // remove action listener on listMonhoc
            ListSelectionListener[] listeners = studentView2.getListMonhoc().getListSelectionListeners();
            for (ListSelectionListener l : listeners) {
                studentView2.getListMonhoc().removeListSelectionListener(l);
            }

            studentView2.showListMonhoc(id);

            // add action listener on listMonhoc
            studentView2.addListMonhocSelectionListener(new ListMonhocSelectionListener());
            studentView2.hidePackageRelated();
        }

    }
    
    class AddStudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Student student = studentView2.getStudentInfo();
            if (student != null) {
                studentDao.add(student);
                lopDao.addStudent(student);
                studentView2.showMessage("Thêm thành công!");
            }
        }

    }
    
    class ListMonhocSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            // Only perform action if this is the final event in a series of related events
            if (e.getValueIsAdjusting()) {
                return;
            }

            // Perform action...

            int id = studentView2.getSelectedSubject();
            // lọc giáo viên với cùng idMonhoc
            List<Teacher> teacherList = teacherDao.getListTeachers();
            List<Teacher> list = new ArrayList<>();
            for (Teacher t : teacherList) {
                if (t.getMon() == id) {
                    list.add(t);
                }
            }
            studentView2.showListGV(list);
        }

    }

    class FilterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            /* filterView = new StudentCustomSearch();

            filterView.setOnOkButtonClickListener(new StudentCustomSearch.OnOkButtonClickListener() {
                @Override
                public void onOkButtonClick(List<Student> students) {
                    // Hiển thị dữ liệu students ở đây
                    if (students.isEmpty()) {
                        studentView2.showMessage("Không tìm thấy!");
                        return;
                    }
                    studentView2.showListStudents(students);
                }
            });
            filterView.doDialog();
            filterView.getListStudents(studentDao.getListStudents());
            try {
                filterView.clear();
            } catch (ParseException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            filterView.setVisible(true);

            studentView2.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    if (filterView != null) {
                        filterView.dispose();
                    }
                }
            }); */

        }
    }
    class EditStudentListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            /* Student student = studentView2.getStudentInfo();
            if (student != null) {
                studentDao.edit(student);
                lopDao.editStudent(student);
                // studentView.clearStudentInfo();
                studentView2.showListStudents(studentDao.getListStudents());
                studentView2.showMessage("Sửa thành công!");
            } */
        }
    }

    /*
     * class ClearStudentListener implements ActionListener {
     * 
     * public void actionPerformed(ActionEvent e) {
     * studentView.clearStudentInfo();
     * }
     * }
     */

    class ListStudentSelectionListener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {

            /* int row = studentView2.getSelectedRow();
            if (row != -1) {
                Student student = studentDao.getListStudents().get(row);
                studentView2.showStudent(student);
            } */
        }
    }

    class SearchStudentListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            /* String criteria = studentView2.getSelectedText();
            String value = studentView2.getSearchBox();
            List<Student> list = new ArrayList<>();
            List<Student> oldlist = studentDao.getListStudents();

            if ("".equals(value)) {
                studentView2.showListStudents(oldlist);
                return;
            } else {
                switch (criteria) {
                    case "ID":
                        if (!studentView2.validateIDSearch())
                            return;
                        for (Student s : oldlist) {
                            if (s.getId() == Integer.parseInt(value)) {
                                list.add(s);
                            }
                        }
                        break;
                    case "Tên":
                        for (Student s : oldlist) {
                            if (s.getName().toLowerCase().contains(value.toLowerCase())) {
                                list.add(s);
                            }
                        }
                        break;
                    case "Lớp":
                        for (Student s : oldlist) {
                            // if (s.getLop().toLowerCase().contains(value.toLowerCase())) {
                            // list.add(s);
                            // }
                        }
                        break;
                    case "Quê quán":
                        for (Student s : oldlist) {
                            if (s.getAddress().toLowerCase().contains(value.toLowerCase())) {
                                list.add(s);
                            }
                        }
                        break;
                    case "Ngày sinh":
                        for (Student s : oldlist) {
                            if (s.getDate().equals(value)) {
                                list.add(s);
                            }
                        }
                        break;
                    default:
                        break;
                }
                studentView2.showListStudents(list);
            }
            if (list.isEmpty()) {
                studentView2.showMessage("Không tìm thấy!");
                studentView2.showListStudents(oldlist);
            }
 */
        }

    }

    

}
