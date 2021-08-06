package homework1;

import java.util.Scanner;

public class Animal {

    private int age;
    private String name;

    public Animal(){

    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge (int age){

        this.age = age;
    }

    public int getAge(){

        return age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName(){

        return name;
    }

    public static void tellMeAboutAnimal(Animal animal){
        System.out.printf("The name of this animal is \"%s\", his age - %d years.",  animal.getName(), animal.getAge());
    }

    public static void change(Animal animal){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert new age");
        int valueForAge = scanner.nextInt();
        while (valueForAge <= 0 || valueForAge > 10){
            System.out.println("something wet wrong, check your value, and try again :( ");
            valueForAge = scanner.nextInt();
        }
        animal.setAge(valueForAge);
        System.out.println("insert new name");
        Scanner scanner2 = new Scanner(System.in);
        String lineForName = scanner2.nextLine();
        animal.setName(lineForName);
        scanner.close();
        scanner2.close();
    }
}
