package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SearchService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SearchServiceImpl implements SearchService {

    public static final Logger LOGGER = LogManager.getLogger(SearchServiceImpl.class.getName());

    public int searchMaxValue(ArrayEntity array) throws EmptyArrayException {
        LOGGER.info("Searching max value");
        OptionalInt min = IntStream.of(array.getArray())
                .max();
        if (min.isPresent()) {
            return min.getAsInt();
        } else {
            LOGGER.warn("Empty array");
            throw new EmptyArrayException();
        }
    }

    public int searchMinValue(ArrayEntity array) throws EmptyArrayException {
        LOGGER.info("Searching min value");
        OptionalInt min = IntStream.of(array.getArray())
                .min();
        if (min.isPresent()) {
            return min.getAsInt();
        } else {
            LOGGER.warn("Empty array");
            throw new EmptyArrayException();
        }
    }
}