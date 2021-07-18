package by.academy.lesson2;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int value = scanner.nextInt();
            if (value % 2 == 0) System.out.println("четное");
            else System.out.println("нечетное");
        }
        else System.out.println("wrong insert");
        scanner.close();
    }
}
