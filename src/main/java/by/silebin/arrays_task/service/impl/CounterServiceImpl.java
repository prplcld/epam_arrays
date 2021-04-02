package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.CounterService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class CounterServiceImpl implements CounterService {

    public static final Logger LOGGER = LogManager.getLogger(CounterServiceImpl.class.getName());

    @Override
    public long countPositive(ArrayEntity array) throws EmptyArrayException {
        LOGGER.info("Counting amount of positive values");
        int[] arr = array.getArray();
        if (arr.length != 0) {
            long positiveAmount = IntStream.of(arr)
                    .filter(p -> p > 0)
                    .count();
            return positiveAmount;
        } else {
            LOGGER.warn("Empty array");
            throw new EmptyArrayException();
        }
    }

    @Override
    public long countNegative(ArrayEntity array) throws EmptyArrayException {
        LOGGER.info("Counting amount of negative values");
        int[] arr = array.getArray();
        if (arr.length != 0) {
            long negativeAmount = IntStream.of(arr)
                    .filter(p -> p < 0)
                    .count();
            return negativeAmount;
        } else {
            LOGGER.warn("Empty array");
            throw new EmptyArrayException();
        }
    }
}
