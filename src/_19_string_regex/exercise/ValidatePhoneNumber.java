package _19_string_regex.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String[] phoneNumberList = new String[]
        {"(84)-(0978489648)","(a8)-(22222222)"};
        String regex = "^[(][0-9]{2}[)][-][(](0)[0-9]{9}[)]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (String s : phoneNumberList) {
            matcher = pattern.matcher(s);
            System.out.println(matcher.find());
        }
    }
}
