package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.AverageValueService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

import java.util.stream.IntStream;

public class AverageValueServiceImpl implements AverageValueService {

    @Override
    public double countAverageValue(ArrayEntity array) throws EmptyArrayException {
        int[] arr = array.getArray();
        if(arr.length != 0) {
            return IntStream.of(arr)
                    .summaryStatistics()
                    .getAverage();
        }
        else throw new EmptyArrayException();
    }
}
