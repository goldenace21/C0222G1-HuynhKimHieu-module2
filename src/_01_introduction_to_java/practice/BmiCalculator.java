package _01_introduction_to_java.practice;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height, weight, bmi;

        System.out.println("your weight (in kilogram): ");
        weight = sc.nextDouble();

        System.out.println("your height (in meter): ");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height,20);

        if (bmi < 18) {
            System.out.println("%-20.2f%s" + bmi + "Underweight");
        } else if (bmi < 25.0) {
            System.out.println("%-20.2f%s" + bmi + "Normal");
        } else if (bmi < 30) {
            System.out.println("%-20.2f%s" + bmi + "Overweight");
        } else {
            System.out.println("%-20.2f%s" + bmi + "Obese");
        }
    }
}
