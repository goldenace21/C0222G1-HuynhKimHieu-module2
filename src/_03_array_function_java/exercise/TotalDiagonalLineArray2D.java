package _03_array_function_java.exercise;

import java.util.Scanner;

public class TotalDiagonalLineArray2D {
    public static int totalDiagonalLineArray(int[][] array) {
        int sum = 0;
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            sum += array[i][i] + array[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] array = {
                    { 1, 2, 3, 2, 7 },
                    { 4, 5, 6, 2, 6 },
                    { 7, 8, 9, 2, 4 },
                    { 1, 2, 3, 2, 7 },
                    { 4, 5, 6, 2, 6 }
            };
            System.out.println(totalDiagonalLineArray(array));
        }
    }
}
