package by.silebin.arrays_task.service.impl;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SortService;
import by.silebin.arrays_task.service.exception.EmptyArrayException;

public class BubbleSortService implements SortService {
    @Override
    public ArrayEntity sort(ArrayEntity array) throws EmptyArrayException {
        int[] unsortedArray = array.getArray();
        if(unsortedArray.length != 0) {
            int[] sortedArray = bubbleSort(unsortedArray);
            array.setArray(sortedArray);
            return array;
        }
        else throw new EmptyArrayException();
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
