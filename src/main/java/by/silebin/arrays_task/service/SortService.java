package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

public interface SortService {
    ArrayEntity sort(ArrayEntity array) throws EmptyArrayException;
}
