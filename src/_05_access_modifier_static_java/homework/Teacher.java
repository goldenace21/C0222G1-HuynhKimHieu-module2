package _05_access_modifier_static_java.homework;

public class Teacher extends Person {
    private int salary;
    public Teacher(){

    }
    public Teacher(String name,int age,boolean gender, int salary){
        super(name,age,gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString()+
                "salary=" + salary +
                '}';
    }
}
