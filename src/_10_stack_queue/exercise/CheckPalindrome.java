package _10_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        String[] charArray;
        charArray = string.split("");
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        Queue<String> queueString = new LinkedList<>();
        Stack<String> stackString = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            queueString.add(charArray[i].toLowerCase());
            stackString.push(charArray[i].toLowerCase());
        }

        for (int i = 0; i < string.length(); i++) {
            string1.append(stackString.pop());
            string2.append(queueString.poll());
        }

        System.err.println(" String is Palindrome ? " + string1.toString().equals(string2.toString()));
    }
}
