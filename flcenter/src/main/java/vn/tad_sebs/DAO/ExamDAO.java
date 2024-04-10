package vn.tad_sebs.DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.tad_sebs.Model.Exam;
import vn.tad_sebs.Model.ExamXML;
import vn.tad_sebs.Model.Teacher;
import vn.tad_sebs.Utils.FileUtils;


public class ExamDAO {
    private List<Exam> listExams;
    private static final String EXAM_FILE_NAME = "exam.xml";

    public ExamDAO() {
        this.listExams = readListExams();

        if (listExams == null) {
            listExams = new ArrayList<Exam>();
        }
    }

    public void writeListExams(List<Exam> exams) {
        ExamXML examXML = new ExamXML();
        examXML.setExam(exams);
        FileUtils.writeXMLtoFile(EXAM_FILE_NAME, examXML);
    }

    public List<Exam> readListExams() {
        List<Exam> list = new ArrayList<Exam>();
        ExamXML examXML = (ExamXML) FileUtils.readXMLFile(
                EXAM_FILE_NAME, ExamXML.class);
        if (examXML != null) {
            list = examXML.getExam();
        }
        
        
        return list;
    }

    public List<Teacher> getListGiamthi(int id)
    {
        List<Teacher> list = new ArrayList<Teacher>();
        for (Exam e : listExams) {
            if (e.getId() == id) {
                list = e.getGiamthi();
                break;
            }
        }
        return list;
    }

    

    public void add(Exam exam) {
        sortbyID();
        int id = 1;
        if (listExams.size() > 0) {
            id = listExams.get(listExams.size() - 1).getId() + 1;
        }
        exam.setId(id);
        listExams.add(exam);
        
        writeListExams(listExams);
    }

    public void edit(Exam exam)
    {
        for (Exam e : listExams) {
            if (e.getId() == exam.getId()) {
                e.setName(exam.getName());
                e.setGiamthi(exam.getGiamthi());
                e.setTime(exam.getTime());
                break;
            }
        }

        sortbyID();
        writeListExams(listExams);
    }

    public boolean delete(Exam exam)
    {
        boolean isFound = false;
        for (Exam e : listExams) {
            if (e.getId() == exam.getId()) {
                listExams.remove(e);
                isFound = true;
                break;
            }
        }

        if(isFound)
        {
            sortbyID();
            writeListExams(listExams);
            return true;
        }
        return false;
    }

    public void sortbyID()
    {
        Collections.sort(listExams, new Comparator<Exam>() {
            @Override
            public int compare(Exam o1, Exam o2) {
                return o1.getId() - o2.getId();
            }
        });
    }

    public void sortbyTime()
    {
        Collections.sort(listExams, new Comparator<Exam>() {
            @Override
            public int compare(Exam o1, Exam o2) {
                return o1.getTime().compareTo(o2.getTime());
            }
        });
    }

    public List<Exam> getListExams() {
        return listExams;
    }

    public void setListExams(List<Exam> listExams) {
        this.listExams = listExams;
    }
}
