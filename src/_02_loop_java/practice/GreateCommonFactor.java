package _02_loop_java.practice;

import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a: ");
            a = input.nextInt();
            System.out.println("Enter b: ");
            b = input.nextInt();
        }
        a = Math.abs(a);
        b = Math.abs(b);

        if(a == 0 || b ==0) {
            System.out.println("no greatest common factor");
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
