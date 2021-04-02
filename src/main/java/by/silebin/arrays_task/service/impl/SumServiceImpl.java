package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SumService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class SumServiceImpl implements SumService {

    public static final Logger LOGGER = LogManager.getLogger(SumServiceImpl.class.getName());

    public int sum(ArrayEntity array) throws EmptyArrayException {
        LOGGER.info("Counting sum of array");
        int[] arr = array.getArray();
        if (arr.length != 0) {
            int sum = IntStream.of(arr)
                    .sum();
            return sum;
        } else {
            LOGGER.warn("Empty array");
            throw new EmptyArrayException();
        }
    }
}
