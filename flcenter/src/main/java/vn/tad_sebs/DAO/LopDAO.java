package vn.tad_sebs.DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.tad_sebs.Model.Lop;
import vn.tad_sebs.Model.LopXML;
import vn.tad_sebs.Model.Monhoc;
import vn.tad_sebs.Utils.FileUtils;
import vn.tad_sebs.Model.StudentXML;
import vn.tad_sebs.Model.TeacherXML;
import vn.tad_sebs.Model.Student;
import vn.tad_sebs.Model.Teacher;

public class LopDAO {
    private List<Lop> listLops;
    private List<Student> listStudents;
    private List<Teacher> listTeachers;
    private static final String LOP_FILE_NAME = "lop.xml";
    private static final String STUDENT_FILE_NAME = "student.xml";
    private static final String TEACHER_FILE_NAME = "teacher.xml";

    public LopDAO() {
        this.listLops = readListLops();
        this.listStudents = readListStudents();
        this.listTeachers = readListTeachers();
        if (listLops == null) {
            listLops = new ArrayList<Lop>();
        }
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

    public List<Teacher> readListTeachers() {
            
        List<Teacher> list = new ArrayList<Teacher>();
        TeacherXML teacherXML = (TeacherXML) FileUtils.readXMLFile(
                TEACHER_FILE_NAME, TeacherXML.class);
        if (teacherXML != null) {
            list = teacherXML.getTeacher();
        }
        
        return list;   
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

    public void add(Lop lop)
    {
        int id = 1;
        if(listLops.size() > 0)
        {
            id = listLops.get(listLops.size() - 1).getId() + 1;
        }
        lop.setId(id);
        listLops.add(lop);
        writeListLops(listLops);
    }

    public void editA(Lop lop)
    {
        for(Lop l : listLops)
        {
            if(l.getId() == lop.getId())
            {
                l.setName(lop.getName());
                l.setNote(lop.getNote());
            }
        }
        writeListLops(listLops);
    }

    public boolean deleteA(Lop lop)
    {
        boolean isFound = false;
            for (Lop c : listLops) {
                if (c.getId() == lop.getId()) {
                    listLops.remove(c);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                writeListLops(listLops);
                return true;
            }
            return false;
    }

    

}
