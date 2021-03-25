package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.NoElementsInArrayException;

public interface SearchService {
    int searchMaxValue(ArrayEntity array) throws NoElementsInArrayException;
    int searchMinValue(ArrayEntity array) throws  NoElementsInArrayException;
}
