package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vn.tad_sebs.DAO.StudentDAO;
import vn.tad_sebs.Model.Student;
import vn.tad_sebs.View.StudentView;
import vn.tad_sebs.DAO.LopDAO;
import vn.tad_sebs.Model.Lop;

public class StudentController {

    private StudentView studentView;
    private StudentDAO studentDao;
    private LopDAO lopDao;

    public StudentController(StudentView studentView) {
        this.studentView = studentView;
        studentDao = new StudentDAO();
        lopDao = new LopDAO();
        studentView.addAddStudentListener(new AddStudentListener());
        studentView.addEditStudentListener(new EditStudentListener());
        studentView.addDeleteStudentListener(new DeleteStudentListener());
        studentView.addClearListener(new ClearStudentListener());
        studentView.addSearchStudentListener(new SearchStudentListener());
        studentView.addListStudentSelectionListener(new ListStudentSelectionListener());
        studentView.addSortStudentByIDListener(new SortStudentByID());
        studentView.addSortStudentByNameListener(new SortStudentByName());
        studentView.addSortStudentByDiemListener(new SortStudentByDiem());
    }

    public void showStudentView() {
        List<Student> studentList = studentDao.getListStudents();
        List<Lop> lopList = lopDao.getListLops();
        ArrayList<String> lopNameList = new ArrayList<>();
        for (Lop l : lopList)
        {
            lopNameList.add(l.getId() + " - " + l.getName());
        }
        studentView.showListLop(lopNameList);
        studentView.showListStudents(studentList);
        studentView.setVisible(true);
    }

    class AddStudentListener implements ActionListener {

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
                studentView.clearStudentInfo();
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
                studentView.clearStudentInfo();
                studentView.showListStudents(studentDao.getListStudents());
                studentView.showMessage("Xóa thành công!");
            }
        }
    }

    class ClearStudentListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentView.clearStudentInfo();
        }
    }

    class ListStudentSelectionListener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
            studentView.fillStudentFromSelectedRow();
        }
    }

    class SearchStudentListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String criteria = studentView.getSelectedText();
            String value = studentView.getSearchBox();
            List<Student> list = new ArrayList<>();
            List<Student> oldlist = studentDao.getListStudents();
            
            if("".equals(value))
            {
                studentView.showListStudents(oldlist);
                return;
            }
            else
            {
                switch (criteria) {
                case "ID":
                    if(!studentView.validateIDSearch()) return;
                    for (Student s : oldlist) {
                        if (s.getId() == Integer.parseInt(value)) {
                            list.add(s);
                        }
                    }
                    break;
                case "Tên":
                    for (Student s : oldlist) {
                        if (s.getName().contains(value)) {
                            list.add(s);
                        }
                    }
                    break;
                case "Lớp":
                    for (Student s : oldlist) {
                        if (s.getLop().contains(value)) {
                            list.add(s);
                        }
                    }
                    break;
                case "Quê quán":
                    for (Student s : oldlist) {
                        if (s.getAddress().contains(value)) {
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
            if(list.isEmpty()) 
            {
                studentView.showMessage("Không tìm thấy!");
                studentView.showListStudents(oldlist);
            }
                
            

        }
        
    }
    class SortStudentByID implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            studentDao.sortListStudentsByID();
            studentView.showListStudents(studentDao.getListStudents());
        }
    }
    class SortStudentByName implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            studentDao.sortListStudentsByName();
            studentView.showListStudents(studentDao.getListStudents());
        }
    }
    class SortStudentByDiem implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            studentDao.sortListStudentsByDiem();
            studentView.showListStudents(studentDao.getListStudents());
        }
    }
}

    
