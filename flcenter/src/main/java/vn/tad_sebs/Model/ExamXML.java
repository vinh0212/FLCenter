package vn.tad_sebs.Model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "exams")
@XmlAccessorType(XmlAccessType.FIELD)

public class ExamXML {
    private List<Exam> exam;
    
    public List<Exam> getExam() {
        return exam;
    }

    public void setExam(List<Exam> exam) {
        this.exam = exam;
    }
}
