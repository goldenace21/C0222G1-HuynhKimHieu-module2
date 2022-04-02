package _03_array_function_java.exercise;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        int[] array = new int[3];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter element " + i);
                array[i] = scanner.nextInt();
            }
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
