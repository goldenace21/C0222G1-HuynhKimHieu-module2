package _02_loop_java.exercise;

import java.util.Scanner;

public class Print20PrimeNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int count = 0;
            int a = 2;
            int n =20;
            while (count <n){
                boolean check = true;
                for (int i =2; i<a;i++){
                    if(a % i ==0){
                        check= false;
                        break;
                    }
                }
                if (check){
                    System.out.println(a);
                    count++;
                }
                a++;
            }
        }

    }

}
