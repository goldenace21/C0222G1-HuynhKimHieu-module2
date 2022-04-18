package _11_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class CheckSym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Enter String: ");
        String string = scanner.nextLine();

        boolean check = false;
        char left = ' ';

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stack.push(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    check = false;
                } else {
                    left = stack.pop();
                }
                if (left != '(') {
                    check = false;
                }
            }
        }
        System.out.println(check);
    }
}

