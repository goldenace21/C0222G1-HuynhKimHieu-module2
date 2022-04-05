package _03_array_function_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = { 10, 4, 6, 7, 8, 6, 0, 0, 0 };
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter element delete");
            int x = scanner.nextInt();
            int index = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == x) {
                    index = i;
                }
            }
            for (int i = index; i < array.length; i++) {
                if (i < array.length - 1) {
                    array[i] = array[i + 1];
                }
            }
            array[array.length - 1] = 0;
            System.out.println(Arrays.toString(array));
        }
    }
}
