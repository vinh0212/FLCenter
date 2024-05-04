/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.tad_sebs.View;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import vn.tad_sebs.Controller.MainController;
import vn.tad_sebs.Model.Exam;
import vn.tad_sebs.Model.Teacher;

/**
 *
 * @author ASUS
 */
public class ExamView extends javax.swing.JFrame {

    /**
     * Creates new form ExamView
     */
    public ExamView() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);


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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        Examtable = new javax.swing.JTable();
        FIDSearchExam = new javax.swing.JTextField();
        FNameSearchExam = new javax.swing.JTextField();
        FTeacherSearchExam = new javax.swing.JTextField();
        FSearchTime = new com.toedter.calendar.JDateChooser();
        btnAddExam = new javax.swing.JButton();
        btnDeleteExam = new javax.swing.JButton();
        btnEditExam = new javax.swing.JButton();
        btnClearExam = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CbbSearchExam = new javax.swing.JComboBox<>();
        btnEditTeacher = new javax.swing.JButton();
        FSearchExam = new javax.swing.JTextField();
        btnSearchExam = new javax.swing.JButton();
        panelTeacher = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListPush = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        LishPull = new javax.swing.JList<>();
        btnPush = new javax.swing.JButton();
        btnPull = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnSortbyIDExam = new javax.swing.JButton();
        btnSortbyTime = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ KỲ THI");
        setIconImage(icon.getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Examtable.setAutoCreateRowSorter(true);
        Examtable.setBackground(new java.awt.Color(174, 228, 255));
        Examtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tên kỳ thi", "Thời gian", "Giám thị"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(Examtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, 884, 517));

        FIDSearchExam.setEnabled(false);
        getContentPane().add(FIDSearchExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 90, 141, -1));
        getContentPane().add(FNameSearchExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 130, 141, -1));
        getContentPane().add(FTeacherSearchExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, 141, -1));

        FSearchTime.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(FSearchTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 210, 141, -1));

        btnAddExam.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAddExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Add.png"))); // NOI18N
        btnAddExam.setText("Thêm");
        btnAddExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExamActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, -1, -1));

        btnDeleteExam.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnDeleteExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Delete.png"))); // NOI18N
        btnDeleteExam.setText("Xóa");
        getContentPane().add(btnDeleteExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 250, -1, -1));

        btnEditExam.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnEditExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Edit.png"))); // NOI18N
        btnEditExam.setText("Chỉnh sửa");
        getContentPane().add(btnEditExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 250, -1, -1));

        btnClearExam.setFont(new java.awt.Font("VnTimes", 1, 14)); // NOI18N
        btnClearExam.setText("C");
        btnClearExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearExamActionPerformed(evt);
            }
        });
        getContentPane().add(btnClearExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 73));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 30, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 73));
        jLabel2.setText("Tên kỳ thi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 100, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 73));
        jLabel3.setText("Mã Giám thị");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 170, 110, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 73));
        jLabel4.setText("Thời gian");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 210, 90, -1));

        CbbSearchExam.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        CbbSearchExam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên" }));
        getContentPane().add(CbbSearchExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 14, -1, 30));

        btnEditTeacher.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnEditTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/info.png"))); // NOI18N
        btnEditTeacher.setText("Chi tiết");
        getContentPane().add(btnEditTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 170, 110, 30));

        FSearchExam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FSearchExamKeyPressed(evt);
            }
        });
        getContentPane().add(FSearchExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 14, 115, 30));

        btnSearchExam.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSearchExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Find.png"))); // NOI18N
        btnSearchExam.setText("Tìm");
        getContentPane().add(btnSearchExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 14, -1, -1));

        panelTeacher.setBackground(new java.awt.Color(174, 228, 255));
        panelTeacher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTeacher.setForeground(new java.awt.Color(204, 204, 204));

        ListPush.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(ListPush);

        LishPull.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(LishPull);

        btnPush.setText(">>");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        btnPull.setText("<<");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Giám thị ");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Giám thị đã được chọn");

        btnOK.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnOK.setText("OK");

        javax.swing.GroupLayout panelTeacherLayout = new javax.swing.GroupLayout(panelTeacher);
        panelTeacher.setLayout(panelTeacherLayout);
        panelTeacherLayout.setHorizontalGroup(
            panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTeacherLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPush, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelTeacherLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(16, 16, 16))
        );
        panelTeacherLayout.setVerticalGroup(
            panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTeacherLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTeacherLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnPush)
                        .addGap(18, 18, 18)
                        .addComponent(btnPull)
                        .addGap(18, 18, 18)
                        .addComponent(btnOK))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panelTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, -1, 290));

        btnSortbyIDExam.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSortbyIDExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Sort.png"))); // NOI18N
        btnSortbyIDExam.setText("Sắp xếp theo ID");
        getContentPane().add(btnSortbyIDExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, 200, 70));

        btnSortbyTime.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSortbyTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Sort.png"))); // NOI18N
        btnSortbyTime.setText("Sắp xếp theo thời gian");
        getContentPane().add(btnSortbyTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 200, 70));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 450, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/QLKT2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1340, 630));

        setSize(new java.awt.Dimension(1350, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearExamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearExamActionPerformed

    private void FSearchExamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FSearchExamKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            btnSearchExam.doClick();
        }
    }//GEN-LAST:event_FSearchExamKeyPressed

    private void btnAddExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddExamActionPerformed


        // Tạo một ImageIcon từ đường dẫn
        ImageIcon icon = new ImageIcon((getClass().getResource("/vn/tad_sebs/icon/icon.png")));

    private String[] columnNamesExam = new String[] {
            "ID", "Tên kỳ thi", "Thời gian", "Mã Giám thị" };

    public void showListExam(List<Exam> list) {
        int size = list.size();
        Object[][] exam = new Object[size][4];
        for (int i = 0; i < size; i++) {
            exam[i][0] = list.get(i).getId();
            exam[i][1] = list.get(i).getName();
            exam[i][2] = list.get(i).getTime();
            exam[i][3] = "";
            List<Teacher> listTeachers = list.get(i).getGiamthi();

            for (Teacher t : listTeachers) {
                exam[i][3] += t.getId() + ",";
            }
        }
        Examtable.setModel(new DefaultTableModel(exam, columnNamesExam));
    }

    public void fillExamFromSelectedRow() {
        // lấy chỉ số của hàng được chọn
        int row = Examtable.getSelectedRow();
        if (row >= 0) {
            FIDSearchExam.setText(Examtable.getModel().getValueAt(row, 0).toString());
            FNameSearchExam.setText(Examtable.getModel().getValueAt(row, 1).toString());
            FTeacherSearchExam.setText(Examtable.getModel().getValueAt(row, 3).toString());
            String dateString = Examtable.getModel().getValueAt(row, 2).toString(); // Chuỗi ngày tháng cần chuyển đổi
            JDateChooser dateChooser = new JDateChooser();

            // Định dạng của chuỗi ngày tháng
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            try {
                // Chuyển đổi chuỗi thành đối tượng Date
                Date date = dateFormat.parse(dateString);

                // Thiết lập ngày cho JDateChooser
                FSearchTime.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            // enable Edit and Delete buttons
            btnEditExam.setEnabled(true);
            btnDeleteExam.setEnabled(true);
            btnEditTeacher.setEnabled(true);
            // disable Add button
            btnAddExam.setEnabled(false);
        }
    }

    public void showListPushGiamthi(List<Teacher> list) {
        int size = list.size();
        String[] teachers = new String[size];
        for (int i = 0; i < size; i++) {
            teachers[i] = list.get(i).getId() + " - " + list.get(i).getName();
        }
        ListPush.setListData(teachers);
    }

    public void showListPullGiamthi(List<Teacher> list) {
        int size = list.size();
        String[] teachers = new String[size];
        for (int i = 0; i < size; i++) {
            teachers[i] = list.get(i).getId() + " - " + list.get(i).getName();
        }
        LishPull.setListData(teachers);

    }

    public boolean validateID()
    {
        String searchBox = FSearchExam.getText();
        try{
            int id = Integer.parseInt(searchBox);
            if(id < 0)
            {
                showMessage("ID không hợp lệ");
                return false;
            }
        }
        catch(NumberFormatException ex)
        {
            showMessage("ID không hợp lệ");
            return false;
        }
        return  true;
    }

    public String getFSearchTeacher() {
        return FTeacherSearchExam.getText();
    }

    public int getCriteria() {
        return CbbSearchExam.getSelectedIndex();
    }

    public String getSearchBoxValue() {
        return FSearchExam.getText();
    }

    public void setListPullIDGiamthi() {
        String s = "";
        // Get all items of LishPull
        HashSet<Teacher> list = new HashSet<Teacher>();
        for (int i = 0; i < LishPull.getModel().getSize(); i++) {
            String[] parts = LishPull.getModel().getElementAt(i).split(" - ");
            Teacher teacher = new Teacher();
            teacher.setId(Integer.parseInt(parts[0]));
            list.add(teacher);
        }

        for (Teacher t : list) {
            s += t.getId() + ",";
        }
        FTeacherSearchExam.setText(s);

        Examtable.setEnabled(true);

        FNameSearchExam.setEnabled(true);
        FSearchTime.setVisible(true);
        FTeacherSearchExam.setEnabled(true);
        btnAddExam.setVisible(true);
        btnDeleteExam.setVisible(true);
        btnEditExam.setVisible(true);
        btnClearExam.setVisible(true);
        btnEditTeacher.setEnabled(true);
        btnSortbyIDExam.setEnabled(true);
        btnSortbyTime.setEnabled(true);
        btnSearchExam.setEnabled(true);
        CbbSearchExam.setEnabled(true);
        FSearchExam.setEnabled(true);
        ListPush.setListData(new String[0]);
        LishPull.setListData(new String[0]);

        for (Component component : panelTeacher.getComponents()) {
            component.setEnabled(false);
        }
        panelTeacher.setVisible(false);
        btnEditExam.requestFocus();
    }

    public JList<String> getListPush() {
        return ListPush;
    }

    public JList<String> getListPull() {
        return LishPull;
    }

    public void moveSelectedItems(JList<String> sourceList, JList<String> destinationList) {
        // Get selected index
        int index = sourceList.getSelectedIndex();
        if (index != -1) {
            // Get selected item
            String selectedItem = sourceList.getSelectedValue();

            // Create new DefaultListModel for destinationList and add selected item
            DefaultListModel<String> destinationModel = new DefaultListModel<>();
            for (int i = 0; i < destinationList.getModel().getSize(); i++) {
                destinationModel.addElement(destinationList.getModel().getElementAt(i));
            }
            destinationModel.addElement(selectedItem);
            destinationList.setModel(destinationModel);

            // Create new DefaultListModel for sourceList and remove selected item
            DefaultListModel<String> sourceModel = new DefaultListModel<>();
            for (int i = 0; i < sourceList.getModel().getSize(); i++) {
                if (i != index) {
                    sourceModel.addElement(sourceList.getModel().getElementAt(i));
                }
            }
            sourceList.setModel(sourceModel);
        }
    }

    public int getExamID() {
        if (!"".equals(FIDSearchExam.getText()))
            return Integer.parseInt(FIDSearchExam.getText());
        else
            return -1;
    }

    public void showExam(Exam exam) {
        FIDSearchExam.setText(String.valueOf(exam.getId()));
        FNameSearchExam.setText(exam.getName());
        FTeacherSearchExam.setText(String.valueOf(exam.getGiamthi()));
        String dateString = exam.getTime();
        JDateChooser dateChooser = new JDateChooser();

        // Định dạng của chuỗi ngày tháng
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Chuyển đổi chuỗi thành đối tượng Date
            Date date = dateFormat.parse(dateString);

            // Thiết lập ngày cho JDateChooser
            FSearchTime.setDate(date);

            // enable Delete and edit button
            btnEditExam.setEnabled(true);
            btnDeleteExam.setEnabled(true);
            btnEditTeacher.setEnabled(true);
            // disable Add button
            btnAddExam.setEnabled(false);
        } catch (ParseException ex) {
            Logger.getLogger(ExamView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setPanelTeacherVisible() {
        for (Component component : panelTeacher.getComponents()) {
            component.setEnabled(true);
        }
        panelTeacher.setVisible(true);
        Examtable.setEnabled(false);

        FNameSearchExam.setEnabled(false);
        FSearchTime.setVisible(false);
        FTeacherSearchExam.setEnabled(false);
        btnAddExam.setVisible(false);
        btnDeleteExam.setVisible(false);
        btnEditExam.setVisible(false);
        btnClearExam.setVisible(false);
        btnEditTeacher.setEnabled(false);
        btnSortbyIDExam.setEnabled(false);
        btnSortbyTime.setEnabled(false);
        btnSearchExam.setEnabled(false);
        CbbSearchExam.setEnabled(false);
        FSearchExam.setEnabled(false);
    }

    public void disableButtons() {
        // disable edit, delete, panelTeacher
        btnEditExam.setEnabled(false);
        btnDeleteExam.setEnabled(false);
        for (Component component : panelTeacher.getComponents()) {
            component.setEnabled(false);
        }
        
        panelTeacher.setVisible(false);

    }

    public void clearExamInfo() {
        FIDSearchExam.setText("");
        FNameSearchExam.setText("");
        FTeacherSearchExam.setText("");
        String dateString = "01/01/2024"; // Chuỗi ngày tháng cần chuyển đổi
        JDateChooser dateChooser = new JDateChooser();

        // Định dạng của chuỗi ngày tháng
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Chuyển đổi chuỗi thành đối tượng Date
            Date date = dateFormat.parse(dateString);

            // Thiết lập ngày cho JDateChooser
            FSearchTime.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // disable Edit and Delete buttons
        btnEditExam.setEnabled(false);
        btnDeleteExam.setEnabled(false);
        btnEditTeacher.setEnabled(true);
        // enable Add button
        btnAddExam.setEnabled(true);
        // disable panelTeacher and clear lists
        panelTeacher.setEnabled(false);
        ListPush.setListData(new String[0]);
        LishPull.setListData(new String[0]);

        Examtable.clearSelection();

    }

    public Exam getExamInfo() {
        if(!validateName() || !validateGiamthi())
            return null;
        try {

            Exam exam = new Exam();
            if (FIDSearchExam.getText() != null && !"".equals(FIDSearchExam.getText())) {
                exam.setId(Integer.parseInt(FIDSearchExam.getText()));
            }

            exam.setName(FNameSearchExam.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            exam.setTime(dateFormat.format(FSearchTime.getDate()));

            List<Teacher> list = new ArrayList<>();
            String s = FTeacherSearchExam.getText().toString();
            String[] parts = s.split(",");
            for (String part : parts) {
                if (part != "") {
                    Teacher teacher = new Teacher();
                    teacher.setId(Integer.parseInt(part));
                    list.add(teacher);
                }
            }
            exam.setGiamthi(list);

            return exam;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    private boolean validateName()
    {
        if (FNameSearchExam.getText().trim().equals("")) {
            FNameSearchExam.requestFocus();
            showMessage("Tên kỳ thi không được để trống");
            return false;
        }
        return true;
    }

    public boolean validateGiamthi()
    {
        if (FTeacherSearchExam.getText().trim().equals("")) {
            FTeacherSearchExam.requestFocus();
            showMessage("Cần phải có giám thị cho kỳ thi");
            return false;
        }
        return true;
    }

    public void addAddExamListener(ActionListener listener) {
        btnAddExam.addActionListener(listener);
    }

    public void addEditExamListener(ActionListener listener) {
        btnEditExam.addActionListener(listener);
    }

    public void addDeleteExamListener(ActionListener listener) {
        btnDeleteExam.addActionListener(listener);
    }

    public void addClearExamListener(ActionListener listener) {
        btnClearExam.addActionListener(listener);
    }

    public void addListExamSelectionListener(ListSelectionListener listener) {
        Examtable.getSelectionModel().addListSelectionListener(listener);
    }

    public void addSearchExamListener(ActionListener listener) {
        btnSearchExam.addActionListener(listener);
    }

    public void addSortExamByIDListener(ActionListener listener) {
        btnSortbyIDExam.addActionListener(listener);
    }

    public void addSortExamByTimeListener(ActionListener listener) {
        btnSortbyTime.addActionListener(listener);
    }

    public void addEditTeacherListener(ActionListener listener) {
        btnEditTeacher.addActionListener(listener);
    }

    public void addPushListener(ActionListener listener) {
        btnPush.addActionListener(listener);
    }

    public void addPullListener(ActionListener listener) {
        btnPull.addActionListener(listener);
    }

    public void addOKListener(ActionListener listener) {
        btnOK.addActionListener(listener);
    }

    public String getSelectedTextExam() {
        return CbbSearchExam.getSelectedItem().toString();
    }

    public String getSearchBoxExam() {
        return FSearchExam.getText().trim();
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPushActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnPushActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbbSearchExam;
    private javax.swing.JTable Examtable;
    private javax.swing.JTextField FIDSearchExam;
    private javax.swing.JTextField FNameSearchExam;
    private javax.swing.JTextField FSearchExam;
    private com.toedter.calendar.JDateChooser FSearchTime;
    private javax.swing.JTextField FTeacherSearchExam;
    private javax.swing.JList<String> LishPull;
    private javax.swing.JList<String> ListPush;
    private javax.swing.JButton btnAddExam;
    private javax.swing.JButton btnClearExam;
    private javax.swing.JButton btnDeleteExam;
    private javax.swing.JButton btnEditExam;
    private javax.swing.JButton btnEditTeacher;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPull;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnSearchExam;
    private javax.swing.JButton btnSortbyIDExam;
    private javax.swing.JButton btnSortbyTime;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelTeacher;
    // End of variables declaration//GEN-END:variables
}
