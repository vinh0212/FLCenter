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

    public Student getStudentById(int id) {
        for (Student s : listStudents) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public Lop getLopByID(int id) {
        for (Lop c : listLops) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void addA(Lop lop) {
        int id = 1;
        if (listLops.size() > 0) {
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
        writeListLops(listLops);
    }

    public boolean deleteA(Lop lop) {
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


    public void sortClassListbyID()
    {
        Collections.sort(listLops, new Comparator<Lop>() {
            @Override
            public int compare(Lop l1, Lop l2) {
                return l1.getId() - l2.getId();
            }
        });
    }

    public void sortClassListbySL()
    {
        Collections.sort(listLops, new Comparator<Lop>() {
            @Override
            public int compare(Lop l1, Lop l2) {
                return l1.getIdStudent().size() - l2.getIdStudent().size();
            }
        });
    }

    public void sortStudentListbyID()
    {
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getId() - s2.getId();
            }
        });
    }

    public void sortStudentListbyName()
    {
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
    }

    public void sortStudentListbyDiem()
    {
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Float.compare(s1.getDiem(), s2.getDiem());
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
