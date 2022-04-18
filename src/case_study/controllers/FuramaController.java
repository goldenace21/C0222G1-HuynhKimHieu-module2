package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            switch (scanner.nextInt()) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    check = false;
                    break;
            }
        }
    }

    public static void displayEmployeeManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            switch (scanner.nextInt()) {
                case 1:

            }
        }
    }

    public static void displayCustomerManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            switch (scanner.nextInt()) {
                case 1:

            }
        }
    }

    public static void displayFacilityManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            switch (scanner.nextInt()) {
                case 1:

            }
        }
    }

    public static void displayBookingManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            switch (scanner.nextInt()) {
                case 1:

            }
        }
    }

    public static void displayPromotionManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("6. Return main menu");
            switch (scanner.nextInt()) {
                case 1:

            }
        }
    }
}
