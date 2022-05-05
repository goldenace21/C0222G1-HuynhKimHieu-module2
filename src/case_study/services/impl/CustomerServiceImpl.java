package case_study.services.impl;

import case_study.models.person.Customer;
import case_study.services.interfacee.CustomerService;
import case_study.utils.FacilityRegex;
import case_study.utils.IOData;
import case_study.utils.RegexData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static case_study.controllers.FuramaController.scanner;
import static case_study.utils.IOData.*;

public class CustomerServiceImpl implements CustomerService {

    public static List<Customer> customerList = new LinkedList<>();

    static {
        customerList.add(new Customer("173", "hung", true, "12/23/2001",
                "hieu@1", "1234", "Platinium", false));

        customerList.add(new Customer("453", "hieu", true, "12/12/2001",
                "hieu@1", "8574", "Diamond", false));

        customerList.add(new Customer("756", "linh", false, "12/11/2001",
                "linh@1", "2344", "Vip", false));

        writeToCSV(customerList,CUSTOMER_PATH);
    }

    @Override
    public void display() {
        List<Customer> listCustomer = readFile();
        if (listCustomer.isEmpty()) System.err.println("Empty list!");
        else for (Customer customer : listCustomer) System.out.println(customer.toString());
    }

    public List<Customer> readFile() {
        List<Customer> list = new ArrayList<>();
        List<String[]> stringList = readFilePerson(CUSTOMER_PATH);
        for (String[] strArr : stringList) {
            Customer customer = new Customer(strArr);
            list.add(customer);
        }
        return list;
    }

    @Override
    public void addNew() {
        String idCard, name, email, phoneNumber, dateOfBirth, type;
        boolean sex, statusBooking;
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
        statusBooking = false;
        customerList.add(new Customer(idCard, name, sex, dateOfBirth, email, phoneNumber, type, statusBooking));
        writeToCSV(customerList,CUSTOMER_PATH);
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
            writeToCSV(customerList,IOData.CUSTOMER_PATH);
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
