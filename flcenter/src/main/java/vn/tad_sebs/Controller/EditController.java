package vn.tad_sebs.Controller;

import vn.tad_sebs.View.EditStudentView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vn.tad_sebs.DAO.LopDAO;
import vn.tad_sebs.DAO.StudentDAO;
import vn.tad_sebs.DAO.SubjectDAO;
import vn.tad_sebs.DAO.CanboDAO.TeacherDAO;
import vn.tad_sebs.Model.Student;
import vn.tad_sebs.Model.Teacher;

public class EditController {

    private EditStudentView editStudentView;
    private StudentDAO studentDAO;
    private LopDAO lopDAO;
    private TeacherDAO teacherDao;
    private SubjectDAO subjectDao;
    private List<Student> studentList;

    public EditController(EditStudentView editStudentView) {
        this.editStudentView = editStudentView;
        studentDAO = new StudentDAO();
        lopDAO = new LopDAO();
        studentList = studentDAO.getListStudents();
        teacherDao = new TeacherDAO();
        subjectDao =  new SubjectDAO();

        editStudentView.addAddtoPkgListListener(new AddPkgtoList());
        editStudentView.addConfirmListener(new ConfirmListener());
        editStudentView.addDoneListener(new DoneListener());
        editStudentView.addDeleteListener(new DeleteListener());
        editStudentView.addListMonhocSelectionListener(new ListMonhocSelectionListener());
        editStudentView.addEditStudentListener(new EditStudentListener());


       
    }

    public void showEditView(String id) {
        editStudentView.setVisible(true);
        editStudentView.getListLops(lopDAO.getListLops());
        editStudentView.getListTeachers(teacherDao.getListTeachers());
        editStudentView.getListSubjects(subjectDao.getListSubjects());
        for (Student s : studentList) {
            if (String.valueOf(s.getId()).equals(id)) {
                editStudentView.showStudent(s);
                break;
            }
        }
    }

    class AddPkgtoList implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            editStudentView.moveSelectedItems();
        }
    }

   class ConfirmListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // Perform action...

            int id = editStudentView.getSelectedPackage();
            //remove action listener on listMonhoc
            ListSelectionListener[] listeners = editStudentView.getListMonhoc().getListSelectionListeners();
            for (ListSelectionListener l : listeners) {
                editStudentView.getListMonhoc().removeListSelectionListener(l);
            }
            editStudentView.showListMonhoc(id);

            //add action listener on listMonhoc
            editStudentView.addListMonhocSelectionListener(new ListMonhocSelectionListener());
            editStudentView.hidePackageRelated();
        }

    }

    class DoneListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            editStudentView.hideTeacherRelated();
        }
    }

    class DeleteListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            editStudentView.moveSelectedItemsBack();
        }

    }

    class ListMonhocSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            // Only perform action if this is the final event in a series of related events
            if (e.getValueIsAdjusting()) {
                return;
            }

            // Perform action...

            

            int id = editStudentView.getSelectedSubject();
            // lọc giáo viên với cùng idMonhoc
            List<Teacher> teacherList = teacherDao.getListTeachers();
            List<Teacher> list = new ArrayList<>();
            for (Teacher t : teacherList) {
                if (t.getMon() == id) {
                    list.add(t);
                }
            }
            editStudentView.showListGV(list);
        }

    }

    class EditStudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Student student = editStudentView.getStudentInfo();
            if (student != null) {
                studentDAO.edit(student);
                lopDAO.editStudent(student);
                editStudentView.showMessage("Sửa thành công!");
            }
        }

    }
    
}
