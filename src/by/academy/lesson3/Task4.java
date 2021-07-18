package by.academy.lesson3;

public class Task4 {
    public static void main(String[] args) {
        int s = 870_400;
        int sec;
        int m;
        int min;
        int h;
        int d;
        int days;
        int weeks;

        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        days = h / 24;
        h -= days * 24;
        weeks = days / 7;
        days -= weeks * 7;

        System.out.println(weeks + " недель " + days + " дня " + h + " часов " + min + " минут " + sec + " секунд ");
    }
}
