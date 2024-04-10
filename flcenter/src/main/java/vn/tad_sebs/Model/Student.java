package vn.tad_sebs.Model;
import java.io.Serializable;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)

public class Student implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String Date;
    private String Address;
    
    private float Diem;
    private String Gioitinh;
    private String Lop;
    public Student(){ this.Diem = 0;  }
    public Student(int id, String name, String Date , String Gioitinh,String Address, String Lop, float Diem) {
        super();
        this.id = id;
        this.name = name;
        this.Date = Date;
        this.Gioitinh=Gioitinh;
        this.Address = Address;
        this.Lop = Lop;
        
        this.Diem=Diem;
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDate(){
        return Date;
    }
    public String getGioitinh(){
        return Gioitinh;
    }
    public String getAddress(){
        return Address;
    }
    public String getLop(){
       return Lop;
    }
    
    public float getDiem(){
        return Diem;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String Name){
        this.name=Name;
    }
    public void setDate(String Date){
        this.Date=Date;
    }
    public void setGioitinh(String Gioitinh){
        this.Gioitinh=Gioitinh;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }
    public void setLop(String Lop){
        this.Lop=Lop;
    }
    
    public void setDiem(float Diem){
        this.Diem=Diem;
    }
}   
