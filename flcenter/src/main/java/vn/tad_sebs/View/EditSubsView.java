/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.tad_sebs.View;

import java.util.ArrayList;
import java.util.List;

import vn.tad_sebs.Model.Monhoc;

/**
 *
 * @author Sebs
 */
public class EditSubsView extends javax.swing.JFrame {

    /**
     * Creates new form EditSubsView
     */
    public EditSubsView() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbPullList = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPushList = new javax.swing.JTable();
        btnDone = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbPullList.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane1.setViewportView(tbPullList);

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tbPushList.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane2.setViewportView(tbPushList);

        btnDone.setText("Xong!");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnAdd)
                                                        .addComponent(btnDelete))
                                                .addGap(27, 27, 27)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(btnDone)
                                                        .addGap(82, 82, 82)))
                                .addContainerGap(40, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jScrollPane2,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 365,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                                Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(147, 147, 147)
                                                .addComponent(btnAdd)
                                                .addGap(32, 32, 32)
                                                .addComponent(btnDelete)))
                                .addGap(18, 18, 18)
                                .addComponent(btnDone)
                                .addContainerGap(43, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
        // move selection from pushlist to pulllist
        int selectedRow = tbPushList.getSelectedRow();
        if (selectedRow != -1) {
            Monhoc monhoc = new Monhoc();
            monhoc.setId((int) tbPushList.getValueAt(selectedRow, 0));
            monhoc.setName((String) tbPushList.getValueAt(selectedRow, 1));
            monhoc.setTinchi((int) tbPushList.getValueAt(selectedRow, 2));
            monhoc.setKhoa((int) tbPushList.getValueAt(selectedRow, 3));
            editedList.add(monhoc);
            putdata();
        }
    }// GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteActionPerformed
        // move selection from pulllist to pushlist
        int selectedRow = tbPullList.getSelectedRow();
        if (selectedRow != -1) {
            
            int id = Integer.parseInt(tbPullList.getValueAt(selectedRow, 0).toString());
            Monhoc monhoc = editedList.stream().filter(m -> m.getId() == id).findFirst().get();
            
            editedList.remove(monhoc);
            putdata();
        }
    }// GEN-LAST:event_btnDeleteActionPerformed

    public interface DoneListener {
        void onDone(List<Monhoc> editedList);
    }

    private DoneListener listener;

    public void addDoneListener(DoneListener listener) {
        this.listener = listener;
    }

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDoneActionPerformed
        if (listener != null) {
            listener.onDone(editedList);
        }
        this.dispose();
    }// GEN-LAST:event_btnDoneActionPerformed

    /**
     * @param args the command line arguments
     */

    private List<Monhoc> editedList;
    private List<Monhoc> originalList;

    public void getEditedList(List<Monhoc> editedList) {
        this.editedList = editedList;
    }

    public void getOriginalList(List<Monhoc> originalList) {
        this.originalList = originalList;
    }

    public void putdata() {
        List<Monhoc> pushList = new ArrayList<>(originalList);
        List<Monhoc> pullList = editedList;
        if (pullList != null) {// get pushlist monhoc not available in editedList
            for (Monhoc monhoc : editedList) {
                pushList.removeIf(m -> m.getId() == monhoc.getId());
            }

        }

        // push data to table
        Object[][] data = new Object[pushList.size()][4];
        for (int i = 0; i < pushList.size(); i++) {
            data[i][0] = pushList.get(i).getId();
            data[i][1] = pushList.get(i).getName();
            data[i][2] = pushList.get(i).getTinchi();
            data[i][3] = pushList.get(i).getKhoa();
        }
        tbPushList.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[] {
                        "ID", "Tên môn học", "Số tín chỉ", "Khoa"
                }));
        if (pullList != null) {
            Object[][] data2 = new Object[pullList.size()][4];
            for (int i = 0; i < pullList.size(); i++) {
                data2[i][0] = pullList.get(i).getId();
                data2[i][1] = pullList.get(i).getName();
                data2[i][2] = pullList.get(i).getTinchi();
                data2[i][3] = pullList.get(i).getKhoa();
            }
            tbPullList.setModel(new javax.swing.table.DefaultTableModel(
                    data2,
                    new String[] {
                            "ID", "Tên môn học", "Số tín chỉ", "Khoa"
                    }));
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbPullList;
    private javax.swing.JTable tbPushList;
    // End of variables declaration//GEN-END:variables
}
