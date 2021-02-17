package academy.by.academy.homework.hw3.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validate {
    public final static Pattern pattern = Pattern.compile("\\+1([\\- ]?)[\\d]([\\- ]?){10}");

    @Override
    public boolean validate(String strPhoneNumber) {
        Matcher matcher = pattern.matcher(strPhoneNumber);
        return matcher.matches();
    }
}
