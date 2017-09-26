package task3.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "results")
public class RatesFactory {

    @XmlElement(name = "rate")
    private ArrayList<Rate> rates = new ArrayList<>();

    public ArrayList<Rate> getRates() {
        return rates;
    }
}
