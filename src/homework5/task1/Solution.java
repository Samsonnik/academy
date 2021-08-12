package homework5.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(5.6);
        arrayList.add(5.7);
        arrayList.add(5.6);
        arrayList.add(5.7);
        arrayList.add(5.9);
        arrayList.add(5.9);
        Set<?> set = rmDuplicates(arrayList);
        System.out.println(set);
    }

    public static Set<?> rmDuplicates(Collection<?> collection){
        return Set.copyOf(collection);
    }
}
