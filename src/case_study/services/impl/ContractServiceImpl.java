package case_study.services.impl;

import case_study.models.booking_contract.Booking;
import case_study.models.booking_contract.Contract;
import case_study.models.person.Customer;
import case_study.services.interfacee.ContractService;
import java.util.*;
import static case_study.controllers.FuramaController.scanner;

public class ContractServiceImpl implements ContractService {

    static List<Contract> contractList = new ArrayList<>();

    @Override
    public void createContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();

            System.out.println("creating contract for booking with information" + booking.toString());
            System.out.println("creating contract for customer with information" + customer.toString());

            String id;
            while (true) {
                System.out.println("Enter id contract: ");
                id = scanner.nextLine();
                if (isExisted(id) == null) {
                    break;
                } else {
                    System.err.println("id already existed");;
                }
            }

            System.out.println("Enter prepayment: ");
            String prepayment = scanner.nextLine();
            System.out.println("Enter total payable: ");
            String totalPayable = scanner.nextLine();

            Contract contract = new Contract(id,booking,prepayment,totalPayable,customer);
            contractList.add(contract);
            System.out.println("create contract successfully");
        }

    }

    @Override
    public void displayContract() {
        if (contractList.isEmpty()) {
            System.err.println("Empty list contract");
        } else {
            for (Contract contract: contractList) {
                System.out.println(contract.toString());
            }
        }
    }

    @Override
    public void editContract() {
        if (contractList.isEmpty()) {
            System.err.println("Empty contract list");
        } else {
            System.out.println("Enter id contract");
            String id = scanner.nextLine();
            for (Contract item: contractList) {
                if (item.getId().equals(id)) {
                    item.getBooking().setIdBooking(scanner.nextLine());
                    item.setPrepayment(scanner.nextLine());
                    item.setTotalPayable(scanner.nextLine());
                    item.getCustomer().setIdCard(scanner.nextLine());
                }
            }
            System.out.println("Edit successfully");
        }
    }

    public Object isExisted(String id) {
        for (Contract item : contractList) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}
