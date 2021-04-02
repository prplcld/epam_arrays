package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

public interface ReplaceService {
    void replaceAllNegativeElementsWithZero(ArrayEntity array) throws EmptyArrayException;
}
