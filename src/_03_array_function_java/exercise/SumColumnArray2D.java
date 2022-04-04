package _03_array_function_java.exercise;

import java.util.Scanner;

public class SumColumnArray2D {
    public static int sumColumnArray(int[][] array, int c) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length;j++) {
                if (i == c) {
                   sum += array[c][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][] array = {
                {1,2,3},
                {4,5,6}
            };
            System.out.println("enter column: ");
            int c = input.nextInt();
            
            System.out.println(sumColumnArray(array,c));
        }
        
    }
    
}
