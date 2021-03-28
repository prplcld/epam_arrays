package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

public interface CounterService {
    long countPositive(ArrayEntity array) throws EmptyArrayException;
    long countNegative(ArrayEntity array) throws EmptyArrayException;
}
