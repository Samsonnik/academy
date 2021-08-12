package homework5.task2;

import java.util.*;

public class Solution {

    public static Random random = new Random();
    static final int bound = 1_000_000;

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();
        add(arrayList, linkedList);
        System.out.println("ArrList: " + getTime(arrayList));
        System.out.println("LinkList: " + getTime(linkedList));
    }

    public static void get(List<Object> list){
        for (int i = 0; i <= 100_000; i++) {
            list.get(random.nextInt(bound));
        }
    }
    
    public static void add(List<Object> list1, List<Object> list2){
        for (int i = 0; i <= bound; i++) {
            list1.add(i);
            list2.add(i);
        }
    }

    public static String getTime(List<Object> list){
        long start = System.currentTimeMillis();
        get(list);
        long finish = System.currentTimeMillis();
        return ("Время выполнения - " + (finish - start) + " мс");
    }
}
// Время выполнения LinkList будет больше, т.к. в виду особенностей реализации класса очень медленный доступ к элементам
// по индексу, в отличии от ArrList, одним из преимуществ которого является быстрый доступ к элементам по индексу