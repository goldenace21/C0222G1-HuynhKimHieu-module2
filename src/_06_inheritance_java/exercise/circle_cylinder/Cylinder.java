package _06_inheritance_java.exercise.circle_cylinder;

public class Cylinder extends Circle {
    private int height;

    public Cylinder() {
    }

    public Cylinder(double radius,String color, int height) {
        super(radius, color);
        this.height = height;
        
    }
    public int getHeight(int height){
        return this.height;
    }

    public double getVolume(int height,double radius){
        return Math.PI*Math.pow(radius,2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color=" + color +
                " height=" + height +
                '}';
    }
}

