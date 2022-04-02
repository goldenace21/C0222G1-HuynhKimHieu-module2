package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("input your number: ");
            String hundreds = "";
            String dozens = "";
            String units = "";

            int number = scanner.nextInt();
            int numberHundreds = number / 100;
            int numberDozens = (number % 100) / 10;
            int numberUnits = number % 10;

            switch (numberHundreds) {
                case 1:
                    hundreds = "one hundred";
                    break;
                case 2:
                    hundreds = "two hundred";
                    break;
                case 3:
                    hundreds = "three hundred";
                    break;
                case 4:
                    hundreds = "four hundred";
                    break;
                case 5:
                    hundreds = "five hundred";
                    break;
                case 6:
                    hundreds = "six hundred";
                    break;
                case 7:
                    hundreds = " seven hundred";
                    break;
                case 8:
                    hundreds = " eight hundred";
                    break;
                case 9:
                    hundreds = " nine hundred";
                    break;
            }
            switch (numberUnits) {
                case 1:
                    units = "one";
                    break;
                case 2:
                    units = "two";
                    break;
                case 3:
                    units = "three";
                    break;
                case 4:
                    units = "four";
                    break;
                case 5:
                    units = "five";
                    break;
                case 6:
                    units = "six";
                    break;
                case 7:
                    units = "seven";
                    break;
                case 8:
                    units = "eight";
                    break;
                case 9:
                    units = "nine";
                    break;
            }

            if (numberDozens == 1) {
                switch (numberUnits) {
                    case 0:
                        dozens = "ten";
                    case 1:
                        dozens = "eleven";
                        break;
                    case 2:
                        dozens = "twelve";
                        break;
                    case 3:
                        dozens = "thirteen";
                        break;
                    case 4:
                        dozens = "fourteen";
                        break;
                    case 5 :
                        dozens = "fifteen";
                        break;
                    case 6 :
                        dozens = "sixteen";
                        break;
                    case 7:
                        dozens=  "seventeen";
                    case 8:
                        dozens=  "eighteen";
                    case 9:
                        dozens=  "nineteen";
                }

            } else {
                switch (numberDozens) {
                    case 2:
                        dozens = "twenty";
                        break;
                    case 3:
                        dozens = "thirty";
                        break;
                    case 4:
                        dozens = "forty";
                        break;
                    case 5:
                        dozens = "fifty";
                        break;
                    case 6:
                        dozens = "sixty";
                        break;
                    case 7:
                        dozens = "seventy";
                        break;
                    case 8:
                        dozens = "eighty";
                        break;
                    case 9:
                        dozens = "ninety";
                        break;
                }
            }
            if (numberDozens == 1) {
                System.out.println(hundreds +" "+ dozens);
            } else {
                System.out.println(hundreds +" "+ dozens +" "+ units);
            }
        }
    }
}
