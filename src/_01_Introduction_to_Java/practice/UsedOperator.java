package _01_Introduction_to_Java.practice;

import java.util.Scanner;

public class UsedOperator {
    public static void main(String[] args) {
        float width, height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
