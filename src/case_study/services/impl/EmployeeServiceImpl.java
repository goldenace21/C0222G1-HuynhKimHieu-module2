package case_study.services.impl;

import case_study.models.person.Employee;
import case_study.services.interfacee.EmployeeService;
import case_study.utils.FacilityRegex;
import case_study.utils.IOData;
import case_study.utils.RegexData;
import java.util.ArrayList;
import java.util.List;
import static case_study.controllers.FuramaController.scanner;
import static case_study.utils.IOData.*;

public class EmployeeServiceImpl implements EmployeeService {

    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("1","hieu",true,"20/11/2001","hieu@",
                                      "0932","manager","position",20.0));
        writeToCSV(employeeList,EMPLOYEE_PATH);
    }

    @Override
    public void display() {
        List<Employee> listEmployee = readFile();
        if (listEmployee.isEmpty()) System.err.println("Empty list!");
        else for (Employee employee : listEmployee) System.out.println(employee.toString());
    }

    public List<Employee> readFile() {
        List<Employee> list = new ArrayList<>();
        List<String[]> stringList = readFilePerson(EMPLOYEE_PATH);
        for (String[] strArr : stringList) {
            Employee employee = new Employee(strArr);
            list.add(employee);
        }
        return list;
    }

    @Override
    public void addNew() {
        double salary;
        String idCard, name, email, phoneNumber, level, position, dateOfBirth;
        boolean sex;

        while (true) {
            System.out.println("Enter idCard: "); idCard = scanner.nextLine();
            if (isExisted(idCard) != null) System.err.println("The employee already existed!");
            else break;
        }

        System.out.println("Enter name: "); name = scanner.nextLine();
        System.out.println("Enter date of birth: "); dateOfBirth =
        RegexData.regexAge(scanner.nextLine(),FacilityRegex.REGEX_DATEOFBIRTH);
        System.out.println("Enter sex: 1-male 2-female"); sex = (Integer.parseInt(scanner.nextLine())) == 1;
        System.out.println("Enter email: "); email = scanner.nextLine();
        System.out.println("Enter phone number: "); phoneNumber = scanner.nextLine();
        System.out.println("Enter level: "); level = scanner.nextLine();
        System.out.println("Enter position: "); position = scanner.nextLine();
        System.out.println("Enter salary: "); salary = Double.parseDouble(scanner.nextLine());

        employeeList.add(new Employee(idCard,name,sex,dateOfBirth,email,phoneNumber,level,position,salary));
        writeToCSV(employeeList,EMPLOYEE_PATH);
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
            System.out.println("Enter age: "); tempEmployee.setDateOfBirth
            (RegexData.regexAge(scanner.nextLine(),FacilityRegex.REGEX_DATEOFBIRTH));
            System.out.println("Enter sex: 1-male 2-female"); tempEmployee.setSex((Integer.parseInt(scanner.nextLine())) == 1);
            System.out.println("Enter email: "); tempEmployee.setEmail(scanner.nextLine());
            System.out.println("Enter phone number: "); tempEmployee.setPhoneNumber(scanner.nextLine());
            System.out.println("Enter level: "); tempEmployee.setLevel(scanner.nextLine());
            System.out.println("Enter position: "); tempEmployee.setPosition(scanner.nextLine());
            System.out.println("Enter salary: "); tempEmployee.setSalary(Double.parseDouble(scanner.nextLine()));
            writeToCSV(employeeList, EMPLOYEE_PATH);
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
