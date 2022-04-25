package _19_string_regex.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        String[] className = new String[] {"C0318G", "M0318G", "P0323A"};
        String regex = "^[C|A|P][0-9]{4}[G-M]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (String s : className) {
            matcher = pattern.matcher(s);
            System.out.println(matcher.find());
        }
    }
}
