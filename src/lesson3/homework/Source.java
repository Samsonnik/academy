package lesson3.homework;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Source {
    public static void main(String[] args) throws ParseException {
        Product firstTv = new TV("BigBlackBox", 9_000, 3,
                "Samsung", 49.00, true);
        Product firstPC = new Computer("Nagibator300", 20_000.0, 2,
                "AMD Ryzen 3", 32, "NVIDIA GeForce GTX1050Ti");
        Product firstPhone = new Phone("HuaweiB13", 1000, 4, "Android",
                "720x1280", 4200);

        ArrayList<Product> products = new ArrayList<>();
        products.add(firstTv);
        products.add(firstPC);
        products.add(firstPhone);
        BelarusPhoneValidator belarusPhoneValidator = new BelarusPhoneValidator();
        AmericanPhoneValidator americanPhoneValidator = new AmericanPhoneValidator();
        EmailValidator emailValidator = new EmailValidator();

        User seller = new User("Vasyan", 120_000, "+375-29-32-77621", "vasua123@mail.ru", "12-07-1997");
        User buyer = new User("Igoryan", 100_000, "+1-298-123-4567", "ekugolekyahoo.com", "12/08/1996");

        LocalDate dealDate = LocalDate.now();
        Deal deal = new Deal(products, seller, buyer, dealDate);

        DateValidator.validate(seller.getDateOfBirth());
        DateValidator.validate(buyer.getDateOfBirth());
        System.out.println(belarusPhoneValidator.validate(seller.getPhone()));
        System.out.println(americanPhoneValidator.validate(buyer.getPhone()));
        System.out.println(emailValidator.validate(seller.getEmail()));
        System.out.println(emailValidator.validate(buyer.getEmail()));

        deal.getDealInfo();
        firstPC.test();


    }
}
