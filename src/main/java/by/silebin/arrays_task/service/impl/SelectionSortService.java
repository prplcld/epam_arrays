package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SortService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

public class SelectionSortService implements SortService {
    @Override
    public ArrayEntity sort(ArrayEntity array) throws EmptyArrayException {
        int[] unsortedArray = array.getArray();
        if(unsortedArray.length != 0) {
            int[] sortedArray = selectionSort(unsortedArray);
            array.setArray(sortedArray);
            return array;
        }
        else throw new EmptyArrayException();
    }

    private int[] selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
