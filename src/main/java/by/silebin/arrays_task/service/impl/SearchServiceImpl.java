package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SearchService;
import by.silebin.arrays_task.service.exception.NoElementsInArrayException;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SearchServiceImpl implements SearchService {

    public int searchMaxValue(ArrayEntity array) throws NoElementsInArrayException {
        OptionalInt min = IntStream.of(array.getArr())
                .max();
        if(min.isPresent()){
            return min.getAsInt();
        }
        else {
            throw new NoElementsInArrayException();
        }
    }

    public int searchMinValue(ArrayEntity array) throws NoElementsInArrayException {
        OptionalInt min = IntStream.of(array.getArr())
                .min();
        if(min.isPresent()){
            return min.getAsInt();
        }
        else {
            throw new NoElementsInArrayException();
        }
    }
}