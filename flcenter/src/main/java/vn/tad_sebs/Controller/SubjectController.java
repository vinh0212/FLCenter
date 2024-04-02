package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vn.tad_sebs.DAO.SubjectDAO;
import vn.tad_sebs.Model.Department;
import vn.tad_sebs.Model.Monhoc;
import vn.tad_sebs.Model.Teacher;
import vn.tad_sebs.View.MonView;

public class SubjectController {
    private MonView monView;
    private SubjectDAO subjectDAO;

    public SubjectController(MonView monView) {
        this.monView = monView;
        this.subjectDAO = new SubjectDAO();

        monView.addAddMonListener(new AddMonListener());
        monView.addEditMonListener(new EditMonListener());
        monView.addDeleteMonListener(new DeleteMonListener());
        monView.addClearMonListener(new ClearMonListener());
        monView.addSearchMonListener(new SearchMonListener());
        monView.addListMonSelectionListener(new MonSelectionListener());
        monView.addSortMonByIDListener(new  SortMonByIDListener());
        monView.addSortMonByNameListener(new SortMonByNameListener());
        monView.addSortMonByTinchiListener(new SortMonByTinchiListener());
    }

    public void showMonView()
    {
        List<Monhoc> subjectList = subjectDAO.getListSubjects();
        List<Department> departmentList = subjectDAO.getListDepartments();
        monView.showListDP(departmentList);
        monView.showListMon(subjectList);
        monView.setVisible(true);
    }

    class AddMonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Monhoc monhoc = monView.getMonInfo();
            if(monhoc != null)
            {
                subjectDAO.add(monhoc);
                monView.showMon(monhoc);
                monView.showListMon(subjectDAO.getListSubjects());
                monView.showMessage("Thêm môn học thành công!");
            }
        
        }
    }

    class EditMonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Monhoc monhoc = monView.getMonInfo();
            if(monhoc != null)
            {
                subjectDAO.edit(monhoc);
                monView.clearMonInfo();
                monView.showListMon(subjectDAO.getListSubjects());
                monView.showMessage("Sửa môn học thành công!");
            }
        }
    }

    class DeleteMonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Monhoc monhoc = monView.getMonInfo();
            if(monhoc != null)
            {
                subjectDAO.delete(monhoc);
                monView.clearMonInfo();
                monView.showListMon(subjectDAO.getListSubjects());
                monView.showMessage("Xóa môn học thành công!");
            }
        }
    }

    class ClearMonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            monView.clearMonInfo();
        }
    }

    class MonSelectionListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            monView.fillMonFromSelectedRow();
        }
    }

    class SearchMonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            String criteria = monView.getSelectedText();
            String value = monView.getSearchBox();
            List<Monhoc> list = new ArrayList<>();
            List<Monhoc> oldlist = subjectDAO.getListSubjects();
            if("".equals(value))
            {
                monView.showListMon(oldlist);
                return;
            }
            else
            {
                switch (criteria)
                {
                    case "ID":
                        for(Monhoc monhoc : oldlist)
                        {
                            if(monhoc.getId() == Integer.parseInt(value))
                            {
                                list.add(monhoc);
                            }
                        }
                        break;
                    case "Tên môn":
                        for(Monhoc monhoc : oldlist)
                        {
                            if(monhoc.getName().contains(value))
                            {
                                list.add(monhoc);
                            }
                        }
                        break;
                    case "Số tiết":
                        for(Monhoc monhoc : oldlist)
                        {
                            if(monhoc.getTinchi() == Integer.parseInt(value))
                            {
                                list.add(monhoc);
                            }
                        }
                        break;
                    case "Khoa":
                        for(Monhoc monhoc : oldlist)
                        {
                            if(monhoc.getKhoa() == Integer.parseInt(value))
                            {
                                list.add(monhoc);
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            monView.showListMon(list);

        }
    }

    class SortMonByIDListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            List<Monhoc> list = subjectDAO.getListSubjects();
            list.sort((Monhoc m1, Monhoc m2) -> m1.getId() - m2.getId());
            monView.showListMon(list);
        }
    }

    class SortMonByNameListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            List<Monhoc> list = subjectDAO.getListSubjects();
            list.sort((Monhoc m1, Monhoc m2) -> m1.getName().compareTo(m2.getName()));
            monView.showListMon(list);
        }
    }

    class SortMonByTinchiListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            List<Monhoc> list = subjectDAO.getListSubjects();
            list.sort((Monhoc m1, Monhoc m2) -> m1.getTinchi() - m2.getTinchi());
            monView.showListMon(list);
        }
    }
}
