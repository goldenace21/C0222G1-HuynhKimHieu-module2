package _05_access_modifier_static_java.exercise.class_java;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("hieu");
        student1.setClas("c011");
        System.out.println(student1.getName());
        System.out.println(student1.getClas());
    }
}