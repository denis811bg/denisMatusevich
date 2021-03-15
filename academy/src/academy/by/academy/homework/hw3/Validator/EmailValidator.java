package academy.by.academy.homework.hw3.Validator;

import java.util.regex.Pattern;

public class EmailValidator implements Validate {
    public final static Pattern pattern = Pattern.compile("^([a-z0-9_\\-]+\\.)*[a-z0-9_\\-]+@[a-z0-9_\\-]+(\\.[a-z0-9_\\-]+)*\\.[a-z]{2,6}$");

    @Override
    public boolean validate(String strEmailValidator) {
        return pattern.matcher(strEmailValidator).find();
    }
}
