package case_study.models.booking_contract;

import case_study.models.person.Customer;
import case_study.services.interfacee.ContractService;

public class Contract {
    private String id;
    private Booking booking;
    private String prepayment;
    private String totalPayable;
    private Customer customer;

    public Contract(String id, Booking booking, String prepayment, String totalPayable, Customer customer) {
        this.id = id;
        this.booking = booking;
        this.prepayment = prepayment;
        this.totalPayable = totalPayable;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getPrepayment() {
        return prepayment;
    }

    public void setPrepayment(String prepayment) {
        this.prepayment = prepayment;
    }

    public String getTotalPayable() {
        return totalPayable;
    }

    public void setTotalPayable(String totalPayable) {
        this.totalPayable = totalPayable;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id='" + id + '\'' +
                ", idBooking=" + booking.getIdBooking() +
                ", prepayment='" + prepayment + '\'' +
                ", totalPayable='" + totalPayable + '\'' +
                ", idCustomer=" + customer.getIdCard() +
                '}';
    }
}