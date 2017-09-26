package task3.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@XmlRootElement(name = "rate")
public class Rate {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("M/dd/YYYY HH:mma");

    private String name;
    private Double rate;
    private String date;
    private String time;
    private Double ask;
    private Double bid;

    public Rate() {
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "Name")
    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    @XmlElement(name = "Rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getDate() {
        return date;
    }

    @XmlElement(name = "Date")
    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    @XmlElement(name = "Time")
    public void setTime(String time) {
        this.time = time;
    }

    public Double getAsk() {
        return ask;
    }

    @XmlElement(name = "Ask")
    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Double getBid() {
        return bid;
    }

    @XmlElement(name = "Bid")
    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Date getFullDate(){
        try {
            return DATE_FORMAT.parse(this.date + " " + this.time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "\nRate{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", ask=" + ask +
                ", bid=" + bid +
                '}';
    }
}
