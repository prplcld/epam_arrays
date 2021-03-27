package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.CounterService;

import java.util.stream.IntStream;

public class CounterServiceImpl implements CounterService {
    @Override
    public long countPositive(ArrayEntity array) {
        return IntStream.of(array.getArray())
                .filter(p -> p > 0)
                .count();
    }

    @Override
    public long countNegative(ArrayEntity array) {
        return IntStream.of(array.getArray())
                .filter(p -> p < 0)
                .count();
    }
}
