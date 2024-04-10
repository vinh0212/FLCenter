/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.tad_sebs.View;

import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import vn.tad_sebs.Model.Data;

/**
 *
 * @author ASUS
 */
public class DataView extends javax.swing.JFrame {

    /**
     * Creates new form DataView
     */
    public DataView() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        btnEditData.setEnabled(false);
        btnDeleteData.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Datatable = new javax.swing.JTable();
        CbbSearchData = new javax.swing.JComboBox<>();
        FSearchData = new javax.swing.JTextField();
        btnSearchData = new javax.swing.JButton();
        btnSortbyIDData = new javax.swing.JButton();
        btnSortbyNameData = new javax.swing.JButton();
        FIDSearchData = new javax.swing.JTextField();
        FNameSearchData = new javax.swing.JTextField();
        FCategorySearch = new javax.swing.JTextField();
        FAuthorSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAddData = new javax.swing.JButton();
        btnDeleteData = new javax.swing.JButton();
        btnEditData = new javax.swing.JButton();
        btnClearData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Datatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên tài liệu", "Thể loại", "Tác giả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Datatable);

        CbbSearchData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên tài liệu", "Thể loại", "Tác giả" }));

        FSearchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSearchDataActionPerformed(evt);
            }
        });

        btnSearchData.setText("Tìm");
        btnSearchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDataActionPerformed(evt);
            }
        });

        btnSortbyIDData.setText("Sắp xếp theo ID");

        btnSortbyNameData.setText("Sắp xếp theo Tên");

        FIDSearchData.setEnabled(false);

        FAuthorSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAuthorSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Tên tài liệu");

        jLabel3.setText("Thể loại");

        jLabel4.setText("Tác giả");

        btnAddData.setText("Thêm");

        btnDeleteData.setText("Xóa");

        btnEditData.setText("Chỉnh sửa");

        btnClearData.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(CbbSearchData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FSearchData, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchData))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnSortbyIDData)
                        .addGap(18, 18, 18)
                        .addComponent(btnSortbyNameData))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddData)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteData)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditData)
                                .addGap(18, 18, 18)
                                .addComponent(btnClearData))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FNameSearchData, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FIDSearchData, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FAuthorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbbSearchData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FSearchData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchData))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FIDSearchData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(FNameSearchData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FAuthorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddData)
                            .addComponent(btnDeleteData)
                            .addComponent(btnEditData)
                            .addComponent(btnClearData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSortbyIDData)
                    .addComponent(btnSortbyNameData))
                .addGap(61, 61, 61))
        );

        setBounds(0, 0, 1376, 775);
    }// </editor-fold>//GEN-END:initComponents


    private void FSearchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSearchDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FSearchDataActionPerformed

    private void btnSearchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchDataActionPerformed

    private void FAuthorSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAuthorSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FAuthorSearchActionPerformed

    private String[] columnNamesData = new String[] {
            "ID", "Tên tài liệu", "Thể loại", "Tác giả"};

    public void showListData(List<Data> list) {
        int size = list.size();
        Object[][] data = new Object[size][4];
        for (int i = 0; i < size; i++) {
            data[i][0] = list.get(i).getId();
            data[i][1] = list.get(i).getName();
            data[i][2] = list.get(i).getCategory();
            data[i][3] = list.get(i).getAuthor();
        Datatable.setModel(new DefaultTableModel(data, columnNamesData));
    }
    }
    public void fillDataFromSelectedRow() {
        // lấy chỉ số của hàng được chọn
        int row = Datatable.getSelectedRow();
        if (row >= 0) {
            FIDSearchData.setText(Datatable.getModel().getValueAt(row, 0).toString());
            FNameSearchData.setText(Datatable.getModel().getValueAt(row, 1).toString());
            FCategorySearch.setText(Datatable.getModel().getValueAt(row, 2).toString());
            FAuthorSearch.setText(Datatable.getModel().getValueAt(row, 3).toString());
            // enable Edit and Delete buttons
            btnEditData.setEnabled(true);
            btnDeleteData.setEnabled(true);
            // disable Add button
            btnAddData.setEnabled(false);
        }
    }
    public void showData(Data data)
    {
        FIDSearchData.setText(String.valueOf(data.getId()));
        FNameSearchData.setText(data.getName());
        FCategorySearch.setText(data.getCategory());
        FAuthorSearch.setText(data.getAuthor());
        //enable Delete and edit button
        btnEditData.setEnabled(true);
        btnDeleteData.setEnabled(true);
        //disable Add button
        btnAddData.setEnabled(false);
    }
    public void clearDataInfo() {
        FIDSearchData.setText("");
        FNameSearchData.setText("");
        FCategorySearch.setText("");
        FAuthorSearch.setText("");
        // disable Edit and Delete buttons
        btnEditData.setEnabled(false);
        btnDeleteData.setEnabled(false);
        // enable Add button
        btnAddData.setEnabled(true);

        Datatable.clearSelection();
    }
    public void addAddDataListener(ActionListener listener) {
        btnAddData.addActionListener(listener);
    }

    public void addEditDataListener(ActionListener listener) {
        btnEditData.addActionListener(listener);
    }

    public void addDeleteDataListener(ActionListener listener) {
        btnDeleteData.addActionListener(listener);
    }

    public void addClearDataListener(ActionListener listener) {
        btnClearData.addActionListener(listener);
    }

    public void addListDataSelectionListener(ListSelectionListener listener) {
        Datatable.getSelectionModel().addListSelectionListener(listener);
    }

    public void addSearchDataListener(ActionListener listener) {
        btnSearchData.addActionListener(listener);
    }
    public void addSortDataByIDListener(ActionListener listener)
    {
       btnSortbyIDData.addActionListener(listener);
    }
    public void addSortDataByNameListener(ActionListener listener)
    {
        btnSortbyNameData.addActionListener(listener);
    }
    public String getDataSelectedText() {
        return CbbSearchData.getSelectedItem().toString();
    }
    
    public String getDataSearchBox()
    {
        return FSearchData.getText().trim();
    }
    

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    public Data getDataInfo()
    {
        if(!validateName() || !validateCategory() || !validateAuthor())
        {
            return null;
        }
        try
        {
            
            Data data = new Data();
            if(FIDSearchData.getText()!=null && !"".equals(FIDSearchData.getText()))
            {
                data.setId(Integer.parseInt(FIDSearchData.getText()));
            }

            data.setName(FNameSearchData.getText());
            data.setCategory(FCategorySearch.getText());
            data.setAuthor(FAuthorSearch.getText());
            return data;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
        
    }

    private boolean validateName()
    {
        if(FNameSearchData.getText().trim().equals(""))
        {
            FNameSearchData.requestFocus();
            showMessage("Tên tài liệu không được để trống");
            return false;
        }
        return true;
    }
    
    private boolean validateCategory()
    {
        if(FCategorySearch.getText().trim().equals(""))
        {
            FCategorySearch.requestFocus();
            showMessage("Thể loại không được để trống");
            return false;
        }
        return true;
    }

    private boolean validateAuthor()
    {
        if(FAuthorSearch.getText().trim().equals(""))
        {
            FAuthorSearch.requestFocus();
            showMessage("Tác giả không được để trống");
            return false;
        }
        return true;
    }



    public int getCriteria()
    {
        return CbbSearchData.getSelectedIndex();
    }

    public String getSearchValue()
    {
        return FSearchData.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbbSearchData;
    private javax.swing.JTable Datatable;
    private javax.swing.JTextField FAuthorSearch;
    private javax.swing.JTextField FCategorySearch;
    private javax.swing.JTextField FIDSearchData;
    private javax.swing.JTextField FNameSearchData;
    private javax.swing.JTextField FSearchData;
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnClearData;
    private javax.swing.JButton btnDeleteData;
    private javax.swing.JButton btnEditData;
    private javax.swing.JButton btnSearchData;
    private javax.swing.JButton btnSortbyIDData;
    private javax.swing.JButton btnSortbyNameData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}