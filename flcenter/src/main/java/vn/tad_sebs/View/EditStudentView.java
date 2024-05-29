/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.tad_sebs.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;

import vn.tad_sebs.Controller.MainController2;
import vn.tad_sebs.Model.CourseFeeEntry;
import vn.tad_sebs.Model.CourseTeacherEntry;
import vn.tad_sebs.Model.Entry;
import vn.tad_sebs.Model.Lop;
import vn.tad_sebs.Model.Monhoc;
import vn.tad_sebs.Model.Student;
import vn.tad_sebs.Model.Teacher;

/**
 *
 * @author ASUS
 */
public class EditStudentView extends javax.swing.JFrame {

    private List<Lop> listLop;

    /**
     * Creates new form EditStudentView
     */
    public EditStudentView() {
        initComponents();

        listMonhoc.setEnabled(false);
        cbSelectedGV.setEnabled(false);
        btnGVSave.setEnabled(false);
        btnDone.setEnabled(false);

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                MainView2 mainView2 = new MainView2();
                MainController2 mainController2 = new MainController2(mainView2);
                mainController2.showMainView2();
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        FIDSearchStudent = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        FNameSearchStudent = new javax.swing.JTextField();
        FDateSearchStudent = new com.toedter.calendar.JDateChooser();
        btnDone = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chkM = new javax.swing.JCheckBox();
        chkF = new javax.swing.JCheckBox();
        btnDelete = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        FAddressSearchStudent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAddtoPkgList = new javax.swing.JButton();
        cbRemPkg = new javax.swing.JComboBox<>();
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

        btnDone.setText("Hoàn tất");
        getContentPane().add(btnDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

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

        btnDelete.setText("Xoá khoá");
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 80, 30));

        btnConfirm.setText("Sửa giáo viên của khoá");
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 170, 30));

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

        btnAddtoPkgList.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAddtoPkgList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Add.png"))); // NOI18N
        btnAddtoPkgList.setText("Thêm");
        getContentPane().add(btnAddtoPkgList, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        getContentPane().add(cbRemPkg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 73));
        jLabel11.setText("Khoá học đã đăng ký");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 190, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 255, 73));
        jLabel13.setText("Giáo viên được chọn");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 190, -1));

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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 280, 250));

        jScrollPane2.setViewportView(listMonhoc);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 110, 120));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 73));
        jLabel5.setText("-->");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 30, -1));

        getContentPane().add(cbSelectedGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 140, 70));

        btnGVSave.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnGVSave.setText("Chọn GV");
        btnGVSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGVSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnGVSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        BtnEditStudent.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnEditStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/Edit.png"))); // NOI18N
        BtnEditStudent.setText("Chỉnh sửa");
        BtnEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditStudentActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEditStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 73));
        jLabel3.setText("CHỈNH SỬA THÔNG TIN HỌC VIÊN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/tad_sebs/icon/QLCB2.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 760, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FIDSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FIDSearchStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_FIDSearchStudentActionPerformed

    private void FAddressSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FAddressSearchStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_FAddressSearchStudentActionPerformed

    private void btnGVSaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGVSaveActionPerformed
        // lưu thông tin vào courseTeacherMap
        int idTeacher = Integer.parseInt(cbSelectedGV.getSelectedItem().toString().split(" - ")[0]);
        int idMonhoc = Integer.parseInt(listMonhoc.getSelectedValue().split(" - ")[0]);
        System.out.println(editingPackage);

        for (CourseTeacherEntry entry : courseTeacherMap) {
            if (entry.getCourseId() == editingPackage) {
                for (Entry teacherEntry : entry.getTeacherMap()) {
                    if (teacherEntry.getIdMonhoc() == idMonhoc) {
                        teacherEntry.setIdTeacher(idTeacher);
                        break;
                    }
                }
            }
        }
    }// GEN-LAST:event_btnGVSaveActionPerformed

    private void BtnEditStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnEditStudentActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_BtnEditStudentActionPerformed

    private void chkMActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_chkMActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_chkMActionPerformed

    /**
     * @param args the command line arguments
     */

    public void getListLops(List<Lop> listLop) {
        this.listLop = listLop;
    }

    private List<CourseTeacherEntry> courseTeacherMap;
    private List<CourseFeeEntry> courseFeeMap;
    private String[] columnPackageNames = { "ID", "Tên khóa học", "Trạng thái" };

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

        editingLop = student.getLop();

        // đưa danh sách lớp không có trong student.getLop() vào cbRemPkg, load dữ liệu
        // từ listLop
        List<Integer> listPicked = student.getLop();
        for (Lop lop : listLop) {
            if (!listPicked.contains(lop.getId())) {
                cbRemPkg.addItem(lop.getId() + " - " + lop.getName());
            }
        }

        courseTeacherMap = student.getCourseTeacherMap();
        if (student.getGioitinh().equals("Nam")) {
            chkM.setSelected(true);
        } else
            chkF.setSelected(true);
        FAddressSearchStudent.setText(student.getAddress());

        courseFeeMap = student.getCourseFeeMap();

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnPackageNames);

        for (CourseFeeEntry entry : courseFeeMap) {
            for (Lop lop : listLop) {
                if (lop.getId() == entry.getCourseId()) {
                    model.addRow(new Object[] {
                            lop.getId(), lop.getName(), entry.getFee() == false ? "Chưa đóng" : "Đã đóng"
                    });
                    break;
                }
            }

        }
        tbPackageList.setModel(model);



        

    }

    public void showListGV(List<Teacher> teachersList) {
        cbSelectedGV.removeAllItems();
        for (Teacher teacher : teachersList) {
            cbSelectedGV.addItem(teacher.getId() + " - " + teacher.getName());
        }

        // set selection for cbSelectedGV, searching data in courseTeacherMap
        for (CourseTeacherEntry entry : courseTeacherMap) {
            if (entry.getCourseId() == editingPackage) {
                for (Entry teacherEntry : entry.getTeacherMap()) {
                    if (teacherEntry.getIdMonhoc() == getSelectedSubject()) {
                        String teacherName = "";
                        for (Teacher teacher : teachersList) {
                            if (teacher.getId() == teacherEntry.getIdTeacher()) {
                                teacherName = teacher.getName();
                                break;
                            }
                        }
                        cbSelectedGV.setSelectedItem(teacherEntry.getIdTeacher() + " - " + teacherName);
                        break;
                    }
                }
            }
        }

    }

    public int getSelectedPackage() {
        return Integer.parseInt(tbPackageList.getValueAt(tbPackageList.getSelectedRow(), 0).toString());
    }

    public int getSelectedSubject() {
        
        return Integer.parseInt(listMonhoc.getSelectedValue().toString().split(" - ")[0]);
    }

    public void setSelection() {
        listMonhoc.setSelectedIndex(0);
    }

    public JList getListMonhoc()
    {
        return listMonhoc;
    }

    public void showListMonhoc(int id) {
        editingPackage = id;
        for (CourseTeacherEntry entry : courseTeacherMap) {
            if (entry.getCourseId() == id) {
                // get Lop with id
                Lop edLop = null;
                for (Lop lop : listLop) {
                    if (lop.getId() == id) {
                        edLop = lop;
                        break;
                    }
                }
                DefaultListModel<String> model = new DefaultListModel<>();
                for (Integer m : edLop.getIdMonhoc()) {
                    for (Monhoc monhoc : listSubs) {
                        if (monhoc.getId() == m) {
                            model.addElement(monhoc.getId() + " - " + monhoc.getName());
                            break;
                        }
                    }
                }
                listMonhoc.setModel(model);
                break;
            }
        }
    }

    private List<Monhoc> listSubs = new ArrayList<>();

    public void getListSubjects(List<Monhoc> list) {
        listSubs = list;
    }

    private List<Teacher> listTeacher;

    public void getListTeachers(List<Teacher> list) {
        listTeacher = list;
    }

    public int editingPackage;

    // di chuyển item qua lại từ combo box cbRemPkg vào table tbPackageList
    public void moveSelectedItems() {
        int id = Integer.parseInt(cbRemPkg.getSelectedItem().toString().split(" - ")[0]);
        for (Lop lop : listLop) {
            if (lop.getId() == id) {
                DefaultTableModel model = (DefaultTableModel) tbPackageList.getModel();
                model.addRow(new Object[] { lop.getId(), lop.getName(), "Chưa đóng" });
                break;
            }
        }
        addNewPackage();
        cbRemPkg.removeItem(cbRemPkg.getSelectedItem());
    }

    // di chuyển item qua từ table tbPackageList vào cbRemPkg, xóa item khỏi table
    // nếu item đó trạng thái là chưa đóng
    public void moveSelectedItemsBack() {
        // kiểm tra trạng thái của lớp, nếu đã đóng thì không cho di chuyển
        if (tbPackageList.getValueAt(tbPackageList.getSelectedRow(), 2).toString().equals("Đã đóng")) {
            showMessage("Không thể xoá khoá học đã đóng phí!");
            return;
        }
        int id = Integer.parseInt(tbPackageList.getValueAt(tbPackageList.getSelectedRow(), 0).toString());
        for (Lop lop : listLop) {
            if (lop.getId() == id) {
                cbRemPkg.addItem(lop.getId() + " - " + lop.getName());
                break;
            }
        }
        removePackage();
        DefaultTableModel model = (DefaultTableModel) tbPackageList.getModel();
        model.removeRow(tbPackageList.getSelectedRow());
    }

    private List<Integer> editingLop;

    // tạo hàm thêm lớp mới được chọn từ cbRemPkg vào courseTeacherMap và
    // courseFeeMap
    public void addNewPackage() {
        int id = Integer.parseInt(cbRemPkg.getSelectedItem().toString().split(" - ")[0]);
        editingLop.add(id);
        CourseTeacherEntry entry = new CourseTeacherEntry();
        entry.setCourseId(id);
        List<Entry> teacherMap = new ArrayList<>();

        for (Lop lop : listLop) {
            if (lop.getId() == id) {
                for (Integer idMon : lop.getIdMonhoc()) {
                    Entry teacherEntry = new Entry();
                    teacherEntry.setIdMonhoc(idMon);
                    for (Teacher teacher : listTeacher) {
                        if (teacher.getMon() == idMon) {
                            teacherEntry.setIdTeacher(teacher.getId());
                            break;
                        }
                    }
                    teacherMap.add(teacherEntry);
                }
            }
        }

        entry.setTeacherMap(teacherMap);
        courseTeacherMap.add(entry);

        CourseFeeEntry entry2 = new CourseFeeEntry();
        entry2.setCourseId(id);
        entry2.setFee(false);
        courseFeeMap.add(entry2);
    }

    public void removePackage()
    {
        int id = Integer.parseInt(tbPackageList.getValueAt(tbPackageList.getSelectedRow(), 0).toString());
        for (int i=0; i<editingLop.size(); i++) {
            if (editingLop.get(i) == id) {
                editingLop.remove(i);
                break;
            }
        }

        for (int i=0; i<courseTeacherMap.size(); i++) {
            if (courseTeacherMap.get(i).getCourseId() == id) {
                courseTeacherMap.remove(i);
                break;
            }
        }

        for (int i=0; i<courseFeeMap.size(); i++) {
            if (courseFeeMap.get(i).getCourseId() == id) {
                courseFeeMap.remove(i);
                break;
            }
        }
    }

    public Student getStudentInfo()
    {
        Student student = new Student();
        student.setId(Integer.parseInt(FIDSearchStudent.getText()));
        student.setName(FNameSearchStudent.getText());
        student.setDate(new SimpleDateFormat("dd/MM/yyyy").format(FDateSearchStudent.getDate()));
        student.setGioitinh(chkM.isSelected() ? "Nam" : "Nữ");
        student.setAddress(FAddressSearchStudent.getText());
        student.setLop(editingLop);
        student.setCourseTeacherMap(courseTeacherMap);
        student.setCourseFeeMap(courseFeeMap);
        return student;
    }

    public void hidePackageRelated()
    {
        cbRemPkg.setEnabled(false);
        btnAddtoPkgList.setEnabled(false);
        tbPackageList.setEnabled(false);
        btnDelete.setEnabled(false);
        btnConfirm.setEnabled(false);
        BtnEditStudent.setEnabled(false);

        listMonhoc.setEnabled(true);
        cbSelectedGV.setEnabled(true);
        btnGVSave.setEnabled(true);
        btnDone.setEnabled(true);


    }

    public void hideTeacherRelated()
    {
        listMonhoc.setEnabled(false);
        cbSelectedGV.setEnabled(false);
        btnGVSave.setEnabled(false);
        btnDone.setEnabled(false);

        cbRemPkg.setEnabled(true);
        btnAddtoPkgList.setEnabled(true);
        tbPackageList.setEnabled(true);
        btnDelete.setEnabled(true);
        btnConfirm.setEnabled(true);
        BtnEditStudent.setEnabled(true);
    }

    public void showMessage(String message)
    {
        javax.swing.JOptionPane.showMessageDialog(this, message);
    }





    public void addConfirmListener(java.awt.event.ActionListener listener) {
        btnConfirm.addActionListener(listener);
    }

    public void addDoneListener(java.awt.event.ActionListener listener) {
        btnDone.addActionListener(listener);
    }

    public void addEditStudentListener(java.awt.event.ActionListener listener) {
        BtnEditStudent.addActionListener(listener);
    }

    public void addAddtoPkgListListener(java.awt.event.ActionListener listener) {
        btnAddtoPkgList.addActionListener(listener);
    }

    public void addDeleteListener(java.awt.event.ActionListener listener) {
        btnDelete.addActionListener(listener);
    }

    public void addListMonhocSelectionListener(javax.swing.event.ListSelectionListener listener) {
        listMonhoc.addListSelectionListener(listener);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditStudent;
    private javax.swing.JTextField FAddressSearchStudent;
    private com.toedter.calendar.JDateChooser FDateSearchStudent;
    private javax.swing.JTextField FIDSearchStudent;
    private javax.swing.JTextField FNameSearchStudent;
    private javax.swing.JButton btnAddtoPkgList;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnGVSave;
    private javax.swing.JComboBox<String> cbRemPkg;
    private javax.swing.JComboBox<String> cbSelectedGV;
    private javax.swing.JCheckBox chkF;
    private javax.swing.JCheckBox chkM;
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
