package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SearchService {

    public int searchMaxValue(ArrayEntity array){
        OptionalInt min = IntStream.of(array.getArr())
                .max();
        if(min.isPresent()){
            return min.getAsInt();
        }
        else {
            throw new Exception();
        }
    }

    public int searchMinValue(ArrayEntity array){

        return IntStream.of(array.getArr())
                .min()
                .orElse(Integer.MAX_VALUE);
    }
}
