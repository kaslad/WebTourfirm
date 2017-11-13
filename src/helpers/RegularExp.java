package helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class RegularExp {
    public static boolean IsPasswordRight(String s){
        Pattern data = Pattern.compile("(^[a-z]+)");
        Matcher m = data.matcher(s);
        return m.matches();
    }
    public static boolean IsLoginRight(String s){
        Pattern data = Pattern.compile("(^[a-z]+)");
        Matcher m = data.matcher(s);
        return m.matches();
    }

}
