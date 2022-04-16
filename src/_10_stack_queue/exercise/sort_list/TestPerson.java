package _10_stack_queue.exercise.sort_list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TestPerson {
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
