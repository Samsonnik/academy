package homework7.task1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static List<Double> getListValue(int size, int maxValue) {
        return Stream.generate(() -> new Random().nextInt(maxValue)).limit(size)
                .map(value -> value * Math.PI - 20)
                .filter(value -> value < 100)
                .skip(3)
                .distinct()
                .collect(Collectors.toList());
    }

    public static Map<Double, String> toMap (List<Double> list){
       return list.stream().collect(Collectors.toMap(a -> a, b -> "Number: " + Math.round(b)));
    }

    public static void showMap (Map<Double, String> map){
        for (Map.Entry<Double, String> mapEntry: map.entrySet()){
            System.out.println("Key: " + mapEntry.getKey() + ", value: " + mapEntry.getValue());
        }
    }


    public static void main(String[] args) {

        List<Double> list = getListValue(100, 100);
        Map<Double, String> map = toMap(list);
        showMap(map);

    }
}
