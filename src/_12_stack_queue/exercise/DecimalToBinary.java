package _12_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter number > 0: ");
        int n = scanner.nextInt();
        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }

        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        System.out.println("binary: " + binary);
    }
}
