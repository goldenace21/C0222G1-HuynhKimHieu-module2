package case_study.models.person;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee() {

    }

    public Employee(String idCard, String name, boolean sex, String dateOfBirth,
                    String email, String phoneNumber, String level, String position, double salary) {
        super(idCard, name, sex, dateOfBirth, email, phoneNumber);
        this.level = level;
        this.position = position;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
