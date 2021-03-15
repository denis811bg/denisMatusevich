package academy.by.academy.homework.hw3.PatternDate;

import java.util.regex.Pattern;

public class PatternDate implements PatternDatable {
    public final static Pattern patternSlash = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
    public final static Pattern patternDash = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}");

    @Override
    public boolean validateSlash(String str) {
        return patternSlash.matcher(str).matches();
    }

    @Override
    public boolean validateDash(String str) {
        return patternDash.matcher(str).matches();
    }
}
