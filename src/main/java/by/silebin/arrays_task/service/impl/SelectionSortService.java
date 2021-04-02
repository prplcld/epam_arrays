package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SortService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SelectionSortService implements SortService {

    public static final Logger LOGGER = LogManager.getLogger(SelectionSortService.class.getName());

    @Override
    public void sort(ArrayEntity array) throws EmptyArrayException {
        LOGGER.info("Sorting array using selection sort");
        int[] arrayToSort = array.getArray();
        if (arrayToSort.length != 0) {
            selectionSort(arrayToSort);
            array.setArray(arrayToSort);
        } else {
            LOGGER.warn("Empty array");
            throw new EmptyArrayException();
        }
    }

    private void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
