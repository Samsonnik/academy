package by.academy.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Task1 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]*");
        Matcher matcher = p.matcher("");
        boolean check = matcher.matches();
        System.out.println(check);
        }
    }

