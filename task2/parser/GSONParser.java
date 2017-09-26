package task2.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GSONParser implements IJSONParser {
    @Override
    public void toJSON(File file, Object object) {

    }

    @Override
    public Object fromJSON(File file, Class c) {
        Object object = null;
        try (JsonReader jsonReader = new JsonReader(new FileReader(file))) {
            Gson gson = new GsonBuilder().create();
            object = gson.fromJson(jsonReader, c);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }
}
