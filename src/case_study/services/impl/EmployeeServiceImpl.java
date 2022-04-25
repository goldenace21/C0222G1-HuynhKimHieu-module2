package case_study.services.impl;

import case_study.models.person.Employee;
import case_study.services.Interface.EmployerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployerService {
    public static List<Employee> employeeList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    static {
       Employee employee = new Employee(1,
                                        "hieu",
                                        12,
                                        true,
                                        "hieu@gmail",
                                        "0932",
                                        "99",
                                        "manager",
                                        9999);
       employeeList.add(employee);
    }

    @Override
    public void display() {
        if (employeeList.isEmpty()) {
            System.err.println("Empty list!");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee.toString());
            }
        }
    }

    @Override
    public void addNew() {
        int idCard, age, salary;
        String name, email, phoneNumber, level, position;
        boolean sex;

        System.out.println("Enter idCard: "); idCard = Integer.parseInt(scanner.nextLine());
        if (isExisted(idCard) != null) {
            System.err.println("The employee already existed!");
            return;
        }

        System.out.println("Enter name: "); name = scanner.nextLine();
        System.out.println("Enter age: "); age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter sex: 1-male 2-female"); sex = (Integer.parseInt(scanner.nextLine())) == 1;
        System.out.println("Enter email: "); email = scanner.nextLine();
        System.out.println("Enter phone number: "); phoneNumber = scanner.nextLine();
        System.out.println("Enter level: "); level = scanner.nextLine();
        System.out.println("Enter position: "); position = scanner.nextLine();
        System.out.println("Enter salary: "); salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(idCard, name, age, sex, email, phoneNumber, level, position, salary);
        employeeList.add(employee);
        display();
    }

    @Override
    public void edit() {
        if (employeeList.isEmpty()) {
            System.err.println("Empty list!");
        } else {
            int idCard;
            Employee tempEmployee;

            System.out.print("Enter idCard: "); idCard = Integer.parseInt(scanner.nextLine());
            tempEmployee = isExisted(idCard);

            if (tempEmployee == null) {
                System.err.println("The employee isn't existed!");
                return;
            }

            System.out.println("Enter name: "); tempEmployee.setName(scanner.nextLine());
            System.out.println("Enter age: "); tempEmployee.setAge(Integer.parseInt(scanner.nextLine()));
            System.out.println("Enter sex: 1-male 2-female"); tempEmployee.setSex((Integer.parseInt(scanner.nextLine())) == 1);
            System.out.println("Enter email: "); tempEmployee.setEmail(scanner.nextLine());
            System.out.println("Enter phone number: "); tempEmployee.setPhoneNumber(scanner.nextLine());
            System.out.println("Enter level: "); tempEmployee.setLevel(scanner.nextLine());
            System.out.println("Enter position: "); tempEmployee.setPosition(scanner.nextLine());
            System.out.println("Enter salary: "); tempEmployee.setSalary(Integer.parseInt(scanner.nextLine()));

            display();
        }
    }

    @Override
    public void delete() {
        if (employeeList.isEmpty()) {
            System.err.println("Empty list!");
        } else {
            Employee tempEmployee;

            System.out.print("Enter idCard: ");
            tempEmployee = isExisted(Integer.parseInt(scanner.nextLine()));

            if (tempEmployee == null) {
                System.err.println("The employee isn't existed!");
                return;
            }

            employeeList.remove(tempEmployee);
            display();
        }
    }

    @Override
    public Employee isExisted(int id) {
        for (Employee employee : employeeList) {
            if (employee.getIdCard() == id) return employee;
        }
        return null;
    }
}
