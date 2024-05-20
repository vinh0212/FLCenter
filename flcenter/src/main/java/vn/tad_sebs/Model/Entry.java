package vn.tad_sebs.Model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Entry {
    @XmlElement(name = "idMonhoc")
    private Integer idMonhoc;

    @XmlElement(name = "idTeacher")
    private Integer idTeacher;

    public Integer getIdMonhoc() {
        return idMonhoc;
    }

    public void setIdMonhoc(Integer idMonhoc) {
        this.idMonhoc = idMonhoc;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    
}
