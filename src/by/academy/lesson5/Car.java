package by.academy.lesson5;

import java.util.Objects;

public class Car extends Product{

    public Car(String name, int price, int quantity) {
        super(name, price, quantity);
    }

    public static void main(String[] args) {
        Car car = new Car("Audi", 15, 15);
        Car car1 = new Car("Audi", 20, 15);
        System.out.println(car.toString());
        System.out.println(car.equals(car1));
    }

}
