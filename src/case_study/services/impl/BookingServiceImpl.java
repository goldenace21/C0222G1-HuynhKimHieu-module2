package case_study.services.impl;

import case_study.models.booking_contract.Booking;
import case_study.models.facility.Facility;
import case_study.models.person.Customer;
import case_study.services.interfacee.BookingService;
import case_study.utils.BookingComparator;
import case_study.utils.FacilityRegex;
import case_study.utils.RegexData;
import java.util.*;
import static case_study.controllers.FuramaController.scanner;
import static case_study.services.impl.CustomerServiceImpl.customerList;
import static case_study.services.impl.FacilityServiceImpl.facilityMap;

public class BookingServiceImpl implements BookingService {

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    public static Set<Booking> sendBooking() {
        return bookingSet;
    }

    @Override
    public void addBooking() {
        String id;
        if (!bookingSet.isEmpty()) {
            id = String.valueOf(bookingSet.size()+1);
        } else {
            id = "1";
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Enter rental start date: ");
        String startDate = RegexData.regexString(scanner.nextLine(), FacilityRegex.REGEX_DATEOFBIRTH,"error format date");
        System.out.println("Enter rental end date: ");
        String endDate = RegexData.regexString(scanner.nextLine(), FacilityRegex.REGEX_DATEOFBIRTH,"error format date");

        Booking booking = new Booking(id,startDate,endDate,customer,facility);
        bookingSet.add(booking);
        for (Customer item: customerList) {
           if (item.getIdCard().equals(customer.getIdCard())) {
               customer.setStatusBooking(true);
           }
        }
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (facilityMap.containsKey(facility)) {
                facilityMap.put(facility,entry.getValue()+1);
            }
        }
        System.out.println("booking successfully!");
        displayBooking();
    }

    @Override
    public void displayBooking() {
        if (!bookingSet.isEmpty()) {
            for (Booking booking : bookingSet) {
                System.out.println(booking.toString());
            }
        } else
            System.err.println("Empty list booking!");
    }

    public static Customer chooseCustomer() {
        System.out.println("Customer list");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        boolean check = true;
        while (check) {
            System.out.println("Enter id card customer: ");
            String id = scanner.nextLine();
            if (isExistedCustomer(id) == null) {
                System.err.println("customer does not exist");
            } else {
                return isExistedCustomer(id);
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("Service list: ");
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        while (true) {
            System.out.println("Enter id service: ");
            String id = scanner.nextLine();
            if (isExistedFacility(id) == null) {
                System.err.println("service does not exist");
            } else {
                return isExistedFacility(id);
            }
        }
    }

    public static Facility isExistedFacility(String id) {
        for (Map.Entry<Facility,Integer> entry : facilityMap.entrySet()) {
            if (id.equals(entry.getKey().getId())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static Customer isExistedCustomer(String id) {
        for (Customer customer : customerList) {
            if (customer.getIdCard().equals(id)) {
                return customer;
            }
        }
        return null;
    }
}
