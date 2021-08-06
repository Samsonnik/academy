package homework1;

import java.util.Scanner;

public class Part1Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert data type");
        String inputDataType = scanner.nextLine();
        System.out.println("Insert variable");
        String inputValue = scanner.nextLine();
        switch (inputDataType) {
            case "int" -> {
                int intValue = Integer.parseInt(inputValue);
                System.out.println(intValue % 2);
            }
            case "double" -> {
                double doubleValue = Double.parseDouble(inputValue);
                System.out.println(doubleValue * 0.7);
            }
            case "float" -> {
                float floatValue = Float.parseFloat(inputValue);
                System.out.println(floatValue * floatValue);
            }
            case "char" -> {
                int charValue = inputValue.charAt(0);
                System.out.println(charValue);
            }
            case "string" -> {
                String hello = "Hello ";
                System.out.println(hello + inputValue);
            }
            default -> System.out.println("Unsupported type");
        }
        scanner.close();
    }
}

