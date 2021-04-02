package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.ReplaceService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class ReplaceServiceImpl implements ReplaceService {

    public static final Logger LOGGER = LogManager.getLogger(ReplaceServiceImpl.class.getName());

    @Override
    public void replaceAllNegativeElementsWithZero(ArrayEntity array) throws EmptyArrayException {
        LOGGER.info("Replacing negative elements with zeros");
        int[] arr = array.getArray();
        if (arr.length != 0) {
            int[] replaced = IntStream.of(arr)
                    .map(i -> Math.max(i, 0))
                    .toArray();
            array.setArray(replaced);
        } else {
            LOGGER.warn("Empty array");
            throw new EmptyArrayException();
        }
    }
}
