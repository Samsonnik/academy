package lesson2.homework;

import java.util.Scanner;

public class Task1 {

    final static String insert = "Insert the line";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(insert);
        String line1 = scanner.nextLine();
        System.out.println(insert);
        String line2 = scanner.nextLine();
        System.out.println(checkLines(line1, line2));
        scanner.close();
    }

    public static String checkLines(String line1, String line2){
        final String equal = "Lines is equal";
        final String notEqual = "Lines are not equal";

        char[] firstLineArray = line1.toCharArray();
        char[] secondLineArray = line2.toCharArray();
        int check = 0;

        if (firstLineArray.length != secondLineArray.length) return notEqual;

        for (char first: firstLineArray){           //count the sum of the first line
            check = check + (int)(first);
        }

        for (char second: secondLineArray){         //consider the difference
            check = check - (int)(second);
        }
        if (check == 0) return equal;
        else return notEqual;
    }
}
