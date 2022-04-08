package _07_abstract_class_interface.exercise.interface_resizeable;

public class TestResizeable {
     public static void main(String[] args) {
         Shape[] shapes = new Shape[3];
         shapes[0] = new Circle(2.0,"yellow",false);
         shapes[1] = new Rectangle(2.0,2.0,"green", true);
         shapes[2] = new Square("red",true,2.0);
         for (Shape item : shapes){
             System.out.println(item);
         }
         for (Shape item:shapes) {
             item.resize(50);
             System.out.println(item);
         }
    }
}


