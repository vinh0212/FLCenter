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

import vn.tad_sebs.Model.Department;
import vn.tad_sebs.Model.Monhoc;

public class MonView extends javax.swing.JFrame {

    /**
     * Creates new form MonView
     */
    public MonView() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        btnEditMon.setEnabled(false);
        btnDeleteMon.setEnabled(false);
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
        Montable = new javax.swing.JTable();
        FIDSearchMon = new javax.swing.JTextField();
        btnDeleteMon = new javax.swing.JButton();
        btnEditMon = new javax.swing.JButton();
        FNameSearchMon = new javax.swing.JTextField();
        FSoTietSearch = new javax.swing.JTextField();
        btnAddMon = new javax.swing.JButton();
        CbbSearchMon = new javax.swing.JComboBox<>();
        FSearchMon = new javax.swing.JTextField();
        btnSearchMon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnClearMon = new javax.swing.JButton();
        btnSortbyidMon = new javax.swing.JButton();
        btnSortbyNameMon = new javax.swing.JButton();
        btnSortbyTinchi = new javax.swing.JButton();
        cbDpEdit = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Montable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên môn", "Số tiết", "Khoa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        Montable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Montable.setShowGrid(false);
        Montable.setShowHorizontalLines(true);
        Montable.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(Montable);

        FIDSearchMon.setEnabled(false);
        FIDSearchMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIDSearchMonActionPerformed(evt);
            }
        });

        btnDeleteMon.setText("Xóa");
        btnDeleteMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMonActionPerformed(evt);
            }
        });

        btnEditMon.setText("Chỉnh sửa");
        btnEditMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMonActionPerformed(evt);
            }
        });

        btnAddMon.setText("Thêm");

        CbbSearchMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên môn", "Số tiết", "Khoa" }));

        btnSearchMon.setText("Tìm");
        btnSearchMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMonActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel4.setText("Số tiết");

        jLabel5.setText("Khoa");

        jLabel12.setText("Tên môn");

        btnClearMon.setText("Clear");

        btnSortbyidMon.setText("Sắp xếp theo ID");

        btnSortbyNameMon.setText("Sắp xếp theo Tên");

        btnSortbyTinchi.setText("Sắp xếp theo Số tiết");

        cbDpEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDpEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(CbbSearchMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FSearchMon, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchMon)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDeleteMon, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddMon, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditMon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearMon))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FSoTietSearch)
                            .addComponent(FNameSearchMon)
                            .addComponent(FIDSearchMon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbDpEdit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnSortbyidMon)
                .addGap(53, 53, 53)
                .addComponent(btnSortbyNameMon)
                .addGap(66, 66, 66)
                .addComponent(btnSortbyTinchi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbbSearchMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FSearchMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchMon))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FIDSearchMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FNameSearchMon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FSoTietSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbDpEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddMon)
                            .addComponent(btnEditMon)
                            .addComponent(btnDeleteMon)
                            .addComponent(btnClearMon))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSortbyidMon)
                    .addComponent(btnSortbyNameMon)
                    .addComponent(btnSortbyTinchi))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1410, 775);
    }// </editor-fold>//GEN-END:initComponents


    private void FIDSearchMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIDSearchMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIDSearchMonActionPerformed

    private void btnDeleteMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMonActionPerformed

    private void btnEditMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditMonActionPerformed

    private void btnSearchMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMonActionPerformed

    private void cbDpEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDpEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDpEditActionPerformed
    private String[] columnNamesMon = new String[] {
            "ID", "Tên môn", "Số tiết", "Khoa"};

    public void showListMon(List<Monhoc> list) {
        int size = list.size();
        Object[][] mon = new Object[size][4];
        for (int i = 0; i < size; i++) {
            mon[i][0] = list.get(i).getId();
            mon[i][1] = list.get(i).getName();
            mon[i][2] = list.get(i).getTinchi();
            mon[i][3] = list.get(i).getKhoa();
        }
        Montable.setModel(new DefaultTableModel(mon, columnNamesMon));
    }

    public void fillMonFromSelectedRow() {
        // lấy chỉ số của hàng được chọn
        int row = Montable.getSelectedRow();
        if (row >= 0) {
            FIDSearchMon.setText(Montable.getModel().getValueAt(row, 0).toString());
            FNameSearchMon.setText(Montable.getModel().getValueAt(row, 1).toString());
            FSoTietSearch.setText(Montable.getModel().getValueAt(row, 2).toString());
            cbDpEdit.setSelectedIndex(Integer.parseInt(Montable.getModel().getValueAt(row, 3).toString())-1);
            
            // enable Edit and Delete buttons
            btnEditMon.setEnabled(true);
            btnDeleteMon.setEnabled(true);
            // disable Add button
            btnAddMon.setEnabled(false);
        }
    }
    public void showMon(Monhoc mon)
    {
        FIDSearchMon.setText(String.valueOf(mon.getId()));
        FNameSearchMon.setText(mon.getName());
        FSoTietSearch.setText(String.valueOf(mon.getTinchi()));
        cbDpEdit.setSelectedIndex(mon.getKhoa() - 1);
        
        //enable Delete and edit button
        btnEditMon.setEnabled(true);
        btnDeleteMon.setEnabled(true);
        //disable Add button
        btnAddMon.setEnabled(false);
    }

    public void clearMonInfo() {
        FIDSearchMon.setText("");
        FNameSearchMon.setText("");
        FSoTietSearch.setText("");
        cbDpEdit.setSelectedIndex(0);
        
        // disable Edit and Delete buttons
        btnEditMon.setEnabled(false);
        btnDeleteMon.setEnabled(false);
        // enable Add button
        btnAddMon.setEnabled(true);

        Montable.clearSelection();
    }

    public void addAddMonListener(ActionListener listener) {
        btnAddMon.addActionListener(listener);
    }

    public void addEditMonListener(ActionListener listener) {
        btnEditMon.addActionListener(listener);
    }

    public void addDeleteMonListener(ActionListener listener) {
        btnDeleteMon.addActionListener(listener);
    }

    public void addClearMonListener(ActionListener listener) {
        btnClearMon.addActionListener(listener);
    }

    public void addListMonSelectionListener(ListSelectionListener listener) {
      Montable.getSelectionModel().addListSelectionListener(listener);
    }

    public void addSearchMonListener(ActionListener listener) {
        btnSearchMon.addActionListener(listener);
    }
    public void addSortMonByIDListener(ActionListener listener)
    {
        btnSortbyidMon.addActionListener(listener);
    }
    public void addSortMonByNameListener(ActionListener listener)
    {
        btnSortbyNameMon.addActionListener(listener);
    }
    public void addSortMonByTinchiListener(ActionListener listener)
    {
        btnSortbyTinchi.addActionListener(listener);
    }
    


    public String getSelectedText() {
        return CbbSearchMon.getSelectedItem().toString();
    }
    
    public String getSearchBox()
    {
        return FSearchMon.getText().trim();
    }
    

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    public Monhoc getMonInfo()
    {
        try
        {
            
            Monhoc mon = new Monhoc();
            if(FIDSearchMon.getText()!=null && !"".equals(FIDSearchMon.getText()))
            {
                mon.setId(Integer.parseInt(FIDSearchMon.getText()));
            }

            mon.setName(FNameSearchMon.getText());
            mon.setTinchi(Integer.parseInt(FSoTietSearch.getText()));
            mon.setKhoa(cbDpEdit.getSelectedIndex()+ 1);
            
            return mon;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
        
    }
    public void showListDP(List<Department> list)
    {
        int size = list.size();
        Object[][] departments = new Object[size][3];
        for (int i = 0; i < size; i++) {
            cbDpEdit.addItem(list.get(i).getId() + " - " + list.get(i).getName());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbbSearchMon;
    private javax.swing.JTextField FIDSearchMon;
    private javax.swing.JTextField FNameSearchMon;
    private javax.swing.JTextField FSearchMon;
    private javax.swing.JTextField FSoTietSearch;
    private javax.swing.JTable Montable;
    private javax.swing.JButton btnAddMon;
    private javax.swing.JButton btnClearMon;
    private javax.swing.JButton btnDeleteMon;
    private javax.swing.JButton btnEditMon;
    private javax.swing.JButton btnSearchMon;
    private javax.swing.JButton btnSortbyNameMon;
    private javax.swing.JButton btnSortbyTinchi;
    private javax.swing.JButton btnSortbyidMon;
    private javax.swing.JComboBox<String> cbDpEdit;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
