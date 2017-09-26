package task3.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "query")
public class Query {
    private RatesFactory rates;

    public RatesFactory getRates() {
        return rates;
    }

    @XmlElement(name = "results")
    public void setRates(RatesFactory rates) {
        this.rates = rates;
    }
}
