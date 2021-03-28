package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.CounterService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

import java.util.stream.IntStream;

public class CounterServiceImpl implements CounterService {
    @Override
    public long countPositive(ArrayEntity array) throws EmptyArrayException {
        int[] arr = array.getArray();
        if(arr.length != 0) {
            return IntStream.of(arr)
                    .filter(p -> p > 0)
                    .count();
        }
        else throw new EmptyArrayException();
    }

    @Override
    public long countNegative(ArrayEntity array) throws EmptyArrayException {
        int[] arr = array.getArray();
        if(arr.length != 0) {
            return IntStream.of(arr)
                    .filter(p -> p < 0)
                    .count();
        }
        else throw new EmptyArrayException();
    }
}
