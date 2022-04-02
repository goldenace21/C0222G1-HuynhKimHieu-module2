package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class PrintHello {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Hello " + name);
        }
    }
}
