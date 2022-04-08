package _04_class_object_java.exercise.class_stop_watch;


import java.util.Arrays;

public class RunStopWatch {
   public static void main(String[] args) {
       StopWatch stopWatch = new StopWatch();
       System.out.println(stopWatch.start());
       int[] array = new int[20];
       for (int i = 0; i < array.length; i++) {
           array[i] = (int) Math.floor((Math.random() * 20.0) + 1.0);
       }
       // Arrays.sort(array);
       int[] array2 = new int[array.length];
       int number = 0;
       for (int i = 1; i <= 20; i++) {
           for (int j = 0; j < array.length; j++) {
               if (array[j] == i) {
                   array2[number] = i;
                   number++;
               }
           }
       }

       System.out.println(Arrays.toString(array));
       System.out.println(Arrays.toString(array2));
       System.out.println(stopWatch.end());
       System.out.println(stopWatch.getElapsedTime());
   }
}
