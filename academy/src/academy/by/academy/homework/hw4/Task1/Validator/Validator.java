package academy.by.academy.homework.hw4.Task1.Validator;

import java.util.regex.Pattern;

public class Validator implements Datable {

    public final static Pattern pattern = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}");

    public Validator() {
        super();
    }

    @Override
    public boolean validate(String str) {
        return pattern.matcher(str).matches();
    }
}
