package helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class RegularExp {
    public static boolean IsPasswordRight(String s){
        Pattern data = Pattern.compile("^[a-z0-9_-]{3,16}$");
        Matcher m = data.matcher(s);
        return m.matches();
    }
    public static boolean IsLoginRight(String s){
        Pattern data = Pattern.compile("^[a-z0-9_-]{6,18}$");
        Matcher m = data.matcher(s);
        return m.matches();
    }

}
