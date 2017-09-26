package task2.parser;

import java.io.File;

public interface IJSONParser {
    void toJSON(File file, Object object);
    Object fromJSON(File file, Class c);
}
