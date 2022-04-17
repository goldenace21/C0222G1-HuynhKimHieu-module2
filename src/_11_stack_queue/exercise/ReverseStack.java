package _11_stack_queue.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//  reverse integer
//        System.out.println("Enter size: ");
//        int n = scanner.nextInt();
//
//        int[] integer = new int[n];
//        Stack<Integer> stackInteger = new Stack<>();
//
//
//
//        for(int i = 0;i < n;i++) {
//            System.out.println("Enter integer element "+(i+1)+": ");
//            stackInteger.push(scanner.nextInt());
//        }
//        System.out.println(stackInteger);
//
//
//        for(int i = 0;i < n;i++) {
//            integer[i] = stackInteger.pop();
//            System.out.print(" ");
//        }
//        System.out.println(Arrays.toString(integer));
//


//  reverse string
        System.out.println("enter string: ");
        String string = scanner.nextLine();
        StringBuilder string2 = new StringBuilder();
        String[] charArray;

        charArray = string.split(" ");
        System.out.println(Arrays.toString(charArray));
        Stack<String> stackString = new Stack<>();

        for (String s : charArray) {
            stackString.push(s);
        }

        for (int i = 0; i < charArray.length; i++) {
            string2.append(stackString.pop());
            string2.append(" ");
        }
        System.out.println(string2);
    }
}
