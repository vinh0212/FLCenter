/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.tad_sebs.View;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.*;
import java.awt.*;

import vn.tad_sebs.Controller.MainController;
import vn.tad_sebs.Model.Lop;
import vn.tad_sebs.Model.Monhoc;
import vn.tad_sebs.Model.Student;
import vn.tad_sebs.View.ClassStat;

/**
 *
 * @author Sebs
 */
public class ClassView extends javax.swing.JFrame {

    /**
     * Creates new form ClassView
     */
    public ClassView() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        btnEditClass.setEnabled(false);
        btnDeleteClass.setEnabled(false);

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                MainView mainView = new MainView();
                MainController mainController = new MainController(mainView);
                mainController.showMainView();
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClassList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        cbLength = new javax.swing.JComboBox<>();
        btnEditSubsList = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbSubsList = new javax.swing.JTable();
        txtIDClass = new javax.swing.JTextField();
        txtNameClass = new javax.swing.JTextField();
        txtSLClass = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNoteClass = new javax.swing.JTextArea();
        btnAddClass = new javax.swing.JButton();
        btnEditClass = new javax.swing.JButton();
        btnDeleteClass = new javax.swing.JButton();
        btnClearClass = new javax.swing.JButton();
        btnSortbyIDClass = new javax.swing.JButton();
        btnSortbySLClass = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnStatNum = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbListStudents = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        cbChonlop = new javax.swing.JComboBox<>();
        btnSortbyIDCL = new javax.swing.JButton();
        btnSortbyNameCL = new javax.swing.JButton();
        btnSortbyPtsCL = new javax.swing.JButton();
        cbFind = new javax.swing.JComboBox<>();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ LỚP HỌC");
        setForeground(new java.awt.Color(0, 0, 0));
        setIconImage(icon.getImage());
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbClassList.setBackground(new java.awt.Color(102, 204, 255));
        tbClassList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên lớp", "Số lượng học viên", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        tbClassList.setShowGrid(false);
        tbClassList.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(tbClassList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 18, 600, 590));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 73));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 73));
        jLabel2.setText("Số lượng học viên");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 73));
        jLabel3.setText("Thời gian");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 73));
        jLabel4.setText("Tên khoá");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 73));
        jLabel6.setText("Giá");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 73));
        jLabel7.setText("Danh sách môn học");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 73));
        jLabel8.setText("Ghi chú");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 220, 220, -1));

        cbLength.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 tháng", "2 tháng", "3 tháng", "6 tháng", "1 năm" }));
        jPanel1.add(cbLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 130, 220, -1));

        btnEditSubsList.setText("Sửa danh sách");
        jPanel1.add(btnEditSubsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, -1));

        tbSubsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên môn", "Khoa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbSubsList);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 250, 160));

        txtIDClass.setEnabled(false);
        jPanel1.add(txtIDClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 80, -1));

        txtNameClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameClassActionPerformed(evt);
            }
        });
        jPanel1.add(txtNameClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 570, -1));

        txtSLClass.setEnabled(false);
        jPanel1.add(txtSLClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, 80, -1));

        txtNoteClass.setColumns(20);
        txtNoteClass.setRows(5);
        jScrollPane2.setViewportView(txtNoteClass);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 570, 120));

        btnAddClass.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAddClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Add.png"))); // NOI18N
        btnAddClass.setText("Thêm");
        jPanel1.add(btnAddClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, -1, -1));

        btnEditClass.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnEditClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Edit.png"))); // NOI18N
        btnEditClass.setText("Chỉnh Sửa");
        jPanel1.add(btnEditClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 420, -1, -1));

        btnDeleteClass.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnDeleteClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Delete.png"))); // NOI18N
        btnDeleteClass.setText("Xoá");
        jPanel1.add(btnDeleteClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 420, -1, -1));

        btnClearClass.setFont(new java.awt.Font("VnTimes", 1, 14)); // NOI18N
        btnClearClass.setText("C");
        jPanel1.add(btnClearClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 420, -1, -1));

        btnSortbyIDClass.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSortbyIDClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Sort.png"))); // NOI18N
        btnSortbyIDClass.setText("Sắp xếp theo ID");
        jPanel1.add(btnSortbyIDClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, 170, 70));

        btnSortbySLClass.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSortbySLClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Sort.png"))); // NOI18N
        btnSortbySLClass.setText("Sắp xếp theo Số lượng học viên");
        jPanel1.add(btnSortbySLClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 470, 250, 70));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 510, 14));

        btnStatNum.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnStatNum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/chart.png"))); // NOI18N
        btnStatNum.setText("Thống kê số lượng học viên");
        btnStatNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatNumActionPerformed(evt);
            }
        });
        jPanel1.add(btnStatNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 440, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/QLLH2.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1370, 660));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/QLKT2.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1340, 630));

        jTabbedPane1.addTab("Danh sách khoá học", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbListStudents.setBackground(new java.awt.Color(102, 204, 255));
        tbListStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ và tên", "Giới tính", "Quê quán", "Điểm số"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbListStudents);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 97, 890, 520));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 1364, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, 450, 10));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 73));
        jLabel5.setText("Chọn lớp:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        cbChonlop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonlopActionPerformed(evt);
            }
        });
        jPanel2.add(cbChonlop, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 18, 386, 34));

        btnSortbyIDCL.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSortbyIDCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Sort.png"))); // NOI18N
        btnSortbyIDCL.setText("Sắp xếp theo ID");
        jPanel2.add(btnSortbyIDCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, 220, 70));

        btnSortbyNameCL.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSortbyNameCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Sort.png"))); // NOI18N
        btnSortbyNameCL.setText("Sắp xếp theo Tên");
        btnSortbyNameCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortbyNameCLActionPerformed(evt);
            }
        });
        jPanel2.add(btnSortbyNameCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 410, 220, 80));

        btnSortbyPtsCL.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSortbyPtsCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Sort.png"))); // NOI18N
        btnSortbyPtsCL.setText("Sắp xếp theo Điểm số");
        btnSortbyPtsCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortbyPtsCLActionPerformed(evt);
            }
        });
        jPanel2.add(btnSortbyPtsCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, 220, 80));

        cbFind.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbFind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên", "Quê quán" }));
        jPanel2.add(cbFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, -1, -1));

        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFindKeyPressed(evt);
            }
        });
        jPanel2.add(txtFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 100, 150, 30));

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Find.png"))); // NOI18N
        btnFind.setText("Tìm kiếm");
        jPanel2.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(1243, 100, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/QLLH2.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1370, 660));

        jTabbedPane1.addTab("Quản lý học viên từng khoá", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        setSize(new java.awt.Dimension(1380, 701));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton1ActionPerformed

    private void btnStatNumActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnStatNumActionPerformed
        ClassStat classStat = new ClassStat();
        classStat.getTable(getTBListLops());

        classStat.action2();
    }// GEN-LAST:event_btnStatNumActionPerformed

    private void txtFindKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtFindKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnFind.doClick();
        }
    }// GEN-LAST:event_txtFindKeyPressed

    private void btnSortbyPtsCLActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSortbyPtsCLActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnSortbyPtsCLActionPerformed

    private void btnSortbyNameCLActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSortbyNameCLActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnSortbyNameCLActionPerformed

    private void txtPointActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPointActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPointActionPerformed

    private void cbChonlopActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbChonlopActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cbChonlopActionPerformed

    private void txtSubinClassActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSubinClassActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtSubinClassActionPerformed

    private void txtNameClassActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNameClassActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNameClassActionPerformed

    private void btnStatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnStatActionPerformed
        ClassStat classStat = new ClassStat();
        classStat.getTable(getTBListStudents());

        classStat.action();
    }// GEN-LAST:event_btnStatActionPerformed

    private void btnSortbyPtsCTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSortbyPtsCTActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnSortbyPtsCTActionPerformed

    private void btnSortbyNameCTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSortbyNameCTActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnSortbyNameCTActionPerformed

    public void addAddClassListener(ActionListener listener) {
        btnAddClass.addActionListener(listener);
    }

    public void addEditClassListener(ActionListener listener) {
        btnEditClass.addActionListener(listener);
    }

    public void addDeleteClassListener(ActionListener listener) {
        btnDeleteClass.addActionListener(listener);
    }

    public void addClearClassListener(ActionListener listener) {
        btnClearClass.addActionListener(listener);
    }

    public void addSortClassbyIDListener(ActionListener listener) {
        btnSortbyIDClass.addActionListener(listener);
    }

    public void addSortClassbySLListener(ActionListener listener) {
        btnSortbySLClass.addActionListener(listener);
    }

    public void addCbChonlopListener(ActionListener listener) {
        cbChonlop.addActionListener(listener);
    }

    public void addFindStudentListener(ActionListener listener) {
        btnFind.addActionListener(listener);
    }

    

    public void addSortCLbyIDListener(ActionListener listener) {
        btnSortbyIDCL.addActionListener(listener);
    }

    public void addSortCLbyNameListener(ActionListener listener) {
        btnSortbyNameCL.addActionListener(listener);
    }

    public void addSortCLbyPtsListener(ActionListener listener) {
        btnSortbyPtsCL.addActionListener(listener);
    }

    public void addListTBClassSelectionListener(ListSelectionListener listener) {
        tbClassList.getSelectionModel().addListSelectionListener(listener);
    }

    public void addListTBStudentSelectionListener(ListSelectionListener listener) {
        tbListStudents.getSelectionModel().addListSelectionListener(listener);
    }

    public void addTabChangeListener(ChangeListener listener) {
        jTabbedPane1.addChangeListener(listener);
    }

    public void addEditSubsListListener(ActionListener listener) {
        btnEditSubsList.addActionListener(listener);
    }

    private String[] columnNamesClassList = new String[] {
            "ID", "Tên lớp", "Số lượng học viên", "Ghi chú"
    };

    public void showClassList(List<Lop> listLops) {
        if (listLops != null) {
            int size = listLops.size();

            Object[][] data = new Object[size][4];

            for (int i = 0; i < size; i++) {
                data[i][0] = listLops.get(i).getId();
                data[i][1] = listLops.get(i).getName();
                if (listLops.get(i).getIdStudent() == null) {
                    data[i][2] = 0;
                } else {
                    data[i][2] = listLops.get(i).getIdStudent().size();
                }
                data[i][3] = listLops.get(i).getNote();
            }

            tbClassList.setModel(new DefaultTableModel(data, columnNamesClassList));
        }

    }

    private String[] columnNamesStudentList = new String[] {
            "ID", "Họ và tên", "Giới tính", "Quê quán"
    };

    public Lop getLopInfo() {
        if (!validateName()) {
            return null;
        }
        try {
            Lop lop = new Lop();
            if (txtIDClass.getText() != null && !"".equals(txtIDClass.getText())) {
                lop.setId(Integer.parseInt(txtIDClass.getText()));
            }

            lop.setName(txtNameClass.getText());
            lop.setNote(txtNoteClass.getText());
            if ("".equals(txtSLClass.getText())) {
                lop.setIdStudent(new ArrayList<>());
                lop.setIdMonhoc(new ArrayList<>());
            }
            

            //get tbSubsList the ID of subject to idMonhoc

            DefaultTableModel model = (DefaultTableModel) tbSubsList.getModel();
            int size = model.getRowCount();
            List<Integer> idMonhoc = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                idMonhoc.add((Integer) model.getValueAt(i, 0));
            }
            lop.setIdMonhoc(idMonhoc);

            lop.setPrice(Float.parseFloat(txtPrice.getText()));
            lop.setLength(cbLength.getSelectedItem().toString());


            return lop;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public boolean validateID() {
        String searchBox = txtFind.getText();
        try {
            int id = Integer.parseInt(searchBox);
            if (id < 0) {
                showMessage("ID không hợp lệ");
                return false;
            }
        } catch (NumberFormatException ex) {
            showMessage("ID không hợp lệ");
            return false;
        }
        return true;
    }

    private boolean validateName() {
        String name = txtNameClass.getText();
        if (name == null || name.isEmpty()) {
            txtNameClass.requestFocus();
            showMessage("Tên lớp không được để trống");
            return false;
        }
        return true;
    }

    

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void clearClassInfo() {
        txtIDClass.setText("");
        txtNameClass.setText("");
        txtSLClass.setText("");
        txtNoteClass.setText("");
        txtPrice.setText("");
        cbLength.setSelectedIndex(0);
        DefaultTableModel model = (DefaultTableModel) tbSubsList.getModel();
        model.setRowCount(0);
        
        // disable Edit and Delete buttons
        btnEditClass.setEnabled(false);
        btnDeleteClass.setEnabled(false);
        // enable Add button
        btnAddClass.setEnabled(true);

        tbClassList.clearSelection();
    }

    ImageIcon icon = new ImageIcon((getClass().getResource("/vn/tad_sebs/icon/icon.png")));

    private String[] columnNamesSubsList = new String[] {
        "ID", "Tên môn", "Khoa"
};

    private List<Monhoc> listMonhoc;

    public void getListMonhoc(List<Monhoc> monhocs)
    {   
        listMonhoc = monhocs;
    } 

    public int getSelectedClass()
    {
        return tbClassList.getSelectedRow();
    }
    public void showClass(Lop lop) {

        txtIDClass.setText(String.valueOf(lop.getId()));
        txtNameClass.setText(lop.getName());
        if(lop.getIdStudent() == null)
        {
            txtSLClass.setText("0");
        }
        else {
            txtSLClass.setText(String.valueOf(lop.getIdStudent().size()));
        }
        
        txtNoteClass.setText(lop.getNote());
        //get info of lop.idMonhoc() to tbSubsList
        if(lop.getIdMonhoc() != null)
        {
            int size = lop.getIdMonhoc().size();
            Object[][] data = new Object[size][3];
            for (int i = 0; i < size; i++) {
                for (Monhoc m : listMonhoc)
                {
                    if(m.getId() == lop.getIdMonhoc().get(i))
                    {
                        data[i][0] = m.getId();
                        data[i][1] = m.getName();
                        data[i][2] = m.getKhoa();
                    }
                }   
            }
            tbSubsList.setModel(new DefaultTableModel(data, columnNamesSubsList));
        }
        
        txtPrice.setText(String.valueOf(lop.getPrice()));
        cbLength.setSelectedItem(lop.getLength());
        

        // enable Edit and Delete buttons
        btnEditClass.setEnabled(true);
        btnDeleteClass.setEnabled(true);
        // disable Add button
        btnAddClass.setEnabled(false);

    }

    public JComboBox getCbChonlop() {
        return cbChonlop;
    }

    public void resetforTab2() {

        tbListStudents.clearSelection();

    }

    public void resetforTab1() {
        txtIDClass.setText("");
        txtNameClass.setText("");
        txtSLClass.setText("");
        txtNoteClass.setText("");
        txtPrice.setText("");
        cbLength.setSelectedIndex(0);
        DefaultTableModel model = (DefaultTableModel) tbSubsList.getModel();
        model.setRowCount(0);
        tbClassList.clearSelection();
        // disable Edit and Delete buttons
        btnEditClass.setEnabled(false);
        btnDeleteClass.setEnabled(false);
        // enable Add button
        btnAddClass.setEnabled(true);
    }

    public void showClassListinCbChonlop(List<Lop> listLops) {
        if (listLops != null)
            for (Lop lop : listLops) {
                cbChonlop.addItem(lop.getId() + " - " + lop.getName());
            }
    }

    public int getClassChoice() {

        String val = cbChonlop.getSelectedItem().toString();
        int index = val.indexOf(" - ");
        return Integer.parseInt(val.substring(0, index));

    }

    public void showStudentList(List<Student> listStudents) {
        int size = listStudents.size();
        Object[][] data = new Object[size][4];

        for (int i = 0; i < size; i++) {
            data[i][0] = listStudents.get(i).getId();
            data[i][1] = listStudents.get(i).getName();
            data[i][2] = listStudents.get(i).getGioitinh();
            data[i][3] = listStudents.get(i).getAddress();

        }

        tbListStudents.setModel(new DefaultTableModel(data, columnNamesStudentList));
    }

    public void showListCl(List<Lop> list) {
        int size = list.size();
        Object[][] data = new Object[size][5];
        for (int i = 0; i < size; i++) {
            cbChonlop.addItem(list.get(i).getId() + " - " + list.get(i).getName());
        }

    }

    public TableModel getTBListStudents() {
        // Get the original table model
        TableModel originalModel = tbListStudents.getModel();

        // Create a new table model for the score distribution
        DefaultTableModel distributionModel = new DefaultTableModel(new Object[] { "Range", "Count" }, 0);

        // Create an array to count the score distribution
        int[] distribution = new int[10];

        // Count the score distribution
        for (int i = 0; i < originalModel.getRowCount(); i++) {
            float score = Float.parseFloat(originalModel.getValueAt(i, 4).toString()); // replace 4 with the column
            // index for the score
            int index = Math.min((int) score, 9);
            distribution[index]++;
        }

        // Add the distribution to the new table model
        for (int i = 0; i < 10; i++) {
            distributionModel.addRow(new Object[] { i + "-" + (i + 1), distribution[i] });
        }

        return distributionModel;
    }

    public TableModel getTBListLops() {
        // Get the original table model
        TableModel originalModel = tbClassList.getModel();

        // Create a new table model for the class distribution
        DefaultTableModel classModel = new DefaultTableModel(new Object[] { "Class", "Count" }, 0);

        // Create a map to count the class distribution
        Map<String, Integer> classDistribution = new HashMap<>();

        // Count the class distribution
        for (int i = 0; i < originalModel.getRowCount(); i++) {
            String className = originalModel.getValueAt(i, 1).toString(); // replace 1 with the column index for the
                                                                          // class
            int studentCount = Integer.parseInt(originalModel.getValueAt(i, 2).toString()); // replace 2 with the column
                                                                                            // index for the student
                                                                                            // count
            classDistribution.put(className, classDistribution.getOrDefault(className, 0) + studentCount);
        }

        // Convert the class distribution map to a list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(classDistribution.entrySet());

        // Sort the list in descending order
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Add the sorted distribution to the new table model
        for (Map.Entry<String, Integer> entry : list) {
            classModel.addRow(new Object[] { entry.getKey(), entry.getValue() });
        }

        return classModel;
    }

    public String getSearchBoxStudent() {
        return txtFind.getText().trim();
    }

    public int getCriteria() {
        return cbFind.getSelectedIndex();
    }

    public int getLopID() {
        return Integer.parseInt(txtIDClass.getText());
    }

    public List<Monhoc> getSubsList()
    {
        List<Monhoc> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) tbSubsList.getModel();
        int size = model.getRowCount();
        if(size == 0) return new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int id = (Integer) model.getValueAt(i, 0);
            for (Monhoc m : listMonhoc)
            {
                if(m.getId() == id)
                {
                    list.add(m);
                }
            }
        }
        return list;
    }

    public void getEditedList(List<Monhoc> listMonhoc)
    {
        DefaultTableModel model = (DefaultTableModel) tbSubsList.getModel();
        model.setRowCount(0);
        for (Monhoc m : listMonhoc)
        {
            model.addRow(new Object[] {m.getId(), m.getName(), m.getKhoa()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClass;
    private javax.swing.JButton btnClearClass;
    private javax.swing.JButton btnDeleteClass;
    private javax.swing.JButton btnEditClass;
    private javax.swing.JButton btnEditSubsList;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnSortbyIDCL;
    private javax.swing.JButton btnSortbyIDClass;
    private javax.swing.JButton btnSortbyNameCL;
    private javax.swing.JButton btnSortbyPtsCL;
    private javax.swing.JButton btnSortbySLClass;
    private javax.swing.JButton btnStatNum;
    private javax.swing.JComboBox<String> cbChonlop;
    private javax.swing.JComboBox<String> cbFind;
    private javax.swing.JComboBox<String> cbLength;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbClassList;
    private javax.swing.JTable tbListStudents;
    private javax.swing.JTable tbSubsList;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtIDClass;
    private javax.swing.JTextField txtNameClass;
    private javax.swing.JTextArea txtNoteClass;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSLClass;
    // End of variables declaration//GEN-END:variables
}
