package _02_loop_java.exercise;

import java.util.Scanner;

public class PrintShapes {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int choice;
            System.out.println("1: Print the rectangle");
            System.out.println("2: Print the square triangle bottom left");
            System.out.println("3: Print the square triangle top left");
            System.out.println("4: Print the square triangle bottom right");
            System.out.println("5: Print the square triangle top right");
            System.out.println("6: Print isosceles triangle");
            System.out.println("7: Exit");
            System.out.println("enter your choice");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j == 0 || i == 4) {
                                System.out.print(" * ");
                            } else if (j <= i) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i == 0 || j == 0) {
                                System.out.print(" * ");
                            } else if (j < 5 - i) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j == 4 || i == 4) {
                                System.out.print(" * ");
                            } else if (j >= 4 - i) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");

                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 5:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j == 4 || i == 0) {
                                System.out.print(" * ");
                            } else if (j >= i) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");

                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 6:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 9; j++) {
                            if (i == 4 || j == 4) {
                                System.out.print(" * ");
                            } else if (j > 4 + i || j < 4 - i) {
                                System.out.print("   ");
                            } else {
                                System.out.print(" * ");
                            }
                        }
                        System.out.print("\n");
                    }

            }
        }
    }
}
