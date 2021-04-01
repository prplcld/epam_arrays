package by.silebin.arrays_task.parser.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.parser.StringToArrayEntityParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class StringToArrayEntityParserImpl implements StringToArrayEntityParser {

    public static final Logger LOGGER = LogManager.getLogger(StringToArrayEntityParser.class.getName());
    private static final String REGEX_SEPARATOR = "\\s+";

    @Override
    public ArrayEntity parse(String data) {
        String[] split = data.split(REGEX_SEPARATOR);
        int[] array = Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .toArray();
        LOGGER.info("Creating array entity");
        return new ArrayEntity(array);
    }
}
