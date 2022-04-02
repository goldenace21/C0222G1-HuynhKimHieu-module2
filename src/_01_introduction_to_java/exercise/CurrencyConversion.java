package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        String rate = "23000 VND/USD.";
        System.out.println(rate);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("input usd");
            int usd = sc.nextInt();
            int vnd = usd*23000;
            System.out.println("$"+usd + " = " + vnd + "vnd");
        }

    }
}
