package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vn.tad_sebs.DAO.CanboDAO;
import vn.tad_sebs.Model.Lanhdao;
import vn.tad_sebs.Model.Teacher;


public class TeacherController {
    private CanboDAO.TeacherDAO teacherDao;
    private CanboDAO.LanhdaoDAO lanhdaoDao;

    public TeacherController() {
        teacherDao = new CanboDAO.TeacherDAO();
        lanhdaoDao = new CanboDAO.LanhdaoDAO();
    }

    public void showListTeachers()
    {
        List<Teacher> teacherList = teacherDao.getListTeachers();
        //teacherView.showListTeachers(teacherList);
        //teacherView.setVisible(true);
    }

}
