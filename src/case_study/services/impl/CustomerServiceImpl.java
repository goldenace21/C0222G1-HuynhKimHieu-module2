package case_study.services.impl;

import case_study.models.person.Customer;
import case_study.services.Interface.CustomerService;
import case_study.utils.FacilityRegex;
import case_study.utils.RegexData;
import java.util.LinkedList;
import java.util.List;

import static case_study.controllers.FuramaController.scanner;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customer> customerList = new LinkedList<>();
    static {
        customerList.add(new Customer("173", "hung", true,
                                    "12/23/2001", "hieu@1",
                                    "1234", "Platinium"));
    }

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
        String idCard, name, email, phoneNumber, dateOfBirth, type;
        boolean sex;

        System.out.println("Enter idCard: "); idCard = scanner.nextLine();
        if (isExisted(idCard) != null) {
            System.err.println("The employee already existed!");
            return;
        }

        System.out.println("Enter name: "); name = scanner.nextLine();
        System.out.println("Enter date of birth: "); dateOfBirth =
        RegexData.regexAge(scanner.nextLine(), FacilityRegex.REGEX_DATEOFBIRTH);
        System.out.println("Enter sex: 1-male 2-female"); sex = (Integer.parseInt(scanner.nextLine())) == 1;
        System.out.println("Enter email: "); email = scanner.nextLine();
        System.out.println("Enter phone number: "); phoneNumber = scanner.nextLine();
        System.out.println("Enter type: "); type = scanner.nextLine();

        customerList.add(new Customer(idCard, name, sex, dateOfBirth, email, phoneNumber, type));
        display();
    }

    @Override
    public void edit() {
        if (customerList.isEmpty()) {
            System.err.println("Empty list!");
        } else {
            Customer tempCustomer;

            System.out.print("Enter idCard: ");
            tempCustomer = isExisted(scanner.nextLine());

            if (tempCustomer == null) {
                System.err.println("The employee isn't existed!");
                return;
            }

            System.out.println("Enter name: "); tempCustomer.setName(scanner.nextLine());
            System.out.println("Enter date of birth: "); tempCustomer.setDateOfBirth(
            RegexData.regexAge(scanner.nextLine(),FacilityRegex.REGEX_DATEOFBIRTH));
            System.out.println("Enter sex: 1-male 2-female"); tempCustomer.setSex((Integer.parseInt(scanner.nextLine())) == 1);
            System.out.println("Enter email: "); tempCustomer.setEmail(scanner.nextLine());
            System.out.println("Enter phone number: "); tempCustomer.setPhoneNumber(scanner.nextLine());
            System.out.println("Enter type: "); tempCustomer.setType(scanner.nextLine());

            display();
        }
    }

    @Override
    public void delete() {
    }

    @Override
    public Customer isExisted(String id) {
        for (Customer customer : customerList) {
            if (customer.getIdCard().equals(id)) {
                return customer;
            }
        }
        return null;
    }

}
