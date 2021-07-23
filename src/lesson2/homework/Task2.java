package lesson2.homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Task2 {

    final static String insert = "Insert the line";

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("insert the number of lines");
        if (scanner.hasNextInt()) {
            int numberOfLines = scanner.nextInt();
            while (numberOfLines > 0) {
                System.out.println(insert);
                stringBuilder.append(scanner2.nextLine());
                stringBuilder.append(" ");
                numberOfLines--;
            }
        }
        String lines = stringBuilder.toString();
        String[] array = lines.split(" ");

        int count = 0;
        ArrayList<Integer> countValues = new ArrayList<Integer>();

        for (String word : array) {
            count = 0;
            for (int i = 0; i < word.length(); i++) {
                char a = word.charAt(i);
                for (int j = i + 1; j < word.length(); j++) {
                    char b = word.charAt(j);
                    if (a == b) count++;
                }
            }
            countValues.add(count);
        }
        int maxIndex = 0;
        for (int i = 0; i < countValues.size(); i++) {
            if (countValues.get(maxIndex) < countValues.get(i)) {
                maxIndex = i;
            }
        }
        System.out.println(array[maxIndex]);
        scanner.close();
        scanner2.close();
        }
    }