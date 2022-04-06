package _05_access_modifier_static_java.exercise.access_modifier;

public class Circle {
    private double radius = 2.0; 
    private String color = "red";

    Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double area = Math.PI*Math.pow(this.radius,2);
        return area;
    }
}
