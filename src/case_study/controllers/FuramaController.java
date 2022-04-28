package case_study.controllers;

import case_study.services.impl.CustomerServiceImpl;
import case_study.services.impl.EmployeeServiceImpl;
import case_study.services.impl.FacilityServiceImpl;
import case_study.utils.ChooseException;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public static EmployeeServiceImpl employeeService;
    public static CustomerServiceImpl customerService;
    public static FacilityServiceImpl facilityService;
    public static ChooseException choose;

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        choose = new ChooseException();
        while (true) {
            System.out.println("╔════════════════════════════════════╗"
                      + "\n" + "║         MANAGEMENT PROGRAM         ║"
                      + "\n" + "╠════════════════════════════════════╣"
                      + "\n" + "║ 1. Employee Management             ║"
                      + "\n" + "║ 2. Customer Management             ║"
                      + "\n" + "║ 3. Facility Management             ║"
                      + "\n" + "║ 4. Booking Management              ║"
                      + "\n" + "║ 5. Promotion Management            ║"
                      + "\n" + "║ 6. Exit                            ║"
                      + "\n" + "╚════════════════════════════════════╝");
            switch (choose.checkChoose()) {
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
                    return;
                default:
                    System.err.println("Enter number 1-6");
                    break;
            }
        }
    }

    public static void displayEmployeeManagement() {
        employeeService = new EmployeeServiceImpl();
        while (true) {
            System.out.println("╔════════════════════════════════════╗"
                      + "\n" + "║         EMPLOYEE MANAGEMENT        ║"
                      + "\n" + "╠════════════════════════════════════╣"
                      + "\n" + "║ 1. Display list employee           ║"
                      + "\n" + "║ 2. Add new employee                ║"
                      + "\n" + "║ 3. Edit employee                   ║"
                      + "\n" + "║ 4. Return main menu                ║"
                      + "\n" + "╚════════════════════════════════════╝");
            switch (choose.checkChoose()) {
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
                    return;
                default:
                    System.err.println("Enter number 1-4");
                    break;
            }
        }
    }

    public static void displayCustomerManagement() {
        customerService = new CustomerServiceImpl();
        while (true) {
            System.out.println("╔════════════════════════════════════╗"
                      + "\n" + "║         CUSTOMER MANAGEMENT        ║"
                      + "\n" + "╠════════════════════════════════════╣"
                      + "\n" + "║ 1. Display list customers          ║"
                      + "\n" + "║ 2. Add new customers               ║"
                      + "\n" + "║ 3. Edit customers                  ║"
                      + "\n" + "║ 4. Return main menu                ║"
                      + "\n" + "╚════════════════════════════════════╝");
            switch (choose.checkChoose()) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.err.println("Enter number 1-4");
                    break;
            }
        }
    }

    public static void displayFacilityManagement() {
        facilityService = new FacilityServiceImpl();
        while (true) {
            System.out.println("╔══════════════════════════════════════╗"
                      + "\n" + "║         FACILITY MANAGEMENT          ║"
                      + "\n" + "╠══════════════════════════════════════╣"
                      + "\n" + "║ 1. Display list facility             ║"
                      + "\n" + "║ 2. Add new facility                  ║"
                      + "\n" + "║ 3. Display list facility maintenance ║"
                      + "\n" + "║ 4. Return main menu                  ║"
                      + "\n" + "╚══════════════════════════════════════╝");
            switch (choose.checkChoose()) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    facilityService.displayMaintain();
                    break;
                case 4:
                    return;
                default:
                    System.err.println("Enter number 1-4");
                    break;
            }
        }
    }

    public static void addNewFacility() {
        while (true) {
            System.out.println("╔════════════════════════════════════╗"
                      + "\n" + "║          ADD NEW FACILITY          ║"
                      + "\n" + "╠════════════════════════════════════╣"
                      + "\n" + "║ 1. Add new vila                    ║"
                      + "\n" + "║ 2. Add house                       ║"
                      + "\n" + "║ 3. Add new room                    ║"
                      + "\n" + "║ 4. Return facility management      ║"
                      + "\n" + "╚════════════════════════════════════╝");
            switch (choose.checkChoose()) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    return;
                default:
                    System.err.println("Enter number 1-4");
                    break;
            }
        }
    }

    public static void displayBookingManagement() {
        while (true) {
            System.out.println("╔════════════════════════════════════╗"
                      + "\n" + "║         BOOKING MANAGEMENT         ║"
                      + "\n" + "╠════════════════════════════════════╣"
                      + "\n" + "║ 1. Add new booking                 ║"
                      + "\n" + "║ 2. Display list booking            ║"
                      + "\n" + "║ 3. Create new contracts            ║"
                      + "\n" + "║ 4. Display list contracts          ║"
                      + "\n" + "║ 5. Edit contracts                  ║"
                      + "\n" + "║ 6. Return main menu                ║"
                      + "\n" + "╚════════════════════════════════════╝");
            switch (choose.checkChoose()) {
                case 1:
                default:
                    System.err.println("Enter number 1-6");
                    break;
            }
        }
    }

    public static void displayPromotionManagement() {
        while (true) {
            System.out.println("╔═══════════════════════════════════════╗"
                      + "\n" + "║         PROMOTION MANAGEMENT          ║"
                      + "\n" + "╠═══════════════════════════════════════╣"
                      + "\n" + "║ 1. Display list customers use service ║"
                      + "\n" + "║ 2. Display list customers get voucher ║"
                      + "\n" + "║ 3. Return main menu                   ║"
                      + "\n" + "╚═══════════════════════════════════════╝");
            switch (choose.checkChoose()) {
                case 1:
                default:
                    System.err.println("Enter number 1-3");
                    break;

            }
        }
    }
}
