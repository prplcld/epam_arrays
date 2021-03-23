package by.silebin.arrays_task.entity;

import by.silebin.arrays_task.entity.exception.NoElementAtGivenIndexException;


public class ArrayEntity {

    private int arr[];

    private int capacity;

    private int currentSize;

    public ArrayEntity() {
        currentSize = 0;
        capacity = 0;
    }

    public ArrayEntity(int[] arr){
        this.arr = arr;
        capacity = currentSize = arr.length;
    }

    public void updateElement(int index, int data){
        if (index == capacity){
            addElement(data);
        }
        else{
            arr[index] = data;
        }
    }

    public void addElement(int data){
        if (currentSize == capacity) {
            int[] temp = new int[2 * capacity];
            if (capacity >= 0){
                System.arraycopy(arr, 0, temp, 0, capacity);
            }
            capacity *= 2;
            arr = temp;
        }
        arr[currentSize] = data;
        currentSize++;
    }


    public int getAt(int index) throws NoElementAtGivenIndexException {
        if (index < currentSize && index > 0)
            return arr[index];
        throw new NoElementAtGivenIndexException("incorrect index");
    }


    public void remove(int index) {
        if(index > 0 && index < capacity){
            capacity--;
            int[] temp = new int[capacity];
            for (int i = 0, k = 0; i < arr.length; i++) {
                if (i == index) {
                    continue;
                }
                temp[k++] = arr[i];
            }
            currentSize--;
            arr = temp;
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
        capacity = currentSize = arr.length;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
}
