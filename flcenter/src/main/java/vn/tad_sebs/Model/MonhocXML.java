package vn.tad_sebs.Model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "subjects")
@XmlAccessorType(XmlAccessType.FIELD)
public class MonhocXML {
    private List<Monhoc> monhoc;
    
    public List<Monhoc> getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(List<Monhoc> monhoc) {
        this.monhoc = monhoc;
    }
}
