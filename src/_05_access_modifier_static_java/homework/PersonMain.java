package _05_access_modifier_static_java.homework;

import java.util.Scanner;

public class PersonMain {
    static Scanner scanner = new Scanner(System.in);
    static Person[] person = new Person[10];

    public static void main(String[] args) {
        person[0] = new Student("hieu", 21, true, 10);
        person[1] = new Student("hao", 21, true, 10);
        person[2] = new Teacher("hua", 01, true, 190);
        person[3] = new Teacher("quang", 8, true, 184);

        while (true) {
            System.out.println("1: display");
            System.out.println("2: add");
            System.out.println("3: remove");
            System.out.println("4: exit");
            System.out.println("enter your choice: ");
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
            if (number == 4) {
                break;
            }

        }

    }

    public static void display() {
        for (Person value : person) {
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

        System.out.println("enter gender:" +
                "1 male" +
                "2 female");
        int check = Integer.parseInt(scanner.nextLine());
        boolean gender = true;
        if (check == 1) {
            gender = true;
        } else if (check ==2) {
            gender = false;
        }

        System.out.println("enter point");
        int point = Integer.parseInt(scanner.nextLine());
        int index = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i] == null) {
                index = i;
                break;
            }
        }
        person[index] = new Student(name, age, gender, point);
        System.out.println("add successful");
        display();
    }

    public static void remove() {
        System.out.println("enter index");
        int index = scanner.nextInt();
        for (int i = index; i < person.length; i++) {
            if (i < person.length - 1) {
                person[i] = person[i + 1];

            }
        }
        person[person.length - 1] = null;
        System.out.println("remove successful");
        display();
    }
}
