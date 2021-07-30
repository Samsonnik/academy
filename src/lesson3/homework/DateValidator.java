package lesson3.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {
    // date dd/MM/yyyy, where [0-31]/[01-12]/[1990 - 2099]
    private static final Pattern dateType1 = Pattern.compile("^(0[1-9]|[1-2][1-9]|3[0-1])/(0[1-9]|1[1-2])/(199[0-9]|20[0-9][0-9])$");
    // date dd-MM-yyyy, where [0-31]/[01-12]/[1990 - 2099]
    private static final Pattern dateType2 = Pattern.compile("^(0[1-9]|[1-2][1-9]|3[0-1])-(0[1-9]|1[1-2])-(199[0-9]|20[0-9][0-9])$");

    public static void validate (String stringDate) throws ParseException {

        Matcher matcherDataType1 = dateType1.matcher(stringDate);
        Matcher matcherDataType2 = dateType2.matcher(stringDate);
        StringBuilder stringBuilder = new StringBuilder();
        Date dateCheck = new Date();

        if (matcherDataType1.matches()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = simpleDateFormat.parse(stringDate);
            if (date.after(dateCheck)) {
                System.out.println("Your date has not come yet");
            } else {
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(date);
                stringBuilder.append("День: <").append(calendar.get(Calendar.DAY_OF_MONTH)).append(">");
                System.out.println(stringBuilder);
                stringBuilder.setLength(0);
                stringBuilder.append("Месяц: <").append(calendar.get(Calendar.MONTH) + 1).append(">");
                System.out.println(stringBuilder);
                stringBuilder.setLength(0);
                stringBuilder.append("Year: <").append(calendar.get(Calendar.YEAR)).append(">");
                System.out.println(stringBuilder);
            }
        } else if (matcherDataType2.matches()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = simpleDateFormat.parse(stringDate);
            if (date.after(dateCheck)) {
                System.out.println("Your date has not come yet");
            } else {
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(date);
                stringBuilder.append("День: <").append(calendar.get(Calendar.DAY_OF_MONTH)).append(">");
                System.out.println(stringBuilder);
                stringBuilder.setLength(0);
                stringBuilder.append("Месяц: <").append(calendar.get(Calendar.MONTH) + 1).append(">");
                System.out.println(stringBuilder);
                stringBuilder.setLength(0);
                stringBuilder.append("Year: <").append(calendar.get(Calendar.YEAR)).append(">");
                System.out.println(stringBuilder);

            }
        } else {
            System.out.println("Check your insert, matches not found");
        }
    }
}


