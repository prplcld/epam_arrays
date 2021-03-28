package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

public interface AverageValueService {
    double countAverageValue(ArrayEntity array) throws EmptyArrayException;
}
