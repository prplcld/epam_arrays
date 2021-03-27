package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SortService;

public class SelectionSortIService implements SortService {
    @Override
    public ArrayEntity sort(ArrayEntity array) {
        int[] sortedArray = selectionSort(array.getArray());
        array.setArray(sortedArray);
        return array;
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
