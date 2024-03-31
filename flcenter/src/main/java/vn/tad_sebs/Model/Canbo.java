package vn.tad_sebs.Model;

import java.io.Serializable;

public class Canbo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int Id;
    private String Name;
    private String Date;
    private String Sex;
    private String Address;
    private String Capbacham;
    public Canbo(){}
    public Canbo(int Id,String Name,String Date,String Sex,String Address,String Capbacham)
    {
        super();
        this.Id=Id;
        this.Name=Name;
        this.Date=Date;
        this.Sex=Sex;
        this.Address=Address;
        this.Capbacham=Capbacham;
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
    
}
