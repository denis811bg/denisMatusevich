package academy.by.academy.homework.hw3.PatternDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDate implements PatternDatable{
    public final static Pattern patternSlash = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
    public final static Pattern patternDash = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}");
    public final static SimpleDateFormat formatSlash = new SimpleDateFormat("dd/MM/yyyy");
    public final static SimpleDateFormat formatDash = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public boolean validateSlash(String str) {
        Matcher matcherSlash = patternSlash.matcher(str);
        if (matcherSlash.find()){
            return true;
        }
        return false;
    }

    @Override
    public boolean validateDash(String str) {
        Matcher matcherDash = patternDash.matcher(str);
        if (matcherDash.find()){
            return true;
        }
        return false;
    }
}
