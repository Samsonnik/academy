package lesson3.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator{

    final Pattern emailPattern = Pattern.compile("^([A-z0-9]{1,})@([A-z]{1,}).([A-z]{1,3})$");

    @Override
    public boolean validate(String lineForCheck) {
        Matcher emailMatcher = emailPattern.matcher(lineForCheck);
        return emailMatcher.matches();
    }
}
