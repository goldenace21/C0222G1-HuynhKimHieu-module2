package _03_array_function_java.exercise;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] brray = {6,7,8,9,10};
        int[] abrray = new int[array.length + brray.length];

        for (int i = 0; i < abrray.length; i++) {
            if (i < array.length) {
                abrray[i] = array[i];
            } else {
                abrray[i] = brray[i - array.length];
            }
        }
        System.out.println(Arrays.toString(abrray));
    }
}
