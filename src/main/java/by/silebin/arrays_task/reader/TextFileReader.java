package by.silebin.arrays_task.reader;

import by.silebin.arrays_task.reader.exception.NoValidDataException;

public interface TextFileReader {
    String readFile(String file) throws NoValidDataException;
}
