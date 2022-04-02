package _03_array_function_java.exercise;

import java.util.Scanner;

public class FindMaxElementArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = {
            { 1, 2, 3 },
            { 99, 7, 6 },
        };
        int max = array[0][0];
        for (int i = 0; i < array.length;i++) {
            for (int j = 0; j < array[i].length;j++) {
                if (j<array[i].length-1) {
                    if (array[i][j] < array[i][j+1]) {
                            max = array[i][j+1];
                    }
                }
            }
        }
        System.out.println("max: " + max);
    }
}
