package _03_array_function_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.print("Enter 2D array size : ");
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            System.out.println("Enter array elements : ");

            int twoD[][] = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    twoD[i][j] = sc.nextInt();
                }
            }
            System.out.println(Arrays.deepToString(twoD));
        }
    }
}
