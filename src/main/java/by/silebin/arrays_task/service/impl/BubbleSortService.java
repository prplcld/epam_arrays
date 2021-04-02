package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SortService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSortService implements SortService {

    public static final Logger LOGGER = LogManager.getLogger(BubbleSortService.class.getName());

    @Override
    public void sort(ArrayEntity array) throws EmptyArrayException {
        LOGGER.info("Sorting array with bubble sort");
        int[] arrayToSort = array.getArray();
        if (arrayToSort.length != 0) {
            bubbleSort(arrayToSort);
            array.setArray(arrayToSort);
        } else {
            LOGGER.warn("Empty array");
            throw new EmptyArrayException();
        }
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
