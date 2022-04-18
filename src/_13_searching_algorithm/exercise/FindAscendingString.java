package _13_searching_algorithm.exercise;

import java.util.ArrayList;
import java.util.List;

public class FindAscendingString {
    public static void main(String[] args) {
        String string = "Welcome";
        char min = '@';
        List<Character> list = new ArrayList<>();
        StringBuilder ascendingString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= min) {
                ascendingString.append(list.get(i));
                min = list.get(i);
            }
        }
        System.out.println(ascendingString);
    }
}

