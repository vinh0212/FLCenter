package vn.tad_sebs.Model;
import java.io.Serializable;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.FIELD)
public class Data implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int Id;
    private String Name;
    private String Category;
    private String Author;
    public Data(){}
    public Data(int Id,String Name,String Category,String Author)
    {
        this.Id=Id;
        this.Name=Name;
        this.Category=Category;
        this.Author=Author;
    }
    public int getId() {
        return Id;
    }
    
    public void setId(int id) {
        this.Id = id;
    }
    
    // Getter và setter cho Name
    public String getName() {
        return Name;
    }
    
    public void setName(String name) {
        this.Name = name;
    }
    
    // Getter và setter cho Category
    public String getCategory() {
        return Category;
    }
    
    public void setCategory(String category) {
        this.Category = category;
    }
    
    // Getter và setter cho Author
    public String getAuthor() {
        return Author;
    }
    
    public void setAuthor(String author) {
        this.Author = author;
    }
}
