package vn.tad_sebs.Model;
import java.io.Serializable;
public class Monhoc implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int Id;
    private String Name;
    private String Tinchi;
    private String Khoa;
    private String Giangvien;
    public Monhoc(){}
    public Monhoc(int Id,String Name,String Tinchi,String Khoa,String Giangvien)
    {
        this.Id = Id;
        this.Name = Name;
        this.Tinchi = Tinchi;
        this.Khoa = Khoa;
        this.Giangvien = Giangvien;
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

    public String getTinchi() {
        return Tinchi;
    }

    public void setTinchi(String Tinchi) {
        this.Tinchi = Tinchi;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getGiangvien() {
        return Giangvien;
    }

    public void setGiangvien(String Giangvien) {
        this.Giangvien = Giangvien;
    }
}
