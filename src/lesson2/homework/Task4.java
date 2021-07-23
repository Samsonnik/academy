package lesson2.homework;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int numberOfPlayers = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert number of players");
        if (scanner.hasNextInt()){
            numberOfPlayers = scanner.nextInt();
            if (numberOfPlayers < 2) {
                System.out.println("The number of players is too small");
            }
            else if (numberOfPlayers > 5) {
                System.out.println("The number of players is too large");
            }
            else {
                String[] deck = initializeDeck();
                mixCards(deck, 36);
                giveCards(deck, numberOfPlayers);
            }
        }
        else {
            System.out.println("Something wet wrong");
        }
        scanner.close();
    }

    public static String[] initializeDeck(){

        String[] cartsValue = {"шесть", "семь", "восемь", "девять",
                "десять", "валет", "дама", "король", "туз"};

        String[] cartsSuit = {"бубна", "пика", "черви", "треф"};

        int deckSize = 36;
        int count = 0;
        String[] deckOfCards = new String[deckSize];
        for (String value : cartsSuit) {
            for (String s : cartsValue) {
                deckOfCards[count++] = s + " " + value;
            }
        }
        return deckOfCards;
    }

    public static void mixCards (String[] deckOfCards, int deckSize){
        for (int i = 0; i < deckOfCards.length; i++) {
            int randomIndex = (int)(Math.random() * deckSize);
            String temp = deckOfCards[randomIndex];
            deckOfCards[randomIndex] = deckOfCards[i];
            deckOfCards[i] = temp;
        }
    }

    public static void giveCards(String[] mixedDeck, int numberOfPlayers){
        int valueCardsForOne = 5;
        int count = 0;
        for (int i = 0; i < numberOfPlayers * valueCardsForOne; i++) {
            System.out.print(mixedDeck[i] + " ");
            count++;
            if (count % valueCardsForOne == 0) {
                System.out.println();
                System.out.println();
            }
        }
    }
}
