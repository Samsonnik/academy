package by.academy.lesson3;

import java.util.Scanner;

public class Task0 {

    public static void main(String[] args) {
        String moth = "Номер месяца ";

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
            switch (line) {
                case "Январь" -> System.out.println(moth + "1");
                case "Февраль" -> System.out.println(moth + "2");
                case "Март" -> System.out.println(moth + "3");
                case "Апрель" -> System.out.println(moth + "4");
                case "Май" -> System.out.println(moth + "5");
                case "Июнь" -> System.out.println(moth + "6");
                case "Июль" -> System.out.println(moth + "7");
                case "Август" -> System.out.println(moth + "8");
                case "Сентябрь" -> System.out.println(moth + "9");
                case "Октябь" -> System.out.println(moth + "10");
                case "Ноябрь" -> System.out.println(moth + "11");
                case "Декабрь" -> System.out.println(moth + "12");
                default -> System.out.println("something wrong");
            }
        }
}
