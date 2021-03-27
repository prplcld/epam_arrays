package by.silebin.arrays_task.creator.impl;

import by.silebin.arrays_task.creator.ArrayCreator;
import by.silebin.arrays_task.entity.ArrayEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayCreatorImpl implements ArrayCreator {

    public static final Logger LOGGER = LogManager.getLogger(ArrayCreatorImpl.class.getName());
    private static final String REGEX_SEPARATOR = "\\s+";

    @Override
    public ArrayEntity createFromString(String data) {
        String[] split = data.split(REGEX_SEPARATOR);
        int[] array = Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .toArray();
        LOGGER.info("Creating array entity");
        return new ArrayEntity(array);
    }
}
