package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SortService;

public class BubbleSortService implements SortService {
    @Override
    public ArrayEntity sort(ArrayEntity array) {
        int[] sortedArray = bubbleSort(array.getArray());
        array.setArray(sortedArray);
        return array;
    }

    private int[] bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
