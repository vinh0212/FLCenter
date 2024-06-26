/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.tad_sebs.View;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

import vn.tad_sebs.Controller.DHPController;
import vn.tad_sebs.Controller.EditController;
import vn.tad_sebs.Controller.MainController2;
import vn.tad_sebs.DAO.StudentDAO;
import vn.tad_sebs.Model.CourseFeeEntry;
import vn.tad_sebs.Model.Student;

/**
 *
 * @author ASUS
 */
public class SearchStudentView extends javax.swing.JFrame {

    private StudentDAO studentDAO;
    private List<Student> studentList;

    /**
     * Creates new form SearchStudentView
     * @param id
     */
    public SearchStudentView(int id) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        if (id == 0)
        {
            btnPick.setVisible(true);
            btnPrice.setVisible(false);
        }
        else
        {
            btnPick.setVisible(false);
            btnPrice.setVisible(true);
        }
        studentDAO = new StudentDAO();
        studentList = studentDAO.getListStudents();

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                MainView2 mainView = new MainView2();
                MainController2 mainController = new MainController2(mainView);
                mainController.showMainView2();
            }
        });
    }

    public void showList() {
        showListStudents(studentList);
    }

    public void removeWindowListener() {
        for (java.awt.event.WindowListener listener : this.getWindowListeners()) {
            this.removeWindowListener(listener);
        }
    }

    public void addWindowListener()
    {
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                MainView2 mainView = new MainView2();
                MainController2 mainController = new MainController2(mainView);
                mainController.showMainView2();
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStudentList = new javax.swing.JTable();
        btnPick = new javax.swing.JButton();
        btnPrice = new javax.swing.JButton();
        cbType = new javax.swing.JComboBox<>();
        txtSearchField = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TÌM KIẾM HỌC VIÊN");
        setIconImage(icon.getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 73));
        jLabel2.setText("TÌM KIẾM THÔNG TIN HỌC VIÊN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        tbStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Họ và tên", "Giới tính", "Quê quán"
            }
        ));
        tbStudentList.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(tbStudentList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 680, 420));

        btnPick.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnPick.setText("Chọn");
        btnPick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickActionPerformed(evt);
            }
        });
        getContentPane().add(btnPick, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 90, 30));

        btnPrice.setText("Chọn");
        btnPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPriceActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 90, 30));

        cbType.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Họ và tên", "Quê quán" }));
        getContentPane().add(cbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));
        getContentPane().add(txtSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 190, -1));

        btnFind.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Find.png"))); // NOI18N
        btnFind.setText("Tìm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/QLLH2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickActionPerformed

        int row = tbStudentList.getSelectedRow();
        if (row != -1) {
            // Get data from the selected row
            // Assuming the ID is in the first column
            String id = tbStudentList.getValueAt(row, 0).toString();
            removeWindowListener();
            // Do something with the selected data
            // For example, print the selected ID

            EditStudentView editStudentView = new EditStudentView();
            EditController editController = new EditController(editStudentView);
            editController.showEditView(id);

            this.dispose();



        }
    }//GEN-LAST:event_btnPickActionPerformed

    private void btnPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPriceActionPerformed
        int row = tbStudentList.getSelectedRow();
        if (row != -1) {
            // Get data from the selected row
            // Assuming the ID is in the first column
            String id = tbStudentList.getValueAt(row, 0).toString();
            boolean check = true;
            
            for (Student s : studentList) {
                if (s.getId() == Integer.parseInt(id)) {
                    for (CourseFeeEntry cfe : s.getCourseFeeMap()) {
                        if (cfe.getFee() == false) {
                            check = false;
                            break;
                        }
                    }
                }
            }

            if (check == true) {
                JOptionPane.showMessageDialog(this, "Học viên đã đóng học phí cho tất cả các khoá!");
                return;
            }
            removeWindowListener();
            DHPView dhpView = new DHPView();
            DHPController dhpController = new DHPController(dhpView);
            dhpController.showDHPView(Integer.parseInt(id));
            this.dispose();

        }
    }//GEN-LAST:event_btnPriceActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFindActionPerformed
        List<Student> list = new ArrayList<>();
        List<Student> oldList = studentList;
        int type = cbType.getSelectedIndex();
        String searchField = txtSearchField.getText();
        if ("".equals(searchField)) {
            showListStudents(oldList);
            return;
        }
        switch (type) {
            case 0:
                if (!validateIDSearch()) {
                    return;
                }
                for (Student s : oldList) {
                    if (s.getId() == Integer.parseInt(searchField)) {
                        list.add(s);
                    }
                }
                break;
            case 1:
                for (Student s : oldList) {
                    if (s.getName().toLowerCase().contains(searchField.toLowerCase())) {
                        list.add(s);
                    }
                }
                break;
            case 2:
                for (Student s : oldList) {
                    if (s.getAddress().toLowerCase().contains(searchField.toLowerCase())) {
                        list.add(s);
                    }
                }
                break;
            default:
                break;
        }

        showListStudents(list);

    }// GEN-LAST:event_btnFindActionPerformed

    /**
     * @param args the command line arguments
     */
    public int getSelectedType() {
        return cbType.getSelectedIndex();
    }
    ImageIcon icon = new ImageIcon((getClass().getResource("/vn/tad_sebs/icon/icon.png")));

    public String getSearchField() {
        return txtSearchField.getText();
    }

    private String[] colStrings = {"ID", "Họ và tên", "Giới tính", "Quê quán"};

    public void showListStudents(List<Student> studentList) {
        String[][] data = new String[studentList.size()][4];
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            data[i][0] = String.valueOf(student.getId());
            data[i][1] = student.getName();
            data[i][2] = student.getGioitinh();
            data[i][3] = student.getAddress();
        }
        tbStudentList.setModel(new javax.swing.table.DefaultTableModel(data, colStrings));
    }

    public boolean validateIDSearch() {
        String searchField = txtSearchField.getText();
        try {
            int id = Integer.parseInt(searchField);
            if (id < 0) {
                JOptionPane.showMessageDialog(this, "ID không hợp lệ");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID không hợp lệ");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnPick;
    private javax.swing.JButton btnPrice;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbStudentList;
    private javax.swing.JTextField txtSearchField;
    // End of variables declaration//GEN-END:variables
}
