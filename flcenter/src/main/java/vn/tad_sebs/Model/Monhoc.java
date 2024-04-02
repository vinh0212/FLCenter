package vn.tad_sebs.Model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "subject")
@XmlAccessorType(XmlAccessType.FIELD)

public class Monhoc implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int Id;
    private String Name;
    private int Tinchi;
    private int Khoa;
    
    public Monhoc(){}
    public Monhoc(int Id,String Name,int Tinchi,int Khoa,String Giangvien)
    {
        this.Id = Id;
        this.Name = Name;
        this.Tinchi = Tinchi;
        this.Khoa = Khoa;
        
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

    public int getTinchi() {
        return Tinchi;
    }

    public void setTinchi(int Tinchi) {
        this.Tinchi = Tinchi;
    }

    public int getKhoa() {
        return Khoa;
    }

    public void setKhoa(int Khoa) {
        this.Khoa = Khoa;
    }
}
