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
    private StudentView view;
    private StudentDAO studentDao;

    public StudentController(StudentView view) {
        this.view = view;
        studentDao = new StudentDAO();
        view.addAddStudentListener(new AddStudentListener());
        view.addEdiStudentListener(new EditStudentListener());
        view.addDeleteStudentListener(new DeleteStudentListener());
        view.addClearListener(new ClearStudentListener());
        view.addSortStudentGPAListener(new SortStudentGPAListener());
        view.addSortStudentNameListener(new SortStudentNameListener());
        view.addListStudentSelectionListener(new ListStudentSelectionListener());
        
    }

    public void showStudentView() {
        view.setVisible(true);
    }


    class AddStudentListener implements ActionListener {
        
    }

    class EditStudentListener implements ListSelectionListener {
        
    }
}
