package _01_Introduction_to_Java.exercise;

import java.util.Scanner;

public class PrintHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
