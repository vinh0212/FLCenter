/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.tad_sebs.View;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import vn.tad_sebs.Model.Student;
import vn.tad_sebs.View.MainView;
import vn.tad_sebs.Controller.MainController;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;

import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class StudentView extends javax.swing.JFrame {

    /**
     * Creates new form StudentView
     */
    public StudentView() {
        initComponents();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BtnEditStudent.setEnabled(false);
        BtnDeleteStudent.setEnabled(false);
        btnPrint.setEnabled(false);
        chkM.setSelected(true);

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        Studenttable = new javax.swing.JTable();
        FIDSearchStudent = new javax.swing.JTextField();
        BtnDeleteStudent = new javax.swing.JButton();
        BtnEditStudent = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        FNameSearchStudent = new javax.swing.JTextField();
        FAddressSearchStudent = new javax.swing.JTextField();
        BtnAddStudent = new javax.swing.JButton();
        CbbSeacrchStudent = new javax.swing.JComboBox<>();
        FSearchStudent = new javax.swing.JTextField();
        BtnSearchStudent = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FScoreSearchStudent = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BtnClearStudent = new javax.swing.JButton();
        btnSortbyid = new javax.swing.JButton();
        btnSortbyName = new javax.swing.JButton();
        btnSortbyDiem = new javax.swing.JButton();
        cbLop = new javax.swing.JComboBox<>();
        FDateSearchStudent = new com.toedter.calendar.JDateChooser();
        btnPrint = new javax.swing.JButton();
        chkM = new javax.swing.JCheckBox();
        chkF = new javax.swing.JCheckBox();
        btnCustomFind = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ HỌC VIÊN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(icon.getImage());
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Studenttable.setBackground(new java.awt.Color(174, 228, 255));
        Studenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ và tên", "Ngày sinh", "Giới tính", "Quê quán", "Lớp", "Giáo viên chủ nhiệm", "Điểm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Studenttable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Studenttable.setShowGrid(false);
        Studenttable.setShowHorizontalLines(true);
        Studenttable.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(Studenttable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, 1000, 610));

        FIDSearchStudent.setEnabled(false);
        FIDSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIDSearchStudentActionPerformed(evt);
            }
        });
        getContentPane().add(FIDSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 80, 163, -1));

        BtnDeleteStudent.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnDeleteStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Delete.png"))); // NOI18N
        BtnDeleteStudent.setText("Xóa");
        BtnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteStudentActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDeleteStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, 90, -1));

        BtnEditStudent.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnEditStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Edit.png"))); // NOI18N
        BtnEditStudent.setText("Chỉnh sửa");
        BtnEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditStudentActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEditStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 380, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 413, 400, 10));
        getContentPane().add(FNameSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 120, 163, 22));

        FAddressSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAddressSearchStudentActionPerformed(evt);
            }
        });
        getContentPane().add(FAddressSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 240, 163, -1));

        BtnAddStudent.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnAddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Add.png"))); // NOI18N
        BtnAddStudent.setText("Thêm");
        BtnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddStudentActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 380, 100, -1));

        CbbSeacrchStudent.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        CbbSeacrchStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên", "Lớp", "Quê quán" }));
        getContentPane().add(CbbSeacrchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 18, -1, 30));

        FSearchStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FSearchStudentKeyPressed(evt);
            }
        });
        getContentPane().add(FSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 18, 115, 30));

        BtnSearchStudent.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnSearchStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Find.png"))); // NOI18N
        BtnSearchStudent.setText("Tìm");
        BtnSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchStudentActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 17, 90, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 225, 73));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, 30, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 73));
        jLabel4.setText("Ngày sinh");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 160, 90, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 73));
        jLabel5.setText("Giới tính");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 200, 70, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 73));
        jLabel6.setText("Quê quán");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 240, 80, -1));

        FScoreSearchStudent.setEnabled(false);
        getContentPane().add(FScoreSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 330, 163, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 73));
        jLabel7.setText("Lớp");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 280, 40, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 73));
        jLabel9.setText("Điểm");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 50, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 73));
        jLabel12.setText("Họ và tên");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 80, -1));

        BtnClearStudent.setFont(new java.awt.Font("VnTimes", 1, 14)); // NOI18N
        BtnClearStudent.setText("C");
        BtnClearStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearStudentActionPerformed(evt);
            }
        });
        getContentPane().add(BtnClearStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 380, 40, -1));

        btnSortbyid.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSortbyid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Sort.png"))); // NOI18N
        btnSortbyid.setText("Sắp xếp theo ID");
        getContentPane().add(btnSortbyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 430, 170, 60));

        btnSortbyName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSortbyName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Sort.png"))); // NOI18N
        btnSortbyName.setText("Sắp xếp theo Tên");
        getContentPane().add(btnSortbyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, 170, 60));

        btnSortbyDiem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSortbyDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Sort.png"))); // NOI18N
        btnSortbyDiem.setLabel("Sắp xếp theo Điểm");
        getContentPane().add(btnSortbyDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 430, 180, 60));

        getContentPane().add(cbLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 280, 163, 32));

        FDateSearchStudent.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(FDateSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 160, 163, -1));

        btnPrint.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Print.png"))); // NOI18N
        btnPrint.setText("In thông tin học viên");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 600, 180, 60));

        btnGroup.add(chkM);
        chkM.setForeground(new java.awt.Color(255, 255, 255));
        chkM.setText("Nam");
        getContentPane().add(chkM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 200, 80, -1));

        btnGroup.add(chkF);
        chkF.setForeground(new java.awt.Color(255, 255, 255));
        chkF.setText("Nữ");
        getContentPane().add(chkF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 200, 70, -1));

        btnCustomFind.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCustomFind.setText("Tìm theo nhiều tiêu chí");
        getContentPane().add(btnCustomFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 190, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/QLHV2.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    ImageIcon icon = new ImageIcon((getClass().getResource("/vn/tad_sebs/icon/icon.png")));

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPrintActionPerformed
        Student student = getStudentInfo();

        try {
            // Open the template PDF
            PdfDocument pdfDoc = new PdfDocument(new PdfReader("template.pdf"),
                    new PdfWriter("StudentInfo" + student.getId() + "-" + student.getName() + ".pdf"));

            // Get the form from the document
            PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDoc, true);

            // Create a new font
        PdfFont font = PdfFontFactory.createFont("vuArial.ttf", "Identity-H");

            // Fill the form fields
            Map<String, PdfFormField> fields = form.getAllFormFields();
            fields.get("name").setValue(student.getName()).setFont(font);
            fields.get("dob").setValue(student.getDate()).setFont(font);
            fields.get("sex").setValue(student.getGioitinh()).setFont(font);
            fields.get("score").setValue(String.valueOf(student.getDiem())).setFont(font);
            fields.get("address").setValue(student.getAddress()).setFont(font);
            fields.get("lop").setValue(student.getLop()).setFont(font);
            fields.get("id").setValue(String.valueOf(student.getId())).setFont(font);

            // Close the document
            pdfDoc.close();

            showMessage("Đã xuất xong thông tin học viên. Kiểm tra trong thư mục của chương trình");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }// GEN-LAST:event_btnPrintActionPerformed

    private void BtnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnAddStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_BtnAddStudentActionPerformed

    private void BtnClearStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnClearStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_BtnClearStudentActionPerformed

    private void FSearchStudentKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_FSearchStudentKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            BtnSearchStudent.doClick();
        }
    }// GEN-LAST:event_FSearchStudentKeyPressed

    private void BtnEditStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnEditStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_BtnEditStudentActionPerformed

    private void BtnSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnSearchStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_BtnSearchStudentActionPerformed

    private void chkFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_chkFActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_chkFActionPerformed

    private void FIDSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FIDSearchStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_FIDSearchStudentActionPerformed

    private void BtnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnDeleteStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_BtnDeleteStudentActionPerformed

    private void FAddressSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FAddressSearchStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_FAddressSearchStudentActionPerformed

    private void FTeacherSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FTeacherSearchStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_FTeacherSearchStudentActionPerformed

    private String[] columnNames = new String[] {
            "ID", "Họ và tên ", "Ngày sinh", "Giới tính", "Quê quán", "Lớp", "Điểm" };

    public void showListStudents(List<Student> list) {
        int size = list.size();
        Object[][] students = new Object[size][7];
        for (int i = 0; i < size; i++) {
            students[i][0] = list.get(i).getId();
            students[i][1] = list.get(i).getName();
            students[i][2] = list.get(i).getDate();
            students[i][3] = list.get(i).getGioitinh();
            students[i][4] = list.get(i).getAddress();
            students[i][5] = list.get(i).getLop();
            students[i][6] = list.get(i).getDiem();
        }
        Studenttable.setModel(new DefaultTableModel(students, columnNames));
    }

    public void fillStudentFromSelectedRow() {
        // lấy chỉ số của hàng được chọn
        int row = Studenttable.getSelectedRow();
        if (row >= 0) {
            btnPrint.setEnabled(true);
            FIDSearchStudent.setText(Studenttable.getModel().getValueAt(row, 0).toString());
            FNameSearchStudent.setText(Studenttable.getModel().getValueAt(row, 1).toString());
            String dateString = Studenttable.getModel().getValueAt(row, 2).toString();
            // Chuỗi ngày tháng cần chuyển đổi
            JDateChooser dateChooser = new JDateChooser();

            // Định dạng của chuỗi ngày tháng
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                // Chuyển đổi chuỗi thành đối tượng Date
                Date date = dateFormat.parse(dateString);

                // Thiết lập ngày cho JDateChooser
                FDateSearchStudent.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if ("Nam".equals(Studenttable.getModel().getValueAt(row, 3).toString())) {
                chkM.setSelected(true);
            } else
                chkF.setSelected(true);
            FAddressSearchStudent.setText(Studenttable.getModel().getValueAt(row, 4).toString());
            int index = Integer.parseInt(Studenttable.getModel().getValueAt(row, 5).toString());
            if (index == 0)
                cbLop.setSelectedIndex(0);
            else {
                cbLop.setSelectedIndex(0);
                for (int i = 0; i < cbLop.getItemCount(); i++) {
                    String item = cbLop.getItemAt(i).toString();
                    int itemId = Integer.parseInt(item.split(" - ")[0]);
                    if (itemId == index) {
                        cbLop.setSelectedIndex(i);
                        break;
                    }
                }
            }

            FScoreSearchStudent.setText(Studenttable.getModel().getValueAt(row, 6).toString());
            // enable Edit and Delete buttons
            BtnEditStudent.setEnabled(true);
            BtnDeleteStudent.setEnabled(true);
            // disable Add button
            BtnAddStudent.setEnabled(false);
        }
    }

    public void showStudent(Student student) {
        FIDSearchStudent.setText(String.valueOf(student.getId()));
        FNameSearchStudent.setText(student.getName());

        String dateString = student.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Chuyển đổi chuỗi thành đối tượng Date
            Date date = dateFormat.parse(dateString);

            // Thiết lập ngày cho JDateChooser
            FDateSearchStudent.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (student.getGioitinh() == "Nam") {
            chkM.setSelected(true);
        } else
            chkF.setSelected(true);
        FAddressSearchStudent.setText(student.getAddress());
        int index = Integer.parseInt(student.getLop());
        if (index == 0)
            cbLop.setSelectedIndex(0);
        else {
            cbLop.setSelectedIndex(0);
            for (int i = 0; i < cbLop.getItemCount(); i++) {
                String item = cbLop.getItemAt(i).toString();
                int itemId = Integer.parseInt(item.split(" - ")[0]);
                if (itemId == index) {
                    cbLop.setSelectedIndex(i);
                    break;
                }
            }
        }

        FScoreSearchStudent.setText(String.valueOf(student.getDiem()));
        // enable Delete and edit button
        BtnEditStudent.setEnabled(true);
        BtnDeleteStudent.setEnabled(true);
        // disable Add button
        BtnAddStudent.setEnabled(false);
    }

    public void clearStudentInfo() {
        FIDSearchStudent.setText("");
        FNameSearchStudent.setText("");
        String dateString = "01/01/2024"; // Chuỗi ngày tháng cần chuyển đổi
        JDateChooser dateChooser = new JDateChooser();

        // Định dạng của chuỗi ngày tháng
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Chuyển đổi chuỗi thành đối tượng Date
            Date date = dateFormat.parse(dateString);

            // Thiết lập ngày cho JDateChooser
            FDateSearchStudent.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        chkM.setSelected(true);
        FAddressSearchStudent.setText("");
        cbLop.setSelectedIndex(0);

        FScoreSearchStudent.setText("");
        // disable Edit and Delete buttons
        BtnEditStudent.setEnabled(false);
        BtnDeleteStudent.setEnabled(false);
        // enable Add button
        BtnAddStudent.setEnabled(true);

        Studenttable.clearSelection();
        btnPrint.setEnabled(false);
    }

    public void addAddStudentListener(ActionListener listener) {
        BtnAddStudent.addActionListener(listener);
    }

    public void addEditStudentListener(ActionListener listener) {
        BtnEditStudent.addActionListener(listener);
    }

    public void addDeleteStudentListener(ActionListener listener) {
        BtnDeleteStudent.addActionListener(listener);
    }

    public void addClearListener(ActionListener listener) {
        BtnClearStudent.addActionListener(listener);
    }

    public void addListStudentSelectionListener(ListSelectionListener listener) {
        Studenttable.getSelectionModel().addListSelectionListener(listener);
    }

    public void addSearchStudentListener(ActionListener listener) {
        BtnSearchStudent.addActionListener(listener);
    }

    public void addSortStudentByIDListener(ActionListener listener) {
        btnSortbyid.addActionListener(listener);
    }

    public void addSortStudentByNameListener(ActionListener listener) {
        btnSortbyName.addActionListener(listener);
    }

    public void addSortStudentByDiemListener(ActionListener listener) {
        btnSortbyDiem.addActionListener(listener);
    }

    public void addSearchListener(ActionListener listener) {
        btnCustomFind.addActionListener(listener);
    }

    public void showListLop(ArrayList<String> list) {
        for (String item : list) {
            cbLop.addItem(item);
        }
    }

    public String getSelectedText() {
        return CbbSeacrchStudent.getSelectedItem().toString();
    }

    public String getSearchBox() {
        return FSearchStudent.getText().trim();
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public Student getStudentInfo() {
        if (!validateName() || !validateAddress())
            return null;
        try {

            Student student = new Student();
            if (FIDSearchStudent.getText() != null && !"".equals(FIDSearchStudent.getText())) {
                student.setId(Integer.parseInt(FIDSearchStudent.getText()));
            }

            student.setName(FNameSearchStudent.getText());

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            student.setDate(dateFormat.format(FDateSearchStudent.getDate()));

            if (chkM.isSelected() == true)
                student.setGioitinh("Nam");
            else
                student.setGioitinh("Nữ");

            student.setAddress(FAddressSearchStudent.getText());
            student.setLop(cbLop.getSelectedItem().toString().split(" - ")[0]);

            if ("".equals(FScoreSearchStudent.getText())) {
                student.setDiem(0);
            } else
                student.setDiem(Float.parseFloat(FScoreSearchStudent.getText()));
            return student;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    private boolean validateName() {
        String name = FNameSearchStudent.getText();
        if (name == null || name.isEmpty()) {
            FNameSearchStudent.requestFocus();
            showMessage("Tên không được để trống");
            return false;
        }
        return true;
    }

    private boolean validateAddress() {
        String address = FAddressSearchStudent.getText();
        if (address == null || address.isEmpty()) {
            FAddressSearchStudent.requestFocus();
            showMessage("Quê quán không được để trống");
            return false;
        }
        return true;
    }

    public boolean validateIDSearch() {
        String searchBox = FSearchStudent.getText();
        // check if ID is a number
        try {
            int id = Integer.parseInt(searchBox);

        } catch (NumberFormatException e) {
            showMessage("ID phải là số");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddStudent;
    private javax.swing.JButton BtnClearStudent;
    private javax.swing.JButton BtnDeleteStudent;
    private javax.swing.JButton BtnEditStudent;
    private javax.swing.JButton BtnSearchStudent;
    private javax.swing.JComboBox<String> CbbSeacrchStudent;
    private javax.swing.JTextField FAddressSearchStudent;
    private com.toedter.calendar.JDateChooser FDateSearchStudent;
    private javax.swing.JTextField FIDSearchStudent;
    private javax.swing.JTextField FNameSearchStudent;
    private javax.swing.JTextField FScoreSearchStudent;
    private javax.swing.JTextField FSearchStudent;
    private javax.swing.JTable Studenttable;
    private javax.swing.JButton btnCustomFind;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSortbyDiem;
    private javax.swing.JButton btnSortbyName;
    private javax.swing.JButton btnSortbyid;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbLop;
    private javax.swing.JCheckBox chkF;
    private javax.swing.JCheckBox chkM;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
