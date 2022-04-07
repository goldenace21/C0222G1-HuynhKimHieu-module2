package _06_inheritance_java.exercise.circle_cylinder;

public class Circle {
    protected double radius;
    protected String color;

    public Circle() {
    }

    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea(double radius) {
        return Math.pow(radius,2)*Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
