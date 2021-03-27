package by.silebin.arrays_task.entity;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayEntity {

    private int[] array;

    public ArrayEntity() {

    }

    public ArrayEntity(int[] array){
        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getAt(int index){
        return array[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int a : array){
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
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return IntStream.of(array).sum();
    }
}
