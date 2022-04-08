package _07_abstract_class_interface.exercise.interface_resizeable;

public class Square extends Shape implements Resizeable {
    private double side;


    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return Math.pow(this.side, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area= " + getArea()+
                '}';
    }

    @Override
    public void resize(double percent) {
       this.side = this.side+this.side*percent/100;
    }
}
