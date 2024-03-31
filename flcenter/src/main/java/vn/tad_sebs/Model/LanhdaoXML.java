package vn.tad_sebs.Model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "lanhdaos")
@XmlAccessorType(XmlAccessType.FIELD)

public class LanhdaoXML {
    private List<Lanhdao> lanhdao;

    public List<Lanhdao> getLanhdao() {
        return lanhdao;
    }

    public void setLanhdao(List<Lanhdao> lanhdao) {
        this.lanhdao = lanhdao;
    }
}
