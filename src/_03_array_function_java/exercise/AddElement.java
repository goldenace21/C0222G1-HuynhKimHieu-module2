package _03_array_function_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] array = { 10, 4, 6, 7, 8, 0, 0, 0, 0, 0 };
            int x;
            int index;

            System.out.println("Enter add element");
            x = scanner.nextInt();
            while (true) {
                System.out.println("Enter index");
                index = scanner.nextInt();
                if (index > -1 && index <= array.length - 1) {
                    break;
                }
            }
            for (int i = array.length - 1; i < array.length; i--) {
                array[i] = array[i - 1];
                if (i == index) {
                    array[i] = x;
                    break;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
