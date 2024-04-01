/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.tad_sebs.Model;

/**
 *
 * @author ASUS
 */

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "teacher")
@XmlAccessorType(XmlAccessType.FIELD)
public class Teacher implements Serializable
{
    private static final long serialVersionUID = 2L;
    private int Id;
    private String Name;
    private String Date;
    private String Sex;
    private String Address;
    private String Capbacham;
    private String Lop;
    private String Mon;
    public Teacher(){}
    public Teacher(int Id,String Name,String Date,String Sex,String Address, String Capbacham,String Lop,String Mon)
    {
        super();
        this.Id=Id;
        this.Name=Name;
        this.Date=Date;
        this.Sex=Sex;
        this.Address=Address;
        this.Capbacham=Capbacham;
        
        this.Lop=Lop;
        this.Mon=Mon;
    }
    public int getId()
    {
        return this.Id;
    }
    public String getName()
    {
        return this.Name;
    }
    public String getDate()
    {
        return this.Date;
    }
    public String getSex()
    {
        return this.Sex;
    }
    public String getAddress()
    {
        return this.Address;
    }
    public String getCapbacham()
    {
        return this.Capbacham;
    }
    public void setId(int Id)
    {
        this.Id=Id;
    }
    public void setSex(String Sex)
    {
        this.Sex=Sex;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setDate(String Date)
    {
        this.Date=Date;
    }
    public void setAddress(String Address)
    {
        this.Address=Address;
    }
    public void setCapbacham(String Capbacham)
    {
        this.Capbacham=Capbacham;
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
