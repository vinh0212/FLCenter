package vn.tad_sebs.DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

import vn.tad_sebs.Model.Lop;
import vn.tad_sebs.Model.LopXML;

import vn.tad_sebs.Utils.FileUtils;

import vn.tad_sebs.Model.Student;
import vn.tad_sebs.Model.Teacher;

public class LopDAO {
    private List<Lop> listLops;
    public List<Student> listStudents;
    private List<Teacher> listTeachers;
    private static final String LOP_FILE_NAME = "lop.xml";
    private static final String STUDENT_FILE_NAME = "student.xml";
    private static final String TEACHER_FILE_NAME = "teacher.xml";

    public LopDAO() {
        this.listLops = readListLops();
        if (this.listLops == null) {
            this.listLops = new ArrayList<Lop>();
        }

        getListStudents(); // Đảm bảo rằng listStudents đã được khởi tạo

        // Tạo một HashMap để lưu trữ danh sách học sinh theo lớp
        Map<Integer, List<Student>> studentMap = new HashMap<>();
        for (Student s : listStudents) {
            if (s.getLop() != null) {
                for (int idLop : s.getLop()) {
                    if (!studentMap.containsKey(idLop)) {
                        studentMap.put(idLop, new ArrayList<>());
                    }
                    studentMap.get(idLop).add(s);
                }
            }
        }
        
        
    }

    public void getListStudents() {
        listStudents = new StudentDAO().readListStudents();
    }

    public void writeListLops(List<Lop> lops) {
        LopXML lopXML = new LopXML();
        lopXML.setLop(lops);
        FileUtils.writeXMLtoFile(LOP_FILE_NAME, lopXML);
    }

    public List<Lop> readListLops() {
        List<Lop> list = new ArrayList<Lop>();
        LopXML lopXML = (LopXML) FileUtils.readXMLFile(
                LOP_FILE_NAME, LopXML.class);
        if (lopXML != null) {
            list = lopXML.getLop();
        }

        return list;
    }

    public Student getStudentById(int id) {
        Student student = new Student();
        for (Student s : listStudents) {
            if (s.getId() == id) {
                student = s;
                break;
            }
        }
        return student;
    }

    public Lop getLopByID(int id) {
        Lop lop = new Lop();
        for (Lop l : listLops) {
            if (l.getId() == id) {
                lop = l;
                break;
            }
        }
        return lop;
    }

    public void addA(Lop lop) {

        int id = 1;
        if (listLops.size() > 0) {
            sortClassListbyID();
            id = listLops.get(listLops.size() - 1).getId() + 1;
        }
        lop.setId(id);
        listLops.add(lop);

        writeListLops(listLops);
    }

    public void editA(Lop lop) {
        for (Lop l : listLops) {
            if (l.getId() == lop.getId()) {
                l.setName(lop.getName());
                l.setNote(lop.getNote());
                l.setIdMonhoc(lop.getIdMonhoc());
                
            }
        }
        sortClassListbyID();
        writeListLops(listLops);
    }

    public void addStudent(Student student) {
        // Tìm lớp hiện tại của học sinh
        Lop currentLop = null;
        for (Lop l : listLops) {
            if (l.getIdStudent() != null && l.getIdStudent().contains(student.getId())) {
                currentLop = l;
                break;
            }
        }

        // Nếu học sinh đã có lớp
        if (currentLop != null) {
            // Nếu học sinh chưa có lớp nào khác
            if (student.getLop() == null || student.getLop().isEmpty()) {
                currentLop.getIdStudent().remove(Integer.valueOf(student.getId()));
            } else {
                // Nếu học sinh đã có lớp khác
                currentLop.getIdStudent().remove(Integer.valueOf(student.getId()));
                writeListLops(listLops);
                return;
            }
        }

        // Thêm học sinh vào lớp mới
        for (Lop l : listLops) {
            for (int id : student.getLop()) {
                if (l.getId() == id) {
                    if (l.getIdStudent() == null) {
                        l.setIdStudent(new ArrayList<>());
                    }
                    l.getIdStudent().add(student.getId());
                    break;
                }
            }
        }
        writeListLops(listLops);
    }

    public void deleteStudent(Student student) {
        for (Lop l : listLops) {
            if (l.getIdStudent() != null && l.getIdStudent().contains(student.getId())) {
                l.getIdStudent().remove(Integer.valueOf(student.getId()));
            }
        }
        writeListLops(listLops);
    }

    public void editC(Lop lop) {
        for (Lop l : listLops) {
            if (l.getId() == lop.getId()) {
                l.setIdMonhoc(lop.getIdMonhoc());
            }
        }
        sortClassListbyID();
        writeListLops(listLops);
    }

    public void deleteC(Lop lop, int idMonhoc) {
        for (Lop l : listLops) {
            if (l.getId() == lop.getId()) {
                List<Integer> idMonhocList = l.getIdMonhoc();
                idMonhocList.remove(Integer.valueOf(idMonhoc));
                l.setIdMonhoc(idMonhocList);
                break;
            }
        }
        sortClassListbyID();
        writeListLops(listLops);
    }

    public boolean deleteA(Lop lop) {
        boolean isFound = false;
        for (Lop c : listLops) {
            if (c.getId() == lop.getId()) {
                if (c.getIdStudent() == null || c.getIdStudent().isEmpty()) {
                    listLops.remove(c);
                    isFound = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Không thể xoá do còn học viên trong lớp!", "Message", 1);
                    break;
                }

            }
        }
        if (isFound) {
            sortClassListbyID();
            writeListLops(listLops);
            return true;
        }
        return false;
    }

    public void sortClassListbyID() {
        Collections.sort(listLops, new Comparator<Lop>() {
            @Override
            public int compare(Lop l1, Lop l2) {
                return l1.getId() - l2.getId();
            }
        });
    }

    public void sortClassListbySL() {
        Collections.sort(listLops, new Comparator<Lop>() {
            @Override
            public int compare(Lop l1, Lop l2) {
                return l1.getIdStudent().size() - l2.getIdStudent().size();
            }
        });
    }

    public void sortStudentListbyID() {
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getId() - s2.getId();
            }
        });
    }

    public void sortStudentListbyName() {
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
    }

    
    public List<Lop> getListLops() {
        return listLops;
    }

    public void setListLops(List<Lop> listLops) {
        this.listLops = listLops;
    }

}
