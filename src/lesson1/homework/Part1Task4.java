package lesson1.homework;

public class Part1Task4 {
    public static void main(String[] args) {
        int value = 2;
        for (int i = 1; ; i++) {
            value = value * 2;
            if (value > 1_000_000) break;
            System.out.printf("%d ^ %d = %d %n", 2, i + 1, value);
        }
        }
    }
