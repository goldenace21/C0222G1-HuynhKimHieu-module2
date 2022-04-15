package _10_stack_queue.exercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SortList {
    public static class Person implements Comparable<Person> {
        private String name;
        private int age;
        private boolean sex;

        public Person(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isSex() {
            return sex;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

        @Override
        public int compareTo(Person o) {
            return Integer.compare(this.getAge(), o.getAge());
//            if (this.getAge() > o.getAge()) {
//                return 1;
//            } else if (this.getAge() < o.getAge()) {
//                return -1;
//
//            } else {
//                return 0;
//            }
        }
    }

    public static void main(String[] args) {
        Queue<Person> male = new LinkedList<>();
        Queue<Person> female = new LinkedList<>();

        Person[] person = new Person[5];
        person[0] = new Person("hieu", 19, true);
        person[1] = new Person("hao", 29, true);
        person[2] = new Person("linh", 18, false);
        person[3] = new Person("quynh", 20, false);
        person[4] = new Person("ngoc", 22, false);

        Arrays.sort(person);

        for (Person item : person) {
            if (item.isSex()) {
                male.add(item);
            } else {
                female.add(item);
            }
        }
        for (Person item : female) {
            System.out.println(item);
        }
        for (Person item : male) {
            System.out.println(item);
        }
    }
}
