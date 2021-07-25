package lesson3.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator{

    final Pattern americanPhonePattern = Pattern.compile("^(\\+1(_||-)?[0-9]{3}(_||-)?[0-9]{3}(_||-)?[0-9]{4})$");

    @Override
    public boolean validate(String lineForCheck) {
        Matcher americanPhoneMatcher = americanPhonePattern.matcher(lineForCheck);
        return americanPhoneMatcher.matches();
    }
}
