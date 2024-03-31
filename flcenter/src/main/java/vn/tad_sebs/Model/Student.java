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
    private String GVCN;
    private float Diem;
    private String Gioitinh;
    private String Lop;
    public Student(){}
    public Student(int id, String name, String Date , String Gioitinh,String Address, String Lop, String GVCN, float Diem) {
        super();
        this.id = id;
        this.name = name;
        this.Date = Date;
        this.Gioitinh=Gioitinh;
        this.Address = Address;
        this.Lop = Lop;
        this.GVCN=GVCN;
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
    public String getGVCN(){
        return GVCN;
    }
    public float getDiem(){
        return Diem;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
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
    public void setGVCN(String GVCN){
        this.GVCN=GVCN;
    }      
    public void setDiem(float Diem){
        this.Diem=Diem;
    }
}   
