package homework5.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    private final static String text = "Java — строго типизированный объектно-ориентированный язык программирования";

    public static void main(String[] args) {

        String[] str = text.split("");
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            hashMap.put(str[i].charAt(0), count);
            count = 0;
        }
        System.out.println(hashMap);
    }
}

