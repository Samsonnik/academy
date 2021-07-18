package by.academy.lesson3;

public class Solution {
    public static void main(String[] args) {
        int n = 0;
        int a = 0;
        while (n <= 10){
            System.out.print(n + " " );
            n++;
        }

        System.out.println();

        do {
            System.out.print(a + " ");
            a++;
        }
        while (a <= 10);

        System.out.println();

        for (int i = 0; i <= 10 ; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
    }
}
