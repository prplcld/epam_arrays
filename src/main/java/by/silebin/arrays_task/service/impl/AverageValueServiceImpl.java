package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.AverageValueService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class AverageValueServiceImpl implements AverageValueService {

    private static final Logger LOGGER = LogManager.getLogger(AverageValueServiceImpl.class.getName());

    @Override
    public double countAverageValue(ArrayEntity array) throws EmptyArrayException {
        LOGGER.info("Counting average value");
        int[] arr = array.getArray();
        if (arr.length != 0) {
            double averageValue = IntStream.of(arr)
                    .summaryStatistics()
                    .getAverage();
            return averageValue;
        } else {
            LOGGER.warn("Empty array");
            throw new EmptyArrayException();
        }
    }
}
