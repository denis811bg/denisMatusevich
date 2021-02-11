package academy.by.academy.homework.hw3.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validate {
    public final static Pattern pattern = Pattern.compile("\\+375([\\- ]?)((29)|(33)|(44)|(25))([\\- ]?)[\\d]{7}");

    @Override
    public boolean validate(String strPhoneNumber) {
        Matcher matcher = pattern.matcher(strPhoneNumber);
        return matcher.find();
    }
}
