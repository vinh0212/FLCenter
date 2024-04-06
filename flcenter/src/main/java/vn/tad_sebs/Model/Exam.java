package vn.tad_sebs.Model;
import java.io.Serializable;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "exam")
@XmlAccessorType(XmlAccessType.FIELD)
public class Exam implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int id;
    private String Name;
    private String Time;
    private int Giamthi;
    public Exam (){}
    public Exam(int Id, String Name, String Time, int Giamthi) {
        this.id = Id;
        this.Name = Name;
        this.Time = Time;
        this.Giamthi = Giamthi;
    }

    // Getter and Setter methods
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getTime() {
        return this.Time;
    }

    public void setTime(String time) {
        this.Time = time;
    }

    public int getGiamthi() {
        return this.Giamthi;
    }

    public void setGiamthi(int giamthi) {
        this.Giamthi = giamthi;
    }
}
