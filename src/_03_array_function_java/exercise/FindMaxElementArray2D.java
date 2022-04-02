package _03_array_function_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElementArray2D {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] array = {
                { 10, 2, 3 },
                { 6, 7, 8 },
            };
            int max = array[0][0];
            for (int i = 0; i < array.length;i++) {
                for (int j = 0; j < array[i].length;j++) {
                    if (j<array[i].length-1) {
                        if (max < array[i][j+1]) {
                                max = array[i][j+1];
                        }
                    }
                }
            }
            System.out.println("max: " + max);
            System.out.println(Arrays. deepToString(array));
        }
    }
}
