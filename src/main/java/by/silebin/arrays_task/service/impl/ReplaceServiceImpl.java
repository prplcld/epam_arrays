package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.ReplaceService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

import java.util.stream.IntStream;

public class ReplaceServiceImpl implements ReplaceService {

    @Override
    public ArrayEntity replaceAllNegativeElementsWithZero(ArrayEntity array) throws EmptyArrayException {
        int[] arr = array.getArray();
        if(arr.length != 0){
            int[] replaced = IntStream.of(arr)
                    .map(i -> Math.max(i, 0))
                    .toArray();
            array.setArray(replaced);
            return array;
        }
        else throw new EmptyArrayException();
    }
}
