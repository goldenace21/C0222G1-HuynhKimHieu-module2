package _01_Introduction_to_Java.practice;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("a: ");
        a = sc.nextFloat();
        System.out.println("b: ");
        b = sc.nextFloat();
        System.out.println("c: ");
        c = sc.nextFloat();
        if (a !=0) {
            double answer = (c - b) / a;
            System.out.println("Equation pass width x = %f!" + answer);
        } else if (b == c) {
            System.out.println("The solution is all x!");
        } else {
            System.out.println("No solution!");
        }
    }
}
