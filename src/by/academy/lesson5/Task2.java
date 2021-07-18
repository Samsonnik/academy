package by.academy.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(test("google.com"));
        System.out.println(test("reference.by"));
        System.out.println(test("reference1.org"));


    }
    public static boolean test(String testString){
        Pattern pattern = Pattern.compile("[a-z]*[0-9]?\\.(com|by|org)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}
