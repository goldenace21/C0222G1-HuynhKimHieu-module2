package _03_array_function_java.exercise;

import java.util.Scanner;

public class CountCharacter {
    public static int countCharacter(String string, char character) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String string = "qqwweerrttyy";
            char character = scanner.next().charAt(0);
            System.out.println(countCharacter(string,character));
        }
    }
}
