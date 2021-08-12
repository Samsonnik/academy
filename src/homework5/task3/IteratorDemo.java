package homework5.task3;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.Iterator;

public class IteratorDemo<T> implements Iterator<T> {

    private final T[][] array;
    private int line = 0;
    private int column = 0;

    public IteratorDemo(T[][] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return line < array.length && column < array[line].length;
    }

    @Override
    public T next() {
        T item = array[line][column++];
        if (column >= array[line].length){
            line++;
            column = 0;
        }
        return item;
    }
}
