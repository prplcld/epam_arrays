package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.AverageValueService;

import java.util.stream.IntStream;

public class AverageValueServiceImpl implements AverageValueService {

    @Override
    public double countAverageValue(ArrayEntity array) {
        return IntStream.of(array.getArray())
                .summaryStatistics()
                .getAverage();
    }
}
