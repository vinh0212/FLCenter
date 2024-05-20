package vn.tad_sebs.Model;

import java.util.HashMap;
import java.util.Map;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)

public class CourseTeacherEntry {
    @XmlElement(name = "courseId")
    private Integer courseId;

    @XmlElement(name = "teacherMap")
    private HashMap<Integer, Integer> teacherMap;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Map<Integer, Integer> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(HashMap<Integer, Integer> teacherMap) {
        this.teacherMap = teacherMap;
    }

    

}
