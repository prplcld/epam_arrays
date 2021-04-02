package by.silebin.arrays_task.reader.impl;

import by.silebin.arrays_task.reader.TextFileReader;
import by.silebin.arrays_task.reader.exception.NoValidDataException;
import by.silebin.arrays_task.validator.ArrayAsStringValidator;
import by.silebin.arrays_task.validator.impl.ArrayAsStringValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFileReaderImpl implements TextFileReader {

    private static final String PATH = "/data/";
    public static final Logger LOGGER = LogManager.getLogger(TextFileReader.class.getName());

    @Override
    public String readFile(String file) throws NoValidDataException {
        String line = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass()
                .getResourceAsStream(PATH + file)))) {

            line = bufferedReader.readLine();
            ArrayAsStringValidator validator = new ArrayAsStringValidatorImpl();

            while (line != null) {
                LOGGER.info("Reading line from " + file);
                if (validator.isValid(line)) {
                    break;
                }
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            LOGGER.error(e);
            e.printStackTrace();
        }

        if (line != null) {
            return line;
        } else {
            LOGGER.warn("No valid data found in a file");
            throw new NoValidDataException();
        }
    }
}
