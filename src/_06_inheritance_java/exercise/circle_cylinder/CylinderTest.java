package _06_inheritance_java.exercise.circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.getVolume(4,2.0)); 
        
         cylinder = new Cylinder(2.0,"blue",10);
        System.out.println(cylinder);

        System.out.println(cylinder.getArea(2.0));
    }
}
