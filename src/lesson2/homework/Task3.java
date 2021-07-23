package lesson2.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert word");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        if (word1.length() %2 == 0 && word2.length() % 2 == 0){
            stringBuilder.append(word1.substring(0, word1.length() / 2));
            stringBuilder.append(word2.substring(word2.length() / 2));
            String word = stringBuilder.toString();
            System.out.println(word);
        }
        else {
            System.out.println("Something wet wrong");
        }
        scanner.close();
    }
}
