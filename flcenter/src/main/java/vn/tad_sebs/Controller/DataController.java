package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vn.tad_sebs.DAO.DataDAO;
import vn.tad_sebs.Model.Data;
import vn.tad_sebs.View.DataView;

public class DataController {

    private DataView dataView;
    private DataDAO dataDao;

    public DataController(DataView dataView) {
        this.dataView = dataView;
        dataDao = new DataDAO();
        dataView.addAddDataListener(new AddDataListener());
        dataView.addEditDataListener(new EditDataListener());
        dataView.addDeleteDataListener(new DeleteDataListener());
        dataView.addClearDataListener(new ClearDataListener());
        dataView.addSearchDataListener(new SearchDataListener());
        dataView.addListDataSelectionListener(new ListDataSelectionListener());
        dataView.addSortDataByIDListener(new SortDataByID());
        dataView.addSortDataByNameListener(new SortDataByName());
    }

    public void showDataView() {
        List<Data> dataList = dataDao.getListDatas();
        dataView.showListData(dataList);
        dataView.setVisible(true);
    }

    class AddDataListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Data data = dataView.getDataInfo();
            if (data != null) {
                dataDao.add(data);
                dataView.showData(data);
                dataView.showListData(dataDao.getListDatas());
                dataView.showMessage("Thêm thành công!");
            }

        }
    }

    class EditDataListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Data data = dataView.getDataInfo();
            if (data != null) {
                dataDao.edit(data);
                dataView.clearDataInfo();
                dataView.showListData(dataDao.getListDatas());
                dataView.showMessage("Sửa thành công!");
            }

        }
    }

    class DeleteDataListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Data data = dataView.getDataInfo();
            if (data != null) {
                dataDao.delete(data);
                dataView.clearDataInfo();
                dataView.showListData(dataDao.getListDatas());
                dataView.showMessage("Xóa thành công!");
            }

        }
    }

    class ClearDataListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            dataView.clearDataInfo();
        }
    }

    class ListDataSelectionListener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
            dataView.fillDataFromSelectedRow();
        }
    }

    class SearchDataListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String value = dataView.getSearchValue();
            String criteria = dataView.getCriteria();
            List<Data> listData = new ArrayList<Data>();
            List<Data> oldlist = dataDao.getListDatas();
            if ("".equals(value)) {
                dataView.showListData(dataDao.getListDatas());
                return;

            } else {

                switch (criteria) {
                    case "ID":
                        if (!dataView.validateID()) {
                            return;
                        }
                        for (Data data : oldlist) {
                            if (data.getId() == Integer.parseInt(value)) {
                                listData.add(data);
                            }
                        }
                        break;
                    case "Tên tài liệu":
                        for (Data data : oldlist) {
                            if (data.getName().toLowerCase().contains(value.toLowerCase())) {
                                listData.add(data);
                            }
                        }
                        break;
                    case "Thể loại":
                        for (Data data : oldlist) {
                            
                            if (data.getCategory().toLowerCase().contains(value.toLowerCase())) {
                                listData.add(data);
                            }
                        }
                        break;
                    case "Tác giả":
                        for (Data data : oldlist) {
                            if (data.getAuthor().toLowerCase().contains(value.toLowerCase())) {
                                listData.add(data);
                            }
                        }
                        break;
                    default:
                        break;
                }
                dataView.showListData(listData);
                if (listData.isEmpty()) {
                    dataView.showMessage("Không tìm thấy!");
                    dataView.showListData(oldlist);
                }

            }

        }
    }

    class SortDataByID implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            dataDao.sortByID();
            dataView.showListData(dataDao.getListDatas());
        }
    }

    class SortDataByName implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            dataDao.sortByName();
            dataView.showListData(dataDao.getListDatas());
        }
    }
}
