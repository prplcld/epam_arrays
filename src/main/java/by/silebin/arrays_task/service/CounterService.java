package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;

public interface CounterService {
    long countPositive(ArrayEntity array);
    long countNegative(ArrayEntity array);
}
