package _12_collection_framework.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class UseMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("hieu",21);
        hashMap.put("quynh",18);
        hashMap.put("uyen",20);
        hashMap.put("huyen",22);
        hashMap.put("minh",22);
        System.out.println("Displpay entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("quang", 20);
        linkedHashMap.put("ngoc", 21);
        linkedHashMap.put("linh", 22);
        linkedHashMap.put("cuc", 24);
        System.out.println("\nThe age for " + "cuc is " + linkedHashMap.get("cuc"));
    }
}
