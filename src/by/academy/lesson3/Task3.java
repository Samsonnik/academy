package by.academy.lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
            if (value % 2 == 0) System.out.println("even");
            else System.out.println("not even");
        }
        else System.out.println("something wet wrong");

    }
}
