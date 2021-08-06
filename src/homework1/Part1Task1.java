package homework1;

import java.io.IOException;
import java.util.Scanner;

public class Part1Task1 {
    public static void main(String[] args) {
        String wrong = "Something wet wrong, try again :(";
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert your age");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            System.out.println("insert amount of purchases");
            if (scanner.hasNextInt()) {
                int amount = scanner.nextInt();
                if (amount < 100) {                           // (0; 100), where is the discount -> 5
                    double discount = 5;
                   printInf(calculateFinalAmount(amount, discount), (int) discount);
                } else if (amount < 200) {                    // [100; 200), where is the discount -> 7
                    double discount = 7;
                    printInf(calculateFinalAmount(amount, discount), (int) discount);
                } else if (amount < 300) {                    // [200; 300), where is the discount -> (12 + 4) if age > 18 or (12 - 3) if age less than 18
                    double discount = 12;
                    if (age > 18){
                        discount += 4;
                    }
                    else discount -= 3;
                    printInf(calculateFinalAmount(amount, discount), (int) discount);
                } else if (amount < 400) {                   // [300; 400), where is the discount -> 15
                    double discount = 15;
                    printInf(calculateFinalAmount(amount, discount), (int) discount);
                } else {
                    double discount = 20;                   // [400 and more, discount -> 20
                    printInf(calculateFinalAmount(amount, discount), (int) discount);
                }
            } else System.out.println(wrong);
        }
        else System.out.println(wrong);
        scanner.close();
    }

    public static void printInf(int amount, int discount){
        System.out.printf("Final amount of purchases is %d, your discount - %d", amount, discount);
    }
    public static int calculateFinalAmount (int amount, double discount){
        return amount *= (1 - (discount / 100));
    }
}