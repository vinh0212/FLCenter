package vn.tad_sebs.Model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "classes")
@XmlAccessorType(XmlAccessType.FIELD)
public class LopXML {
    private List<Lop> lop;
    
    public List<Lop> getLop() {
        return lop;
    }

    public void setLop(List<Lop> lop) {
        this.lop = lop;
    }
}
