package task1.parser;

import java.io.File;

public interface IParser {
    Object getObject(File file, Class c);
    void saveObject(File file, Object object);
}
