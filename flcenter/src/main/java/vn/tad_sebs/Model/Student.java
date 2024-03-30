package vn.tad_sebs.Model;
import java.io.Serializable;

public class Student
{
    private int id;
    private String name;
    private String Date;
    private String Address;
    private String GVCN;
    private float Diem;
    private String Gioitinh;
    private String Lop;
    public Student(int id, String name, String Date , String Gioitinh,String Address, String Lop, String GVCN, float Diem) {
        super();
        this.id = id;
        this.name = name;
        this.Date = Date;
        this.Gioitinh=Gioitinh;
        this.Address = Address;
        this.Lop = null;
        this.GVCN=GVCN;
        this.Diem=Diem;
    }
    public int getId() {
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getDate(){
        return this.Date;
    }
    public String getGioitinh(){
        return this.Gioitinh;
    }
    public String getAddress(){
        return this.Address;
    }
    //public String getLop(){
    //   return this.Lop;
    //}
    public String getGVCN(){
        return this.GVCN;
    }
    public float getDiem(){
        return this.Diem;
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
    //public void setLop(String Lop)
    public void setGVCN(String GVCN){
        this.GVCN=GVCN;
    }      
    public void setDiem(float Diem){
        this.Diem=Diem;
    }
}   
