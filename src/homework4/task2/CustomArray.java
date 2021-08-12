package homework4.task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomArray<E> {

    private E[] array;
    private int size;

    @SuppressWarnings("Unchecked")
    public CustomArray() {
        super();
        size = 16;
        array = (E[]) new Object[size];
    }

    @SuppressWarnings("Unchecked")
    public CustomArray(int size) {
        super();
        this.size = size;
        array = (E[]) new Object[size];
    }

    public void printArr() {
        System.out.println(Arrays.toString(getArray()));
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public E[] getArray() {
        return array;
    }

    public void setArray(E[] array) {
        this.array = array;
    }

    public void add(E newItem) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length + 1);
        }
        array[size] = newItem;
        size++;
    }

    public E get(int index) {
        return array[index];
    }

    public E getLast() {
        return array[size - 1] != null ? array[size - 1]: null;
    }

    public E getFirst() {
        return array[0] != null ? array[0]: null;
    }

    public E getLastFill() {
        E lastFill = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                lastFill = array[i - 1];
            }
        }
        return lastFill;
    }

    public void remove(int index) {

        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
            array = Arrays.copyOf(array, array.length - 1);
        } else {
            System.out.println("wrong index");
        }
    }

    public void remove(E value) {

        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                flag = true;
                if (array.length - 1 - i >= 0) {
                    System.arraycopy(array, i + 1, array, i, array.length - 1 - i);
                    array = Arrays.copyOf(array, array.length - 1);
                } else {
                    System.out.println("wrong index");
                }
            }
        }
        if (!flag) {
            System.out.println("your value don't find");
        }
    }
}


