package homework5.task3;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Integer[][] array = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        IteratorDemo<Integer> iteratorDemo = new IteratorDemo<>(array);
        System.out.println(iteratorDemo.hasNext());
        while (iteratorDemo.hasNext()){
            System.out.print(iteratorDemo.next() + " ");
        }
        System.out.println(iteratorDemo.hasNext());
    }
}
