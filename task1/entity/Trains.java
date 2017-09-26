package task1.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@XmlRootElement(name = "trains")
public class Trains {

    //По условию задания у нас указан сегодняшний (текущий день) с 15:00 до 19:00.
    //Можно дописать метод который будет принимать на вход разные значения даты и время
    private static Calendar departureFrom = Calendar.getInstance();
    private static Calendar departureTo = Calendar.getInstance();

    static {
        departureFrom.set(Calendar.HOUR_OF_DAY, 15);
        departureFrom.set(Calendar.MINUTE, 0);
        departureFrom.set(Calendar.SECOND, 0);
        departureTo.set(Calendar.HOUR_OF_DAY, 19);
        departureTo.set(Calendar.MINUTE, 0);
        departureTo.set(Calendar.SECOND, 0);
        departureFrom.add(Calendar.SECOND, -1);
        departureTo.add(Calendar.SECOND, 1);
    }

    @XmlElement(name = "train")
    private ArrayList<Train> trains = new ArrayList<>();

    public void addTrain(Train train) {
        trains.add(train);
    }

    public void showActiveTrains() {
        for (Train train : trains) {
            Date departureDate = train.getFullDate().getTime();
            if (departureFrom.getTime().before(departureDate) && departureTo.getTime().after(departureDate)) {
                System.out.println("Поезд: " + train.getFrom() + " - " + train.getTo() +
                        " отправляеться сегодня (" + train.getDate() + ") в " + train.getDeparture());
            }
        }
    }
}
