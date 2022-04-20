package case_study.services.impl;

import _12_collection_framework.exercise.array_list.Product;
import case_study.models.person.Employee;
import case_study.services.Interface.EmployerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployerService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Employee create() {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter sex: 1-male 2-female");
        int check = Integer.parseInt(scanner.nextLine());
        boolean sex = check == 1;
        System.out.println("Enter idCard: ");
        String idCard = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter lever: ");
        String level = scanner.nextLine();
        System.out.println("Enter position: ");
        String position = scanner.nextLine();
        System.out.println("Enter salary: ");
        int salary = Integer.parseInt(scanner.nextLine());
        return new Employee(id,age,name,sex,idCard,email,phoneNumber,level,position,salary);
    }

    @Override
    public void display() {
        for(Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
       Employee employee = create();
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.err.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Employee employee = create();
        employeeList.add(employee);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                for (int j = 0;j< employeeList.size();j++) {
                    if (j == employeeList.size() - 1 && employeeList.get(j).getId() != employee.getId()
                            || employeeList.get(i).getId() == employee.getId()) {
                        employeeList.set(i, employee);
                        employeeList.add(employee);
                        break;
                    } else if (employeeList.get(j).getId() == employee.getId()) {
                        System.out.println("id already exists!");
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void delete() {
        System.err.println("Enter id: ");
        int id = scanner.nextInt();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.remove(i);
                display();
                break;
            }
        }
    }
}
