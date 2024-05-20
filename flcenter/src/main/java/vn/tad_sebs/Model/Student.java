package vn.tad_sebs.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)



public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String Date;
    private String Address;
    private String Gioitinh;
    @XmlElementWrapper(name = "lop")
    @XmlElement(name = "id")
    private List<Integer> lop;

    @XmlElementWrapper(name = "courseTeacherMap")
    @XmlElement(name = "entry")
    private List<CourseTeacherEntry> courseTeacherMap;

    @XmlElementWrapper(name = "courseFeeMap")
    @XmlElement(name = "entry")
    private List<CourseFeeEntry> courseFeeMap;

    public Student() {
        super();
        this.lop = new ArrayList<Integer>();
        this.courseTeacherMap = new ArrayList<CourseTeacherEntry>();
        this.courseFeeMap = new ArrayList<CourseFeeEntry>();
    }

    public Student(int id, String name, String Date, String Gioitinh, String Address, List<Integer> Lop,
        List<CourseTeacherEntry> courseTeacherMap, List<CourseFeeEntry> courseFeeMap) {
        super();
        this.id = id;
        this.name = name;
        this.Date = Date;
        this.Gioitinh = Gioitinh;
        this.Address = Address;
        this.lop = Lop;
        this.courseTeacherMap = courseTeacherMap;
        this.courseFeeMap = courseFeeMap;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return Date;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public String getAddress() {
        return Address;
    }

    public List<Integer> getLop() {
        return lop;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setLop(List<Integer> Lop) {
        this.lop = Lop;
    }

    public List<CourseTeacherEntry> getCourseTeacherMap() {
        return courseTeacherMap;
    }

    public void setCourseTeacherMap(List<CourseTeacherEntry> courseTeacherMap) {
        this.courseTeacherMap = courseTeacherMap;
    }

    public List<CourseFeeEntry> getCourseFeeMap() {
        return courseFeeMap;
    }

    public void setCourseFeeMap(List<CourseFeeEntry> courseFeeMap) {
        this.courseFeeMap = courseFeeMap;
    }

}
