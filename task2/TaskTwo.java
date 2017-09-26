package task2;

import task2.entity.Person;
import task2.parser.GSONParser;
import task2.parser.IJSONParser;

import java.io.File;

public class TaskTwo {
    private static File file = new File("D:\\SpringLessons\\JsonAndXML\\JsonAndXML\\src\\task2\\person.json");

    public static void start(){
        IJSONParser parser = new GSONParser();
        Person person = (Person) parser.fromJSON(file, Person.class);
        System.out.println(person + "\n");
    }
}
