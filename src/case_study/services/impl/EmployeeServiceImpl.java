package case_study.services.impl;

import case_study.models.person.Employee;
import case_study.services.Interface.EmployerService;
import case_study.utils.FacilityRegex;
import case_study.utils.RegexData;
import java.util.ArrayList;
import java.util.List;

import static case_study.controllers.FuramaController.scanner;

public class EmployeeServiceImpl implements EmployerService {
    public static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee( "123", "hieu", true,
                                        "12/23/2001", "hieu@1",
                                        "1234", "99", "manager",
                                        99.99));
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
        double salary;
        String idCard, name, email, phoneNumber, level, position, dateOfBirth;
        boolean sex;

        System.out.println("Enter idCard: "); idCard = scanner.nextLine();
        if (isExisted(idCard) != null) {
            System.err.println("The employee already existed!");
            return;
        }

        System.out.println("Enter name: "); name = scanner.nextLine();
        System.out.println("Enter date of birth: "); dateOfBirth =
        RegexData.regexAge(scanner.nextLine(),FacilityRegex.REGEX_DATEOFBIRTH);
        System.out.println("Enter sex: 1-male 2-female"); sex = (Integer.parseInt(scanner.nextLine())) == 1;
        System.out.println("Enter email: "); email = scanner.nextLine();
        System.out.println("Enter phone number: "); phoneNumber = scanner.nextLine();
        System.out.println("Enter level: "); level = scanner.nextLine();
        System.out.println("Enter position: "); position = scanner.nextLine();
        System.out.println("Enter salary: "); salary = scanner.nextDouble();

        employeeList.add(new Employee(idCard,name,sex,dateOfBirth,email,phoneNumber,level,position,salary));
        display();
    }

    @Override
    public void edit() {
        if (employeeList.isEmpty()) {
            System.err.println("Empty list!");
        } else {
            Employee tempEmployee;

            System.out.print("Enter idCard: ");
            tempEmployee = isExisted(scanner.nextLine());

            if (tempEmployee == null) {
                System.err.println("The employee isn't existed!");
                return;
            }

            System.out.println("Enter name: "); tempEmployee.setName(scanner.nextLine());
            System.out.println("Enter age: "); tempEmployee.setDateOfBirth(
            RegexData.regexAge(scanner.nextLine(),FacilityRegex.REGEX_DATEOFBIRTH));
            System.out.println("Enter sex: 1-male 2-female"); tempEmployee.setSex((Integer.parseInt(scanner.nextLine())) == 1);
            System.out.println("Enter email: "); tempEmployee.setEmail(scanner.nextLine());
            System.out.println("Enter phone number: "); tempEmployee.setPhoneNumber(scanner.nextLine());
            System.out.println("Enter level: "); tempEmployee.setLevel(scanner.nextLine());
            System.out.println("Enter position: "); tempEmployee.setPosition(scanner.nextLine());
            System.out.println("Enter salary: "); tempEmployee.setSalary(scanner.nextDouble());
            display();
        }
    }

    @Override
    public void delete() {
    }

    @Override
    public Employee isExisted(String id) {
        for (Employee employee : employeeList) {
            if (employee.getIdCard().equals(id)) {
                return employee;
            }
        }
        return null;
    }
}
