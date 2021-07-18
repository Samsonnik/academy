package by.academy.lesson3;

import java.util.Scanner;

public class CyclesTask3 {
    public static void main(String[] args) {
        int sum = 1;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
            System.out.println(sum);
        }
        else System.out.println("something wet wrong");
    }
}
