package homework1;

import java.util.Scanner;

public class Part1Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert int value from 1 to 10");
        if (scanner.hasNextInt()){
            int value = scanner.nextInt();
            if (value >= 1 && value <= 10){
                for (int i = 1; i <= 10 ; i++) {
                    System.out.printf("%2d x %2d = %d %n", value, i, value * i);
                }
            }
            else System.out.println("Wrong value. Check your insert and try again");
        }
        else System.out.println("Wrong value. Check your insert and try again");
        scanner.close();
    }
}
