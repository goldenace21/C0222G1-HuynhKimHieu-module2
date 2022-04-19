package _14_sorting_algorithm.exercise;

public class SelectionSort {
    public static void main(String[] args) {

    }
    public static void selectionSort(int[] array){
        int temp;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]> max){
                max = array[i];
            }
        }
    }
}
