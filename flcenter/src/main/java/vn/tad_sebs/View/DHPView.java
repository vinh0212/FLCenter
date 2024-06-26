/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.tad_sebs.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;

import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import vn.tad_sebs.Model.CourseFeeEntry;
import vn.tad_sebs.Model.Lop;
import vn.tad_sebs.Model.Monhoc;
import vn.tad_sebs.Model.Student;

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
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        FIDSearchStudent.setEnabled(false);
        FNameSearchStudent.setEnabled(false);
        chkM.setEnabled(false);
        chkF.setEnabled(false);
        FAddressSearchStudent.setEnabled(false);
        AAA.setEnabled(false);

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                SearchStudentView searchStudentView = new SearchStudentView(1);
                searchStudentView.showList();
                searchStudentView.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        FIDSearchStudent = new javax.swing.JTextField();
        FNameSearchStudent = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chkM = new javax.swing.JCheckBox();
        chkF = new javax.swing.JCheckBox();
        FAddressSearchStudent = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPackageList = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbPrice = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        AAA = new javax.swing.JTextField();
        btnPay = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐÓNG HỌC PHÍ");
        setIconImage(icon.getImage());
        setResizable(false);
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

        buttonGroup1.add(chkM);
        chkM.setForeground(new java.awt.Color(255, 255, 255));
        chkM.setText("Nam");
        getContentPane().add(chkM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 80, -1));

        buttonGroup1.add(chkF);
        chkF.setForeground(new java.awt.Color(255, 255, 255));
        chkF.setText("Nữ");
        getContentPane().add(chkF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 70, -1));

        FAddressSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAddressSearchStudentActionPerformed(evt);
            }
        });
        getContentPane().add(FAddressSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 163, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 73));
        jLabel6.setText("Quê quán");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 80, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 73));
        jLabel4.setText("Ngày sinh");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 90, -1));

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

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 320, 180));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 73));
        jLabel11.setText("Khoá học đã đăng ký");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 190, -1));

        btnDelete.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnDelete.setText("<<");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        btnAdd.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAdd.setText(">>");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tổng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, 30));

        jTextField1.setText("0");
        jTextField1.setEnabled(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 90, 30));
        getContentPane().add(AAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 160, -1));

        btnPay.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Payy.png"))); // NOI18N
        btnPay.setText("Thanh toán");
        getContentPane().add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 130, 30));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 255, 73));
        jLabel18.setText("ĐÓNG HỌC PHÍ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/QLTL2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // move selection from tbPackageList to tbPrice (remove in tbPackageList and add to tbPrice)
        int selectedRow = tbPackageList.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tbPackageList.getModel();
            Object[] rowData = new Object[3];
            rowData[0] = model.getValueAt(selectedRow, 0);
            rowData[1] = model.getValueAt(selectedRow, 1);
            rowData[2] = model.getValueAt(selectedRow, 2);
            model.removeRow(selectedRow);

            DefaultTableModel modelPrice = (DefaultTableModel) tbPrice.getModel();
            modelPrice.addRow(rowData);
        }

        showPrice();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // move selection from tbPrice to tbPackageList (remove in tbPrice and add to tbPackageList)
        int selectedRow = tbPrice.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tbPrice.getModel();
            Object[] rowData = new Object[3];
            rowData[0] = model.getValueAt(selectedRow, 0);
            rowData[1] = model.getValueAt(selectedRow, 1);
            rowData[2] = model.getValueAt(selectedRow, 2);
            model.removeRow(selectedRow);

            DefaultTableModel modelPackage = (DefaultTableModel) tbPackageList.getModel();
            modelPackage.addRow(rowData);
        }
        if(tbPrice.getRowCount() != 0)
        {
            showPrice();
        }
        else 
        {
            jTextField1.setText("0");
        }
        


        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void FIDSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FIDSearchStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_FIDSearchStudentActionPerformed

    private void FAddressSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FAddressSearchStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_FAddressSearchStudentActionPerformed

    /**
     * @param args the command line arguments
     */

    private List<Lop> listLop;
    private List<CourseFeeEntry> courseFeeMap;
    private String[] columnPackageNames = { "ID", "Tên lớp", "Học phí" };

    public void getListLops(List<Lop> listLop) {
        this.listLop = listLop;
    }

    

    public void showStudent(Student student) {
        FIDSearchStudent.setText(String.valueOf(student.getId()));
        FNameSearchStudent.setText(student.getName());
        FAddressSearchStudent.setText(student.getAddress());

        if (student.getGioitinh().equals("Nam")) {
            chkM.setSelected(true);
        } else {
            chkF.setSelected(true);
        }
        
        AAA.setText(student.getDate());

        courseFeeMap = student.getCourseFeeMap();

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnPackageNames);

        for (CourseFeeEntry entry : courseFeeMap) {
            for (Lop lop : listLop) {
                if (lop.getId() == entry.getCourseId() && entry.getFee() == false) {
                    model.addRow(new Object[] {
                            lop.getId(), lop.getName(), lop.getPrice()
                    });
                    break;
                }
            }

        }
        tbPackageList.setModel(model);

        DefaultTableModel modelPrice = new DefaultTableModel();
        modelPrice.setColumnIdentifiers(columnPackageNames);
        tbPrice.setModel(modelPrice);

    }

    public List<CourseFeeEntry> getCFM()
    {
        //change entry getFee in courseFeeMap to true if it is in tbPrice
        for (int i = 0; i < tbPrice.getRowCount(); i++) {
            for (CourseFeeEntry entry : courseFeeMap) {
                if (entry.getCourseId() == Integer.parseInt(tbPrice.getValueAt(i, 0).toString())) {
                    entry.setFee(true);
                    break;
                }
            }
        }
        return courseFeeMap;
    }
    public void showMessage(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message);
    }
    
    public TableModel getTbPriceModel() {
        return tbPrice.getModel();
    }
    

    public void addTbPriceModelListener(TableModelListener listener) {
        tbPrice.getModel().addTableModelListener(listener);
    }

    public void addPayListener(java.awt.event.ActionListener listener) {
        btnPay.addActionListener(listener);
    }

    public void showPrice() {
        float total = 0;
        for (int i = 0; i < tbPrice.getRowCount(); i++) {
            total += Float.parseFloat(tbPrice.getValueAt(i, 2).toString());
        }
        jTextField1.setText(String.valueOf(total));
    }

    ImageIcon icon = new ImageIcon((getClass().getResource("/vn/tad_sebs/icon/icon.png")));
    public String getSum()
    {
        return jTextField1.getText();
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AAA;
    private javax.swing.JTextField FAddressSearchStudent;
    private javax.swing.JTextField FIDSearchStudent;
    private javax.swing.JTextField FNameSearchStudent;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPay;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkF;
    private javax.swing.JCheckBox chkM;
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
