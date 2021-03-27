package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SumService;

import java.util.stream.IntStream;

public class SumServiceImpl implements SumService {

    public int sum(ArrayEntity array){
        return IntStream.of(array.getArray())
                .sum();
    }
}
