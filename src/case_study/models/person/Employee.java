package case_study.models.person;

public class Employee extends Person {
    private String idEmployee;
    private String level;
    private String position;
    private int salary;

    public Employee() {

    }

    public Employee(String idCard, String name, int age, boolean sex, String email, String phoneNumber, String idEmployee, String level, String position, int salary) {
        super(idCard, name, age, sex, email, phoneNumber);
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
