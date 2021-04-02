package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SortService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuickSortService implements SortService {

    public static final Logger LOGGER = LogManager.getLogger(QuickSortService.class.getName());

    @Override
    public void sort(ArrayEntity array) throws EmptyArrayException {
        LOGGER.info("Sorting array using quick sort");
        int[] arrayToSort = array.getArray();
        if (arrayToSort.length != 0) {
            quickSort(arrayToSort, 0, arrayToSort.length - 1);
            array.setArray(arrayToSort);
        } else {
            LOGGER.warn("Empty array");
            throw new EmptyArrayException();
        }
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
}
