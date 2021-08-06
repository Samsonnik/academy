package homework1.Part2Tasks;

import java.math.BigDecimal;

public class Cat {

    public Cat(){

    }

    public Cat (String nickname){
        this.nickname = nickname;
    }

    private int age;
    private String nickname;
    private BigDecimal money;
    private char initials;
    private boolean isHomeAnimal;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setInitials() {
        this.initials = nickname.charAt(0);
    }

    public char getInitials() {
        return initials;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void grow(){
        age += 1;
    }

    public void sleep(){
        System.out.println("the cat is sleeping");
    }

    public void eat(){
        System.out.println("the cat is eating");
    }

    public void walk(){
        System.out.println("the cat is walking");
    }
}
