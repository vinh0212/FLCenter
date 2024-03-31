/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.tad_sebs.Model;

/**
 *
 * @author ASUS
 */
public class Teacher extends Canbo
{
    private String Lop;
    private String Mon;
    public Teacher(){}
    public Teacher(int Id,String Name,String Date,String Sex,String Address, String Capbacham,String Lop,String Mon)
    {
        super(Id,Name,Date,Sex,Address,Capbacham);
        this.Lop=Lop;
        this.Mon=Mon;
    }
    public String getLop()
    {
        return this.Lop;
    }
    public String getMon()
    {
        return this.Mon;
    }
    public void setLop(String Lop)
    {
        this.Lop=Lop;
    }
    public void setMon(String Mon)
    {
        this.Mon=Mon;
    }
}
