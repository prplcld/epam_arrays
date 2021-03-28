package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SumService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

import java.util.stream.IntStream;

public class SumServiceImpl implements SumService {

    public int sum(ArrayEntity array) throws EmptyArrayException {
        int[] arr = array.getArray();
        if(arr.length != 0){
            return IntStream.of(arr)
                    .sum();
        }
        else {
            throw new EmptyArrayException();
        }
    }
}
