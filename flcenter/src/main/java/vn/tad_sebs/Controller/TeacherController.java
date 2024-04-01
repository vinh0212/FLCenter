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
import vn.tad_sebs.View.TeacherView;

public class TeacherController {
    private CanboDAO.TeacherDAO teacherDao;
    private CanboDAO.LanhdaoDAO lanhdaoDao;
    private TeacherView teacherView;

    public TeacherController(TeacherView teacherView) {
        this.teacherView = teacherView;
        teacherDao = new CanboDAO.TeacherDAO();
        lanhdaoDao = new CanboDAO.LanhdaoDAO();
        teacherView.addAddGVListener(new AddGVListener());
        teacherView.addEditGVListener(new EditGVListener());
        teacherView.addDeleteGVListener(new DeleteGVListener());
        teacherView.addClearGVListener(new ClearGVListener());
        teacherView.addSearchGVListener(new SearchGVListener());
        teacherView.addListGVSelectionListener(new ListGVSelectionListener());
        teacherView.addSortGVByIDListener(new SortGVByIDListener());
        teacherView.addSortGVByNameListener(new SortGVByNameListener());
        teacherView.addSortGVByLevelListener(new SortGVByLevelListener());

        // Lanhdao
        /* 
        teacherView.addAddLDListener(new AddLDListener());
        teacherView.addEditLDListener(new EditLDListener());
        teacherView.addDeleteLDListener(new DeleteLDListener());
        teacherView.addClearLDListener(new ClearLDListener());
        teacherView.addSearchLDListener(new SearchLDListener());
        teacherView.addListLDSelectionListener(new ListLDSelectionListener());
        teacherView.addSortLDByIDListener(new SortLDByIDListener());
        teacherView.addSortLDByNameListener(new SortLDByNameListener());
        teacherView.addSortLDByLevelListener(new SortLDByLevelListener());
        teacherView.addSortLDByRoleListener(new SortLDByRoleListener());*/
    }

    public void showTeacherView() {
        List<Teacher> teacherList = teacherDao.getListTeachers();
        List<Lanhdao> lanhdaoList = lanhdaoDao.getListLanhdaos();
        teacherView.showListGV(teacherList);
        teacherView.showListLD(lanhdaoList);
        teacherView.setVisible(true);
    }

    class AddGVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Teacher teacher = teacherView.getGVInfo();
            if (teacher != null) {
                teacherDao.add(teacher);
                teacherView.showGV(teacher);
                teacherView.showListGV(teacherDao.getListTeachers());
                teacherView.showMessage("Thêm thành công!");
            }
        }
    }

    class EditGVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Teacher teacher = teacherView.getGVInfo();
            if (teacher != null) {
                teacherDao.edit(teacher);
                teacherView.clearGVInfo();
                teacherView.showListGV(teacherDao.getListTeachers());
                teacherView.showMessage("Sửa thành công!");
            }
        }
    }

    class DeleteGVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Teacher teacher = teacherView.getGVInfo();
            if (teacher != null) {
                teacherDao.delete(teacher);
                teacherView.clearGVInfo();
                teacherView.showListGV(teacherDao.getListTeachers());
                teacherView.showMessage("Xóa thành công!");
            }
        }
    }

    class ClearGVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teacherView.clearGVInfo();
        }
    }

    class ListGVSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            teacherView.fillGVFromSelectedRow();
        }
    }

    class SearchGVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String criteria = teacherView.getSelectedTextGV();
            String value = teacherView.getSearchBoxGV();
            List<Teacher> list = new ArrayList<>();
            List<Teacher> oldlist = teacherDao.getListTeachers();

            if ("".equals(value)) {
                teacherView.showListGV(oldlist);
            } else {
                switch (criteria) {
                    case "ID":
                        for (Teacher t : oldlist) {
                            if (t.getId() == Integer.parseInt(value)) {
                                list.add(t);
                            }
                        }
                        break;
                    case "Tên":
                        for (Teacher t : oldlist) {
                            if (t.getName().equals(value)) {
                                list.add(t);
                            }
                        }
                        break;
                    case "Quê quán":
                        for (Teacher t : oldlist) {
                            if (t.getAddress().equals(value))
                                list.add(t);

                        }
                        break;
                    case "Cấp bậc hàm":
                        for (Teacher t : oldlist) {
                            if (t.getCapbacham().equals(value))
                                list.add(t);
                        }
                        break;
                    case "Giới tính":
                        for (Teacher t : oldlist) {
                            if (t.getSex().equals(value))
                                list.add(t);
                        }
                        break;
                    case "Môn giảng dạy":
                        for (Teacher t : oldlist) {
                            if (t.getMon().equals(value))
                                list.add(t);

                        }
                        break;
                    case "Lớp phụ trách":
                        for (Teacher t : oldlist)
                        {
                            if(t.getLop().equals(value))
                                list.add(t);
                        }
                    default:
                        break;

                }
                teacherView.showListGV(list);
            }


        }

    }

    class SortGVByIDListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            teacherDao.sortListTeachersByID();
            teacherView.showListGV(teacherDao.getListTeachers());
        }
    }

    class SortGVByNameListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            teacherDao.sortListTeachersByName();
            teacherView.showListGV(teacherDao.getListTeachers());
        }
    }

    class SortGVByLevelListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            teacherDao.sortListTeachersByCapbacham();
            teacherView.showListGV(teacherDao.getListTeachers());
        }
    }

}
