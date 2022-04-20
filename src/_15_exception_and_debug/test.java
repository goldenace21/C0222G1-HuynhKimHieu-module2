package _15_exception_and_debug;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        try {
            System.out.println("Enter number: ");
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("sai");
        }
        System.out.println(num);
    }

}
