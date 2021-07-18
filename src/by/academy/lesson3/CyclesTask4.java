package by.academy.lesson3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class CyclesTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) count1++;
            else if (array[i] < 0) count2++;
            else if (array[i] == 0) count3++;
        }
        System.out.println("Больше нуля - " +count1);
        System.out.println("Меньше нуля - " +count2);
        System.out.println("Равно нулю - " +count3);

    }
}
