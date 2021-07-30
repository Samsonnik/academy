package lesson3.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator{
    final Pattern belarusPhonePattern = Pattern.compile("^(\\+375(_||-)?(29)?(_||-)?(33)?(_||-)?(44)?(_||-)?[0-9]{2}(_||-)?[0-9]{2}(_||-)?[0-9]{3})$");

    @Override
    public boolean validate(String lineForCheck) {
        Matcher belarusPhoneMatcher = belarusPhonePattern.matcher(lineForCheck);
        return belarusPhoneMatcher.matches();
    }
}
