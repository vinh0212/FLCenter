package vn.tad_sebs.DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.tad_sebs.Model.Monhoc;
import vn.tad_sebs.Model.MonhocXML;
import vn.tad_sebs.Utils.FileUtils;
import vn.tad_sebs.Model.Department;
import vn.tad_sebs.Model.DepartmentXML;
public class SubjectDAO {
    private List<Monhoc> listSubjects;
    private static final String SUBJECT_FILE_NAME = "subject.xml";
    private List<Department> listDepartments;
    private static final String DP_FILE_NAME = "department.xml";

    public SubjectDAO() {
        this.listSubjects = readListSubjects();
        this.listDepartments = readListDepartments();
        if (listSubjects == null) {
            listSubjects = new ArrayList<Monhoc>();
        }
    }

    public List<Monhoc> readListSubjects() {
        
        List<Monhoc> list = new ArrayList<Monhoc>();
        MonhocXML subjectXML = (MonhocXML) FileUtils.readXMLFile(
                SUBJECT_FILE_NAME, MonhocXML.class);
        if (subjectXML != null) {
            list = subjectXML.getMonhoc();
        }
        
        return list;
        
    }

    public List<Department> readListDepartments() {
        List<Department> list = new ArrayList<Department>();
        DepartmentXML departmentXML = (DepartmentXML) FileUtils.readXMLFile(
                DP_FILE_NAME, DepartmentXML.class);
        if (departmentXML != null) {
            list = departmentXML.getDepartment();
        }
        return list;
    }

    public List<Department> getListDepartments() {
        return listDepartments;
    }

    public void writeListSubjects(List<Monhoc> subjects) {
        MonhocXML subjectXML = new MonhocXML();
        subjectXML.setMonhoc(subjects);
        FileUtils.writeXMLtoFile(SUBJECT_FILE_NAME, subjectXML);
    }

    public void add(Monhoc subject) {
        int id = 1;
        if (listSubjects.size() > 0) {
            id = listSubjects.get(listSubjects.size() - 1).getId() + 1;
        }
        subject.setId(id);
        listSubjects.add(subject);
        writeListSubjects(listSubjects);
    }

    public void edit(Monhoc subject) {
        for (Monhoc m : listSubjects) {
            if (m.getId() == subject.getId()) {
                m.setName(subject.getName());
                m.setKhoa(subject.getKhoa());
                m.setTinchi(subject.getTinchi());
                writeListSubjects(listSubjects);
            }
        }
        
    }

    public boolean delete(Monhoc subject) {
        boolean isFound = false;
            for (Monhoc m : listSubjects) {
                if (m.getId() == subject.getId()) {
                    listSubjects.remove(m);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                writeListSubjects(listSubjects);
                return true;
            }
            return false;
    }

    public void sortListSubjectsbyID()
    {
        Collections.sort(listSubjects, new Comparator<Monhoc>() {
            @Override
            public int compare(Monhoc o1, Monhoc o2) {
                return o1.getId() - o2.getId();
            }
        });
    }

    public void sortListSubjectsbyName()
    {
        Collections.sort(listSubjects, new Comparator<Monhoc>() {
            @Override
            public int compare(Monhoc o1, Monhoc o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void sortListSubjectsbyTinchi()
    {
        Collections.sort(listSubjects, new Comparator<Monhoc>() {
            @Override
            public int compare(Monhoc o1, Monhoc o2) {
                return o1.getTinchi() - o2.getTinchi();
            }
        });
    }

    public List<Monhoc> getListSubjects() {
        return listSubjects;
    }

    public void setListSubjects(List<Monhoc> listSubjects) {
        this.listSubjects = listSubjects;
    }


}
