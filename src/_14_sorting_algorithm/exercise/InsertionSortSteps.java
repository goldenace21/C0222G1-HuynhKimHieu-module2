package _14_sorting_algorithm.exercise;

import java.util.Arrays;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class InsertionSortSteps {
    public static void main(String[] args) {
        int[] array = {4,3,5,2,41,6,1};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
            System.out.println(Arrays.toString(array));
        }
    }
}
