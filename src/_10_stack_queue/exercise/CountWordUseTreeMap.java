package _10_stack_queue.exercise;

import java.util.Scanner;
import java.util.TreeMap;

public class CountWordUseTreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String: ");
        String string = sc.nextLine();
        String[] stringArray;
        stringArray = string.split(" ");

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String s : stringArray) {
            if (map.containsKey(s)) {
                int value = map.get(s) + 1;
                map.put(s, value);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);

    }
}
