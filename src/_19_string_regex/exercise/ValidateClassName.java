package _19_string_regex.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        String[] className = new String[] {"C0318G", "M0318G", "P0323A"};
        String regex = "^[C|A|P]{1}[0-9]{4}[G-M]{1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0;i< className.length;i++) {
            matcher = pattern.matcher(className[i]);
            if (matcher.find()) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
