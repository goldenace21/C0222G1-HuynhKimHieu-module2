package _07_abstract_class_interface.exercise.interface_colorable;

public class Run {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3.4, "red", true);
        shapes[1] = new Square("yellow", true, 5);

        for (Shape item : shapes) {
            System.out.println(item);
            if (item instanceof Colorable) {
                Square square = (Square) item;
                square.howToColor();
            }
        }
    }
}
