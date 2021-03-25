package by.silebin.arrays_task.entity;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayEntity {

    private int arr[];

    public ArrayEntity() {

    }

    public ArrayEntity(int[] arr){
        this.arr = arr;
    }

    public int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getAt(int index){
        return arr[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int a : arr){
            sb.append(a);
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayEntity that = (ArrayEntity) o;
        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return IntStream.of(arr).sum();
    }
}
