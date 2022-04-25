package case_study.services.impl;

import case_study.models.person.Customer;
import case_study.models.person.Employee;
import case_study.services.Interface.CustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customer> customerList = new LinkedList<>();

    @Override
    public void display() {
        if (customerList.isEmpty()) {
            System.err.println("Empty list!");
        } else {
            for (Customer customer : customerList) {
                System.out.println(customer.toString());
            }
        }
    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public Employee isExisted(String id) {
        return null;
    }

}
