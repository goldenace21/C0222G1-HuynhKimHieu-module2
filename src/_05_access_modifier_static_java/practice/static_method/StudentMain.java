package _05_access_modifier_static_java.practice.static_method;

public class StudentMain {
    public static class TestStaticMethod {
        public void main(String[] args) {
            Student.change(); //calling change method

            //creating objects
            Student s1 = new Student(111, "Hoang");
            Student s2 = new Student(222, "Khanh");
            Student s3 = new Student(333, "Nam");

            //calling display method
            s1.display();
            s2.display();
            s3.display();
        }
    }
}
