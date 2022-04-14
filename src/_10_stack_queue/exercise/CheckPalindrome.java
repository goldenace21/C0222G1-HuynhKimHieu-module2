package _10_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        String[] charArray;
        charArray = string.split("");

        Queue<String> queueString = new LinkedList<>();
        Stack<String> stackString = new Stack<>();
        for (int i = 0,j = string.length()-1;i< string.length();i++,j--) {
            queueString.add(charArray[i].toLowerCase());
            stackString.push(charArray[j].toLowerCase());
        }

        if (queueString.equals(stackString)) {
            System.out.println("palindrome");
        } else {
            System.out.println("!palindrome");
        }
    }
}
