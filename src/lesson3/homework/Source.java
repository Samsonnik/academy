package lesson3.homework;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Source {
    public static void main(String[] args) throws ParseException {
        Product firstTv = new TV("A45", 9_000, 3,
                "Samsung", 49.00, true);
        Product firstPC = new Computer("Nagibator3000", 20_000.0, 2,
                "AMD Ryzen 3", 32, "NVIDIA GeForce GTX1050Ti");
        Product firstPhone = new Phone("HuaweiB13", 1000, 4, "Android",
                "720x1280", 4200);

        ArrayList<Product> products = new ArrayList<>();
        products.add(firstTv);
        products.add(firstPC);
        products.add(firstPhone);

        User seller = new User("Vasyan", 100_000);
        User buyer = new User("Igoryan", 50_000);

        DateValidator.dataCheck("12/05/2021");
        DateValidator.dataCheck("12-07-2023");
        System.out.println(new AmericanPhoneValidator().validate("+1-123-123-4567"));
        System.out.println(new BelarusPhoneValidator().validate("+375443277671"));
        System.out.println(new EmailValidator().validate("abcmail.com"));




    }
}
