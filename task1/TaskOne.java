package task1;

import task1.entity.Train;
import task1.entity.Trains;
import task1.parser.IParser;
import task1.parser.TrainJAXBParser;

import java.io.File;

public class TaskOne {

    final static File file = new File("D:\\SpringLessons\\JsonAndXML\\JsonAndXML\\src\\Tas1\\trains.xml");

    public static void start(){
        System.out.println("Поезда на сегодня, с 15-00 до 19-00: ");
        IParser parser = new TrainJAXBParser();

        Trains trains = (Trains) parser.getObject(file, Trains.class);
        trains.showActiveTrains();

        System.out.println("Добавляем один ппоезд.");
        Train train = new Train("Kiev", "Warsaw", "26.09.2017", "17:23");
        trains.addTrain(train);

        parser.saveObject(file, trains);
    }
}
