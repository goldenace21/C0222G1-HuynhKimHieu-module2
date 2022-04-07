package _04_class_object_java.exercise.class_quadratic_equation;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * (a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * (a * c))) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * (a * c))) / 2 * a;
    }
}
