package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

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

        classView.addCbChonlopListener(new CbChonlopListener());
        classView.addFindStudentListener(new FindStudentButtonListener());
        classView.addUpdateCLListener(new UpdateCLButtonListener());
        classView.addClearCLListener(new clearCLButtonListener());
        classView.addSortCLbyIDListener(new SortCLByIDButtonListener());
        classView.addSortCLbyNameListener(new SortCLByNameButtonListener());
        classView.addSortCLbyPtsListener(new SortCLByPtsButtonListener());

        classView.addCbChonlop1Listener(new CbChonlop1Listener());
        classView.addThemsubListener(new ThemsubListener());
        classView.addXoasubListener(new XoasubListener());
        classView.addSortCTbyIDListener(new SortCTbyIDListener());
        classView.addSortCTbyNameListener(new SortCTbyNameListener());
        classView.addSortCTbyPtsListener(new SortCTbyPtsListener());
        classView.addListTBClassSelectionListener(new ListTBClassSelectionListener());
        classView.addListTBStudentSelectionListener(new ListTBStudentSelectionListener());
        classView.addListTBSubjectSelectionListener(new ListTBSubjectSelectionListener());
    }

    public void showClassView() {
        List<Monhoc> listMonhoc = subjectDAO.readListSubjects();
        List<Student> listStudent = studentDAO.readListStudents();
        List<Lop> listLop = lopDAO.readListLops();

        classView.showClass(listLop);

        classView.setVisible(true);
        
    }
}
