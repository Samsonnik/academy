package Lesson4.homework.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private LocalDate localDate;
    private Year year;
    private Month month;
    private Day day;
    final String WRONG = "Something wet wrong";


    public DateDemo() {
        setLocalDate();
    }

    public DateDemo(String date) {
        setLocalDate(date);
    }

    public boolean leapYear() {
        final int numberOfDays = 365;
        return localDate.getDayOfYear() == numberOfDays;
    }

    public int getNumberOfDays(String from, String to) {
        if (Validator.validateInputDate(from, to)) {
            LocalDate fromDate = LocalDate.parse(from, formatter);
            LocalDate toDate = LocalDate.parse(to, formatter);
            return toDate.getDayOfYear() - fromDate.getDayOfYear();
        } else {
            System.out.println(WRONG);
            return 0;
        }
    }

    public DayOfWeek getDayOfWeek(String date) {
        if (Validator.validateDayOfWeek(date)) {
            return LocalDate.parse(date, formatter).getDayOfWeek();
        } else {
            System.out.println(WRONG);
            return null;
        }
    }

    public DayOfWeek getDayOfWeek() {
        return localDate.getDayOfWeek();
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String date) {
        if (Validator.validateInputDate(date)) {
            year = new Year(LocalDate.parse(date, formatter).getYear());
            month = new Month(LocalDate.parse(date, formatter).getMonthValue());
            day = new Day(LocalDate.parse(date, formatter).getDayOfMonth());
            localDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
        } else {
            System.out.println(WRONG);
        }
    }

    public void setLocalDate() {
        localDate = LocalDate.now();
        year = new Year(localDate.getYear());
        month = new Month(localDate.getMonthValue());
        day = new Day(localDate.getDayOfMonth());
    }

    public int getYear() {
        return year.getYear();
    }

    public int getMonth() {
        return month.getMonth();
    }

    public int getDay() {
        return day.getDay();
    }

    static class Year {

        private int year;

        public Year(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    static class Month {

        private int month;

        public Month(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }
    }

    static class Day {

        private int day;

        public Day(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }
    }
}
