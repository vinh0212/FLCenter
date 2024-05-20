package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

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

public class StudentController {

    
    private StudentView studentView;

    private StudentDAO studentDao;
    private LopDAO lopDao;
    private StudentCustomSearch filterView;
    private TeacherDAO teacherDao;
    private SubjectDAO subjectDao;
    public StudentController(StudentView studentView) {
        this.studentView = studentView;
        studentDao = new StudentDAO();
        lopDao = new LopDAO();
        teacherDao = new TeacherDAO();
        subjectDao = new SubjectDAO();
        //studentView.addSaveGVListener(new SaveGVListener());
        studentView.addEditStudentListener(new EditStudentListener());
        studentView.addDeleteStudentListener(new DeleteStudentListener());
        //studentView.addClearListener(new ClearStudentListener());
        studentView.addSearchStudentListener(new SearchStudentListener());
        studentView.addListStudentSelectionListener(new ListStudentSelectionListener());
        studentView.addSortStudentByIDListener(new SortStudentByID());
        studentView.addSortStudentByNameListener(new SortStudentByName());
        
        studentView.addSearchListener(new FilterListener());
        studentView.addListPackageSelectionListener(new ListPackageSelectionListener());
        studentView.addListMonhocSelectionListener(new ListMonhocSelectionListener());

        

    }

    public void showStudentView() {
        List<Student> studentList = studentDao.getListStudents();
        List<Lop> lopList = lopDao.getListLops();
        List<Teacher> teacherList = teacherDao.getListTeachers();
        List<Monhoc> subjectList = subjectDao.getListSubjects();
        studentView.getListLops(lopList);
        studentView.showListStudents(studentList);
        
        studentView.getListSubjects(subjectList);
        studentView.setVisible(true);
    }

    class ListPackageSelectionListener implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e) {
            
            //new ListStudentSelectionListener().valueChanged(e);
            int id = studentView.getSelectedPackage();
            if (id != -1) {
                for (Lop lop : lopDao.getListLops())
                {
                    if (lop.getId() == id)
                    {
                        studentView.showSubjects(lop);
                        studentView.editingPackage = lop.getId();
                        break;
                    }
                }
                
               
            }
        }
            
    }

    class ListMonhocSelectionListener implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e) {
            
            if(!e.getValueIsAdjusting())
            {
                int selectedSubject = studentView.getSelectedSubject();
                List<Teacher> newTeacherList = new ArrayList<>();
                for (Teacher teacher : teacherDao.getListTeachers())
                {
                    if (teacher.getMon() == selectedSubject)
                    {
                        newTeacherList.add(teacher);
                    }
                }
                studentView.showListGV(newTeacherList);
            }
        }
            
    }
    class FilterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            filterView = new StudentCustomSearch();

            filterView.setOnOkButtonClickListener(new StudentCustomSearch.OnOkButtonClickListener() {
                @Override
                public void onOkButtonClick(List<Student> students) {
                    // Hiển thị dữ liệu students ở đây
                    if (students.isEmpty()) {
                        studentView.showMessage("Không tìm thấy!");
                        return;
                    }
                    studentView.showListStudents(students);
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

            studentView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    if (filterView != null) {
                        filterView.dispose();
                    }
                }
            });

        }
    }

    class SaveGVListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Student student = studentView.getStudentInfo();
            if (student != null) {
                studentDao.add(student);
                lopDao.addStudent(student);
                studentView.showStudent(student);
                studentView.showListStudents(studentDao.getListStudents());
                studentView.showMessage("Thêm thành công!");
            }

        }
    }

    class EditStudentListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Student student = studentView.getStudentInfo();
            if (student != null) {
                studentDao.edit(student);
                lopDao.addStudent(student);
                //studentView.clearStudentInfo();
                studentView.showListStudents(studentDao.getListStudents());
                studentView.showMessage("Sửa thành công!");
            }
        }
    }

    class DeleteStudentListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Student student = studentView.getStudentInfo();
            if (student != null) {
                studentDao.delete(student);
                lopDao.deleteStudent(student);
                //studentView.clearStudentInfo();
                studentView.showListStudents(studentDao.getListStudents());
                studentView.showMessage("Xóa thành công!");
            }
        }
    }

    /*class ClearStudentListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentView.clearStudentInfo();
        }
    }*/

    class ListStudentSelectionListener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
            
            int row = studentView.getSelectedRow();
            if (row != -1) {
                Student student = studentDao.getListStudents().get(row);
                studentView.showStudent(student);
            }

            
        }
    }

    class SearchStudentListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String criteria = studentView.getSelectedText();
            String value = studentView.getSearchBox();
            List<Student> list = new ArrayList<>();
            List<Student> oldlist = studentDao.getListStudents();

            if ("".equals(value)) {
                studentView.showListStudents(oldlist);
                return;
            } else {
                switch (criteria) {
                    case "ID":
                        if (!studentView.validateIDSearch())
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
                            //if (s.getLop().toLowerCase().contains(value.toLowerCase())) {
                            //    list.add(s);
                            //}
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
                studentView.showListStudents(list);
            }
            if (list.isEmpty()) {
                studentView.showMessage("Không tìm thấy!");
                studentView.showListStudents(oldlist);
            }

        }

    }

    class SortStudentByID implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            studentDao.sortListStudentsByID();
            studentView.showListStudents(studentDao.getListStudents());
        }
    }

    class SortStudentByName implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            studentDao.sortListStudentsByName();
            studentView.showListStudents(studentDao.getListStudents());
        }
    }

    
}
