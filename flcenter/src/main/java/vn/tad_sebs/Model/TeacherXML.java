package vn.tad_sebs.Model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "teachers")
@XmlAccessorType(XmlAccessType.FIELD)
public class TeacherXML {
    private List<Teacher> teacher;
    private List<Department> department;
    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }
}
