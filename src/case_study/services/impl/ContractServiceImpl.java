package case_study.services.impl;

import _10_array_list.practice.class_linked_list.LinkedList;
import case_study.models.booking_contract.Booking;
import case_study.models.booking_contract.Contract;
import case_study.services.interfacee.ContractService;
import sun.misc.Queue;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ContractServiceImpl implements ContractService {

    static List<Contract> contractList = new ArrayList<>();

    @Override
    public void createContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
    }

    @Override
    public void displayContract() {

    }

    @Override
    public void editContract() {

    }
}
