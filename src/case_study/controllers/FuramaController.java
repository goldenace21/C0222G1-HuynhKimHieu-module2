package case_study.controllers;

import case_study.services.impl.*;
import case_study.utils.ChooseCheck;
import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public static CustomerServiceImpl customerService = new CustomerServiceImpl();
    public static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public static BookingServiceImpl bookingService = new BookingServiceImpl();
    public static ContractServiceImpl contractService = new ContractServiceImpl();
    public static PromotionServiceImpl promotionService = new PromotionServiceImpl();
    public static ChooseCheck choose = new ChooseCheck();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
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
            switch (choose.chooseCheck(6)) {
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
            }
        }
    }

    public static void displayEmployeeManagement() {
        while (true) {
            System.out.println("╔════════════════════════════════════╗"
                      + "\n" + "║         EMPLOYEE MANAGEMENT        ║"
                      + "\n" + "╠════════════════════════════════════╣"
                      + "\n" + "║ 1. Display list employee           ║"
                      + "\n" + "║ 2. Add new employee                ║"
                      + "\n" + "║ 3. Edit employee                   ║"
                      + "\n" + "║ 4. Return main menu                ║"
                      + "\n" + "╚════════════════════════════════════╝");
            switch (choose.chooseCheck(4)) {
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
            }
        }
    }

    public static void displayCustomerManagement() {
        while (true) {
            System.out.println("╔════════════════════════════════════╗"
                      + "\n" + "║         CUSTOMER MANAGEMENT        ║"
                      + "\n" + "╠════════════════════════════════════╣"
                      + "\n" + "║ 1. Display list customers          ║"
                      + "\n" + "║ 2. Add new customers               ║"
                      + "\n" + "║ 3. Edit customers                  ║"
                      + "\n" + "║ 4. Return main menu                ║"
                      + "\n" + "╚════════════════════════════════════╝");
            switch (choose.chooseCheck(4)) {
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
            }
        }
    }

    public static void displayFacilityManagement() {
        while (true) {
            System.out.println("╔══════════════════════════════════════╗"
                      + "\n" + "║         FACILITY MANAGEMENT          ║"
                      + "\n" + "╠══════════════════════════════════════╣"
                      + "\n" + "║ 1. Display list facility             ║"
                      + "\n" + "║ 2. Add new facility                  ║"
                      + "\n" + "║ 3. Display list facility maintenance ║"
                      + "\n" + "║ 4. Return main menu                  ║"
                      + "\n" + "╚══════════════════════════════════════╝");
            switch (choose.chooseCheck(4)) {
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
            switch (choose.chooseCheck(4)) {
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
            switch (choose.chooseCheck(6)) {
                case 1:
                    bookingService.addBooking();
                    break;
                case 2:
                    bookingService.displayBooking();
                    break;
                case 3:
                    contractService.createContract();
                    break;
                case 4:
                    contractService.displayContract();
                    break;
                case 5:
                    contractService.editContract();
                    break;
                case 6:
                    return;
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
            switch (choose.chooseCheck(3)) {
                case 1:

            }
        }
    }
}
