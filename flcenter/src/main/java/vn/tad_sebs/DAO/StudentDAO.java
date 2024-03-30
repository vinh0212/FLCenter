package vn.tad_sebs.DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.tad_sebs.Model.Student;
import vn.tad_sebs.Model.StudentXML;
import vn.tad_sebs.Utils.FileUtils;

public class StudentDAO {
    private List<Student> listStudents;
    private StudentXML studentXML;
    private static final String STUDENT_FILE_NAME = "student.xml";

    public StudentDAO() {
        this.listStudents = readListStudents();
        if (listStudents == null) {
            listStudents = new ArrayList<Student>();
        }
    }

    public List<Student> readListStudents() {
        List<Student> list = new ArrayList<Student>();
        StudentXML studentXML = (StudentXML) FileUtils.readXMLFile(
                STUDENT_FILE_NAME, StudentXML.class);
        if (studentXML != null) {
            list = studentXML.getStudent();
        }
        return list;
    }

    public void writeListStudents(List<Student> students) {
        StudentXML studentXML = new StudentXML();
        studentXML.setStudent(students);
        FileUtils.writeXMLtoFile(STUDENT_FILE_NAME, studentXML);
    }

    public void add(Student student) {
        int id = 1;
        if (listStudents != null && listStudents.size() > 0) {
            id = listStudents.size() + 1;
        }
        student.setId(id);
        listStudents.add(student);
        writeListStudents(listStudents);
    }

    public void edit(Student student) {
        for (Student s : listStudents) {
            if (s.getId() == student.getId()) {
                s.setName(student.getName());
                s.setDate(student.getDate());
                s.setGioitinh(student.getGioitinh());
                s.setAddress(student.getAddress());
                s.setLop(student.getLop());
                s.setGVCN(student.getGVCN());
                s.setDiem(student.getDiem());
                writeListStudents(listStudents);
                break;
            }
        }
        
    }

    public boolean delete(Student student) {
        boolean isFound = false;
        for (Student s : listStudents) {
            if (s.getId() == student.getId()) {
                student = s;
                isFound = true;
                break;
            }
        }
        if (isFound) {
            listStudents.remove(student);
            writeListStudents(listStudents);
            return true;
        }
        return false;
    }

    
        

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }
}
