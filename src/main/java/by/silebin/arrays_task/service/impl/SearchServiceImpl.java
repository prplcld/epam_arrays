package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SearchService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SearchServiceImpl implements SearchService {

    public int searchMaxValue(ArrayEntity array) throws EmptyArrayException {
        OptionalInt min = IntStream.of(array.getArray())
                .max();
        if(min.isPresent()){
            return min.getAsInt();
        }
        else {
            throw new EmptyArrayException();
        }
    }

    public int searchMinValue(ArrayEntity array) throws EmptyArrayException {
        OptionalInt min = IntStream.of(array.getArray())
                .min();
        if(min.isPresent()){
            return min.getAsInt();
        }
        else {
            throw new EmptyArrayException();
        }
    }
}