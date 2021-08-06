package Lesson4.homework.task3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T extends Number> {

    private T[] array;
    private int iterateInd = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    public boolean hasNext() {
        return iterateInd < array.length;
    }

    public T next() {
        if (hasNext()) {
            return array[iterateInd++];
        } else {
            System.out.println("array is empty");
            return null;
        }
    }

    public T get() {
        return array[iterateInd];
    }
}

