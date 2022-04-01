package _02_loop_java.practice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number+ " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
