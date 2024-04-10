package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vn.tad_sebs.DAO.CanboDAO;
import vn.tad_sebs.Model.Department;
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
        teacherView.addListDPSelectionListener(new DPChoiceListener());

        // Lanhdao
        
        teacherView.addAddLDListener(new AddLDListener());
        teacherView.addEditLDListener(new EditLDListener());
        teacherView.addDeleteLDListener(new DeleteLDListener());
        teacherView.addClearLDListener(new ClearLDListener());
        teacherView.addSearchLDListener(new SearchLDListener());
        teacherView.addListLDSelectionListener(new ListLDSelectionListener());
        teacherView.addSortLDByIDListener(new SortLDByIDListener());
        teacherView.addSortLDByNameListener(new SortLDByNameListener());
        teacherView.addSortLDByLevelListener(new SortLDByLevelListener());
        teacherView.addSortLDByRoleListener(new SortLDByRoleListener());
    }

    class DPChoiceListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int value = teacherView.getDPChoice();
            List<Teacher> list = new ArrayList<>();
            List<Teacher> oldlist = teacherDao.getListTeachers();
            for (Teacher t : oldlist)
            {
                if(t.getDp() == value)
                {
                    list.add(t);
                }
            }
            teacherView.showListGV(list);
            
        }
    }
    
    public void dothesamething()
    {
            int value = teacherView.getDPChoice();
            List<Teacher> list = new ArrayList<>();
            List<Teacher> oldlist = teacherDao.getListTeachers();
            for (Teacher t : oldlist) {
                if(t.getDp() == value) {
                    list.add(t);
                }
            }
            teacherView.showListGV(list);
    }

    public void showTeacherView() {
        List<Teacher> teacherList = teacherDao.getListTeachers();
        List<Lanhdao> lanhdaoList = lanhdaoDao.getListLanhdaos();
        List<Department> departmentList = teacherDao.getListDepartments();
        //teacherView.showListGV(teacherList);
        teacherView.showListLD(lanhdaoList);
        teacherView.showListDP(departmentList);
        teacherView.setVisible(true);
    }

    class AddGVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Teacher teacher = teacherView.getGVInfo();
            if (teacher != null) {
                teacherDao.add(teacher);
                teacherView.showGV(teacher);
                dothesamething();
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
                dothesamething();
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
                dothesamething();
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
            dothesamething();
        }
    }

    class SortGVByNameListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            teacherDao.sortListTeachersByName();
            dothesamething();
        }
    }

    class SortGVByLevelListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            teacherDao.sortListTeachersByCapbacham();
            dothesamething();
        }
    }





    class AddLDListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Lanhdao lanhdao = teacherView.getLDInfo();
            if (lanhdao != null) {
                lanhdaoDao.add(lanhdao);
                teacherView.showLD(lanhdao);
                teacherView.showListLD(lanhdaoDao.getListLanhdaos());
                teacherView.showMessage("Thêm thành công!");
            }
        }
    }

    class EditLDListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Lanhdao lanhdao = teacherView.getLDInfo();
            if (lanhdao != null) {
                lanhdaoDao.edit(lanhdao);
                teacherView.clearLDInfo();
                teacherView.showListLD(lanhdaoDao.getListLanhdaos());
                teacherView.showMessage("Sửa thành công!");
            }
        }
    }

    class DeleteLDListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Lanhdao lanhdao = teacherView.getLDInfo();
            if (lanhdao != null) {
                lanhdaoDao.delete(lanhdao);
                teacherView.clearLDInfo();
                teacherView.showListLD(lanhdaoDao.getListLanhdaos());
                teacherView.showMessage("Xóa thành công!");
            }
        }
    }

    class ClearLDListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teacherView.clearLDInfo();
        }
    }

    class ListLDSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            teacherView.fillLDFromSelectedRow();
        }
    }

    class SearchLDListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String criteria = teacherView.getSelectedTextLD();
            String value = teacherView.getSearchBoxLD();
            List<Lanhdao> list = new ArrayList<>();
            List<Lanhdao> oldlist = lanhdaoDao.getListLanhdaos();

            if ("".equals(value)) {
                teacherView.showListLD(oldlist);
            } else {
                switch (criteria) {
                    case "ID":
                        for (Lanhdao t : oldlist) {
                            if (t.getId() == Integer.parseInt(value)) {
                                list.add(t);
                            }
                        }
                        break;
                    case "Tên":
                        for (Lanhdao t : oldlist) {
                            if (t.getName().equals(value)) {
                                list.add(t);
                            }
                        }
                        break;
                    case "Quê quán":
                        for (Lanhdao t : oldlist) {
                            if (t.getAddress().equals(value))
                                list.add(t);

                        }
                        break;
                    case "Cấp bậc hàm":
                        for (Lanhdao t : oldlist) {
                            if (t.getCapbacham().equals(value))
                                list.add(t);
                        }
                        break;
                    case "Giới tính":
                        for (Lanhdao t : oldlist) {
                            if (t.getSex().equals(value))
                                list.add(t);
                        }
                        break;
                    default:
                        break;

                }
                teacherView.showListLD(list);
            }
        }
    }

    class SortLDByIDListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            lanhdaoDao.sortListLanhdaosByID();
            teacherView.showListLD(lanhdaoDao.getListLanhdaos());
        }
    }

    class SortLDByNameListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            lanhdaoDao.sortListLanhdaosByName();
            teacherView.showListLD(lanhdaoDao.getListLanhdaos());
        }
    }

    class SortLDByLevelListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            lanhdaoDao.sortListLanhdaosByCapbacham();
            teacherView.showListLD(lanhdaoDao.getListLanhdaos());
        }
    }

    class SortLDByRoleListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            lanhdaoDao.sortListLanhdaosByChucvu();
            teacherView.showListLD(lanhdaoDao.getListLanhdaos());
        }
    }
}
