package _04_class_object_java.exercise.quadratic_equation;

import java.util.Scanner;

public class ClassQuadraticEquation {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
            if (quadratic.getDiscriminant() >= 0) {
                System.out.print("root1: " + quadratic.getRoot1() +  "\n" + "root2: " + quadratic.getRoot2());
            } else if (quadratic.getDiscriminant() == 0) {
                System.out.println("root1 = root2 = " +  quadratic.getRoot1());
            } else {
                System.out.println("The equation has no roots");
            }
        }
    }
}
