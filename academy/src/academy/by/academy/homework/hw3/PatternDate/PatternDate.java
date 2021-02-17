package academy.by.academy.homework.hw3.PatternDate;

import java.util.regex.Pattern;

public class PatternDate implements PatternDatable {
    public final static Pattern patternSlash = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
    public final static Pattern patternDash = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}");

    @Override
    public boolean validateSlash(String str) {
        if (patternSlash.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean validateDash(String str) {
        if (patternDash.matcher(str).matches()) {
            return true;
        }
        return false;
    }
}
