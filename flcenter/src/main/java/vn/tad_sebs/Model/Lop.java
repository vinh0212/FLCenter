package vn.tad_sebs.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlRootElement(name = "lop")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lop implements Serializable {
    private static final long serialVersionUID = 1L;
    private int Id;
    private String Name;
    private String Note;
    
    @XmlElementWrapper(name = "idStudentList")
    @XmlElement(name = "idStudent")
    private List<Integer> idStudent;
    
    @XmlElementWrapper(name = "idMonhocList")
    @XmlElement(name = "idMonhoc")
    private List<Integer> idMonhoc;
    
    
    

    public Lop() {
        this.idMonhoc = new ArrayList<>();
        this.idStudent = new ArrayList<>();
        this.Note = "";
    }

    public Lop(int Id, String Name, List<Integer> idStudent, String Note, List<Integer> idMonhoc) {
        super();
        this.Id = Id;
        this.Name = Name;
        this.idStudent = idStudent;
        this.Note = Note;
        this.idMonhoc = idMonhoc;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public List<Integer> getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(List<Integer> idStudent) {
        this.idStudent = idStudent;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public List<Integer> getIdMonhoc() {
        return idMonhoc;
    }

    public void setIdMonhoc(List<Integer> idMonhoc) {
        this.idMonhoc = idMonhoc;
    }
    
}
