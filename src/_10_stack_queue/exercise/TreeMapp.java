package _10_stack_queue.exercise;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String: ");
        String string = sc.nextLine();
        String[] stringArray;
        stringArray = string.split(" ");

        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < stringArray.length; i++) {
            if (map.containsKey(stringArray[i])){
                int value = map.get(stringArray[i]) + 1;
                map.put(stringArray[i], value);
            } else {
                map.put(stringArray[i], 1);
            }
        }
        System.out.println(map);
    }
}
