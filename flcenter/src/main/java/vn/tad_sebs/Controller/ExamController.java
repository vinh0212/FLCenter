package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vn.tad_sebs.DAO.ExamDAO;
import vn.tad_sebs.DAO.CanboDAO.TeacherDAO;
import vn.tad_sebs.Model.Exam;
import vn.tad_sebs.Model.ExamXML;
import vn.tad_sebs.Model.Teacher;
import vn.tad_sebs.View.ExamView;

public class ExamController {
    private ExamView examView;
    private ExamDAO examDAO;
    private TeacherDAO teacherDAO;
    private List<Exam> listExams;
    private List<Teacher> listTeachers;

    public ExamController(ExamView examView) {
        this.examView = examView;
        examDAO = new ExamDAO();
        teacherDAO = new TeacherDAO();
        examView.addAddExamListener(new AddExamListener());
        examView.addEditExamListener(new EditExamListener());
        examView.addDeleteExamListener(new DeleteExamListener());
        examView.addClearExamListener(new ClearExamListener());
        examView.addSortExamByIDListener(new SortbyIDListener());
        examView.addSortExamByTimeListener(new SortbyTimeListener());
        examView.addListExamSelectionListener(new ListExamSelectionListener());
        examView.addEditTeacherListener(new EditTeacherListener());
        examView.addPullListener(new PullListener());
        examView.addPushListener(new PushListener());
        examView.addOKListener(new OKListener());


    }

    public void showExamView() {
        listExams = examDAO.getListExams();
        listTeachers = teacherDAO.getListTeachers();
        examView.showListExam(listExams);
        examView.setVisible(true);
    }

    class AddExamListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Exam exam = examView.getExamInfo();
            if (exam != null) {
                examDAO.add(exam);

                examView.showListExam(examDAO.getListExams());
                examView.showMessage("Thêm kì thi thành công!");
            }
        }
    }

    class EditExamListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Exam exam = examView.getExamInfo();
            if (exam != null) {
                examDAO.edit(exam);
                examView.showListExam(examDAO.getListExams());
                examView.showMessage("Sửa kì thi thành công!");
            }
        }
    }

    class DeleteExamListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Exam exam = examView.getExamInfo();
            if (exam != null) {
                examDAO.delete(exam);
                examView.showListExam(examDAO.getListExams());
                examView.showMessage("Xóa kì thi thành công!");
            }
        }
    }

    class ClearExamListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            examView.clearExamInfo();

        }
    }

    class SortbyIDListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            examDAO.sortbyID();
            examView.showListExam(examDAO.getListExams());
        }
    }

    class SortbyTimeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            examDAO.sortbyTime();
            examView.showListExam(examDAO.getListExams());
        }
    }

    class ListExamSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            examView.fillExamFromSelectedRow();
        }
    }

    class EditTeacherListener implements  ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            List<Teacher> list = examDAO.getListGiamthi(examView.getExamID());
            List<Teacher> mList = teacherDAO.getListTeacherswithName(list);
            examView.showListPullGiamthi(mList);
            List<Teacher> uList = teacherDAO.getUnavailableList(list);
            examView.showListPushGiamthi(uList);
        }
    }

    class PullListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
            examView.moveSelectedItems(examView.getListPull(), examView.getListPush());
        }
    }

    class PushListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            examView.moveSelectedItems(examView.getListPush(), examView.getListPull());
        }
    }

    class OKListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            examView.setListPullIDGiamthi();
            
        }
    }

}
