package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vn.tad_sebs.DAO.StudentDAO;
import vn.tad_sebs.Model.Student;
import vn.tad_sebs.View.StudentView;

public class StudentController {
    private StudentView studentView;
    private StudentDAO studentDao;

    public StudentController(StudentView view) {
        this.studentView = view;
        studentDao = new StudentDAO();
        studentView.addAddStudentListener(new AddStudentListener());
        studentView.addEditStudentListener(new EditStudentListener());
        studentView.addDeleteStudentListener(new DeleteStudentListener());
        studentView.addClearListener(new ClearStudentListener());

        studentView.addListStudentSelectionListener(new ListStudentSelectionListener());

    }

    public void showStudentView() {
        studentView.setVisible(true);
    }

    class AddStudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Student student = studentView.getStudentInfo();
            if (student != null) {
                studentDao.add(student);
                studentView.showListStudents(studentDao.getListStudents());
                studentView.showMessage("Thêm thành công!");
            }

        }
    }

    class EditStudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            Student student = studentView.getStudentInfo();
            if (student != null) {
                studentDao.edit(student);
                studentView.clearStudentInfo();
                studentView.showListStudents(studentDao.getListStudents());
                studentView.showMessage("Thêm thành công!");
            }
        }
    }

    class DeleteStudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Student student = studentView.getStudentInfo();
            if (student != null) {
                studentDao.delete(student);
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

}
