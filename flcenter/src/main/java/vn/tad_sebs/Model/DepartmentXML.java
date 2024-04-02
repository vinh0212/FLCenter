package vn.tad_sebs.Model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "departments")
@XmlAccessorType(XmlAccessType.FIELD)
public class DepartmentXML {
    private List<Department> department;
    public List<Department> getDepartment() {
        return department;
    }
}
