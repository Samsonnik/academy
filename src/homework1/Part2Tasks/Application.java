package homework1.Part2Tasks;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Vasili");
        cat2.eat();
        cat2.sleep();
        cat2.walk();
        cat1.grow();
        cat1.grow();
        cat1.grow();
        System.out.println(cat1.getAge());
        cat2.setMoney(BigDecimal.valueOf(454545.004));
        System.out.println(cat2.getMoney());
        cat2.setMoney(BigDecimal.valueOf(3434));
        System.out.println(cat2.getMoney());
        cat2.setInitials();
        System.out.println(cat2.getInitials());
        System.out.println(cat2.isHomeAnimal());
        cat2.setHomeAnimal(true);
        System.out.println(cat2.isHomeAnimal());
        cat2.eat();
    }
}
