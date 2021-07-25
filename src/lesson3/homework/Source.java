package lesson3.homework;

import java.text.ParseException;
import java.time.LocalDate;
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

        User seller = new User("Vasyan", 100_000, "+375-29-32-77621", "vasua123@mail.ru", "12-07-1997");
        User buyer = new User("Igoryan", 50_000, "+1-298-123-4567", "igorekugolek@yahoo.com", "12/08/2020");

        System.out.println(new BelarusPhoneValidator().validate(seller.getPhone()));
        System.out.println(new EmailValidator().validate(seller.getEmail()));
        System.out.println(new AmericanPhoneValidator().validate(buyer.getPhone()));
        System.out.println(new EmailValidator().validate(buyer.getEmail()));
        new DateValidator().validate(seller.getDateOfBirth());
        new DateValidator().validate(buyer.getDateOfBirth());

        LocalDate dealDate = LocalDate.now();
        Deal deal = new Deal(products, seller, buyer, dealDate);
        System.out.println(deal.getDealDate());
        System.out.println(deal.getDealDeadLine());
        System.out.println(deal.getFullPrice(products));




    }
}
