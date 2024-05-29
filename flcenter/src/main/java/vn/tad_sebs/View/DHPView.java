/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.tad_sebs.View;

/**
 *
 * @author ASUS
 */
public class DHPView extends javax.swing.JFrame {

    /**
     * Creates new form DHPView
     */
    public DHPView() {
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
        FNameSearchStudent = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chkM = new javax.swing.JCheckBox();
        chkF = new javax.swing.JCheckBox();
        FDateSearchStudent = new com.toedter.calendar.JDateChooser();
        FAddressSearchStudent = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPackageList = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbPrice = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 225, 73));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 30, -1));

        FIDSearchStudent.setEnabled(false);
        FIDSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIDSearchStudentActionPerformed(evt);
            }
        });
        getContentPane().add(FIDSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 80, -1));
        getContentPane().add(FNameSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 163, 22));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 73));
        jLabel12.setText("Họ và tên");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 80, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 73));
        jLabel10.setText("Giới tính");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 70, -1));

        chkM.setForeground(new java.awt.Color(255, 255, 255));
        chkM.setText("Nam");
        getContentPane().add(chkM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 80, -1));

        chkF.setForeground(new java.awt.Color(255, 255, 255));
        chkF.setText("Nữ");
        getContentPane().add(chkF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 70, -1));

        FDateSearchStudent.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(FDateSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 163, -1));

        FAddressSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAddressSearchStudentActionPerformed(evt);
            }
        });
        getContentPane().add(FAddressSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 163, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 73));
        jLabel6.setText("Quê quán");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 80, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 73));
        jLabel4.setText("Ngày sinh");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 90, -1));

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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 280, 250));

        tbPrice.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tbPrice);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 280, 180));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 73));
        jLabel11.setText("Khoá học đã đăng ký");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 190, -1));

        jButton3.setText("<<");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        jButton1.setText(">>");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        jLabel3.setText("Tổng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 90, 30));

        jButton2.setText("Thanh toán");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 255, 73));
        jLabel18.setText("ĐÓNG HỌC PHÍ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/QLTL2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FIDSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIDSearchStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIDSearchStudentActionPerformed

    private void FAddressSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAddressSearchStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FAddressSearchStudentActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FAddressSearchStudent;
    private com.toedter.calendar.JDateChooser FDateSearchStudent;
    private javax.swing.JTextField FIDSearchStudent;
    private javax.swing.JTextField FNameSearchStudent;
    private javax.swing.JCheckBox chkF;
    private javax.swing.JCheckBox chkM;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbPackageList;
    private javax.swing.JTable tbPrice;
    // End of variables declaration//GEN-END:variables
}
