package Lesson4.homework.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    final static Pattern dateType = Pattern.compile("^(0[1-9]|[1-2][1-9]|3[0-1])-(0[1-9]|1[1-2])-(199[0-9]|20[0-9][0-9])$");

    public static boolean validateInputDate(String inputDate) {

        boolean check = false;
        Matcher matcher = dateType.matcher(inputDate);
        if (matcher.matches()) {
            if (!LocalDate.parse(inputDate, formatter).isAfter(LocalDate.now())) {
                check = true;
            }
        }
        return check;
    }

    public static boolean validateDayOfWeek(String inputDate) {
        Matcher matcher = dateType.matcher(inputDate);
        return matcher.matches();
    }

    public static boolean validateInputDate(String dateFrom, String dateTo) {
        Matcher matcherFrom = dateType.matcher(dateFrom);
        Matcher matcherTo = dateType.matcher(dateTo);
        return matcherFrom.matches() && matcherTo.matches();
    }
}
