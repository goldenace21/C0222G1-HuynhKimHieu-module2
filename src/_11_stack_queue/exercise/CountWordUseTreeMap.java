package _11_stack_queue.exercise;

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

        for (String key : stringArray) {
            if (map.containsKey(key)) {
                int value = map.get(key) + 1;
                map.put(key, value);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
    }
}
