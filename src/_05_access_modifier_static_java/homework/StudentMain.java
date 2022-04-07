package _05_access_modifier_static_java.homework;


import java.util.Scanner;

public class StudentMain {
    static Scanner scanner = new Scanner(System.in);
    static Student[] student = new Student[10];

    public static void main(String[] args) {
        student[0] = new Student("hieu", 21, "hoian", 10);
        student[1] = new Student("hao", 21, "japan", 10);
        System.out.println("1: display");
        System.out.println("2: add");
        System.out.println("3: remove");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 1:
                display();
                break;
            case 2:
                add();
                break;
            case 3:
                remove();
                break;
        }

    }

    public static void display() {
        for (Student value : student) {
            if (value != null) {
                System.out.println(value);
            }
        }
    }

    public static void add() {
        System.out.println("enter name");
        String name = scanner.nextLine();

        System.out.println("enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("enter address");
        String address = scanner.nextLine();

        System.out.println("enter point");
        int point = Integer.parseInt(scanner.nextLine());
        int index = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) {
                index = i;
                break;
            }
        }
        student[index] = new Student(name, age, address, point);
        System.out.println("add successful");
        display();
    }

    public static void remove() {
        System.out.println("enter index");
        int index = scanner.nextInt();
        for (int i =index; i < student.length; i++) {
            if (i< student.length -1) {
                student[i] = student[i+1];

            }
        }
        student[student.length -1] = null;
        System.out.println("remove successful");
        display();
    }
}
