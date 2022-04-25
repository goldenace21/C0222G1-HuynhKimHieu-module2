package case_study.controllers;

import case_study.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean check = true;

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (check) {
            System.out.print("╔════════════════════════════════════╗"
                    + "\n" + "║         MANAGEMENT PROGRAM         ║"
                    + "\n" + "╠════════════════════════════════════╣"
                    + "\n" + "║ 1. Employee Management             ║"
                    + "\n" + "║ 2. Customer Management             ║"
                    + "\n" + "║ 3. Facility Management             ║"
                    + "\n" + "║ 4. Booking Management              ║"
                    + "\n" + "║ 5. Promotion Management            ║"
                    + "\n" + "║ 6. Exit                            ║"
                    + "\n" + "╚════════════════════════════════════╝"
                    + "\n" + " Enter your choose: ");
            switch (Integer.parseInt(scanner.nextLine())) {
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
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        while (check) {
            System.out.print("╔════════════════════════════════════╗"
                    + "\n" + "║         EMPLOYEE MANAGEMENT        ║"
                    + "\n" + "╠════════════════════════════════════╣"
                    + "\n" + "║ 1. Display list employee           ║"
                    + "\n" + "║ 2. Add new employee                ║"
                    + "\n" + "║ 3. Edit employee                   ║"
                    + "\n" + "║ 4. Remove employee                 ║"
                    + "\n" + "║ 6. Return main menu                ║"
                    + "\n" + "╚════════════════════════════════════╝"
                    + "\n" + " Enter your choose: ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    employeeService.delete();
                    break;
                case 5:
                    check = false;

            }
        }
    }

    public static void displayCustomerManagement() {
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:

            }
        }
    }

    public static void displayFacilityManagement() {
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:

            }
        }
    }

    public static void displayBookingManagement() {
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:

            }
        }
    }

    public static void displayPromotionManagement() {
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("6. Return main menu");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:

            }
        }
    }
}
