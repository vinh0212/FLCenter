/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.tad_sebs.View;

/**
 *
 * @author ASUS
 */
public class EditStudentView extends javax.swing.JFrame {

    /**
     * Creates new form EditStudentView
     */
    public EditStudentView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        FIDSearchStudent = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        FNameSearchStudent = new javax.swing.JTextField();
        FDateSearchStudent = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chkM = new javax.swing.JCheckBox();
        chkF = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        FAddressSearchStudent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPackageList = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        listMonhoc = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        cbSelectedGV = new javax.swing.JComboBox<>();
        btnGVSave = new javax.swing.JButton();
        BtnEditStudent = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 225, 73));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 30, -1));

        FIDSearchStudent.setEnabled(false);
        FIDSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIDSearchStudentActionPerformed(evt);
            }
        });
        getContentPane().add(FIDSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 80, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 73));
        jLabel12.setText("Họ và tên");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, -1));
        getContentPane().add(FNameSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 163, 22));

        FDateSearchStudent.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(FDateSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 163, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 73));
        jLabel4.setText("Ngày sinh");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 90, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 73));
        jLabel10.setText("Giới tính");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 70, -1));

        chkM.setBackground(new java.awt.Color(0, 0, 0));
        chkM.setForeground(new java.awt.Color(255, 255, 255));
        chkM.setText("Nam");
        chkM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMActionPerformed(evt);
            }
        });
        getContentPane().add(chkM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 80, -1));

        chkF.setBackground(new java.awt.Color(0, 0, 0));
        chkF.setForeground(new java.awt.Color(255, 255, 255));
        chkF.setText("Nữ");
        getContentPane().add(chkF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 70, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 73));
        jLabel6.setText("Quê quán");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 80, -1));

        FAddressSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAddressSearchStudentActionPerformed(evt);
            }
        });
        getContentPane().add(FAddressSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 163, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 73));
        jLabel1.setText("Đăng ký khóa học");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        btnConfirm.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Add.png"))); // NOI18N
        btnConfirm.setText("Thêm");
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 73));
        jLabel11.setText("Khoá học đã đăng ký");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 190, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 255, 73));
        jLabel13.setText("Giáo viên được chọn");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 190, -1));

        tbPackageList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbPackageList);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 280, 250));

        listMonhoc.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listMonhoc);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 110, 160));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 73));
        jLabel5.setText("-->");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 30, -1));

        cbSelectedGV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbSelectedGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 140, 70));

        btnGVSave.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnGVSave.setText("Lưu");
        btnGVSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGVSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnGVSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));

        BtnEditStudent.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnEditStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Edit.png"))); // NOI18N
        BtnEditStudent.setText("Chỉnh sửa");
        BtnEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditStudentActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEditStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 73));
        jLabel3.setText("CHỈNH SỬA THÔNG TIN HỌC VIÊN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/QLCB2.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 760, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FIDSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIDSearchStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIDSearchStudentActionPerformed

    private void FAddressSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAddressSearchStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FAddressSearchStudentActionPerformed

    private void btnGVSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGVSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGVSaveActionPerformed

    private void BtnEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEditStudentActionPerformed

    private void chkMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStudentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditStudent;
    private javax.swing.JTextField FAddressSearchStudent;
    private com.toedter.calendar.JDateChooser FDateSearchStudent;
    private javax.swing.JTextField FIDSearchStudent;
    private javax.swing.JTextField FNameSearchStudent;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnGVSave;
    private javax.swing.JComboBox<String> cbSelectedGV;
    private javax.swing.JCheckBox chkF;
    private javax.swing.JCheckBox chkM;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listMonhoc;
    private javax.swing.JTable tbPackageList;
    // End of variables declaration//GEN-END:variables
}
