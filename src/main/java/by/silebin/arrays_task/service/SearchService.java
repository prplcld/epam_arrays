package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

public interface SearchService {
    int searchMaxValue(ArrayEntity array) throws EmptyArrayException;
    int searchMinValue(ArrayEntity array) throws EmptyArrayException;
}
