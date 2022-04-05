package _04_class_object_java.exercise.fan;

public class ClassFan {
    public static void main(String[] args) {
        fan fan1 = new fan();
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());

        fan fan2 = new fan();
        fan2.setSpeed(2);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }
}
