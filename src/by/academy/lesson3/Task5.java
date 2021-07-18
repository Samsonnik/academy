package by.academy.lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            if (a > b) System.out.println("Большее " + a);
            else if (b > a) System.out.println("Большее " + b);
            int result = (a + b) / 2;
            System.out.println("Среднее арифметическое " + result);
        }
        else System.out.println("Something wet wrong");
    }
}
