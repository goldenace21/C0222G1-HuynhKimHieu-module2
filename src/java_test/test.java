package java_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        String string = "CodegymDaNang";
        Stack<Character> stack = new Stack<>();
        StringBuilder stringfinal = new StringBuilder("");
        for(int i = 0; i < string.length();i++) {
            if (string.charAt(i) < 91 && i !=0) {
                stack.add(' ');
            }
            stack.add(string.charAt(i));
        }
        for (Character item : stack) {
            stringfinal.append(stack.pop());
        }

    }
}
