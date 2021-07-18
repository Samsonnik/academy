package by.academy.lesson5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {

        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";

        Pattern pattern = Pattern.compile("\\d+\\s?");
        String[] words = pattern.split("java5tiger 77 java6mustang");
        String[] words2 = pattern.split("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.");

        System.out.print(Arrays.toString(words));
        System.out.println(Arrays.toString(words2));

    }
}
