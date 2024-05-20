package vn.tad_sebs.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)

public class CourseTeacherEntry {
    @XmlElement(name = "courseId")
    private Integer courseId;

    @XmlElementWrapper(name = "teacherMap")
    @XmlElement(name = "entry")
    private List<Entry> teacherMap;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public List<Entry> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(List<Entry> teacherMap) {
        this.teacherMap = teacherMap;
    }

    

    

}
