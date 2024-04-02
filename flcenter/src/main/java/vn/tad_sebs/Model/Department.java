package vn.tad_sebs.Model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "department")
@XmlAccessorType(XmlAccessType.FIELD)
public class Department implements Serializable
{
    private static final long serialVersionUID = 2L;
    private int Id;
    private String Name;
    private String Detail;
    
    public Department(){}
    public Department(int Id,String Name,String Detail)
    {
        super();
        this.Id=Id;
        this.Name=Name;
        this.Detail=Detail;
    }
    public int getId()
    {
        return this.Id;
    }
    public String getName()
    {
        return this.Name;
    }
    public String getDetail()
    {
        return this.Detail;
    }
    public void setId(int Id)
    {
        this.Id=Id;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setDetail(String Detail)
    {
        this.Detail=Detail;
    }
    

}
