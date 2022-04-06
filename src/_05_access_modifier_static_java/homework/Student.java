package _05_access_modifier_static_java.homework;
// 3. Các bạn làm thêm bài tập từ phần Demo của mình (Class Student(name, age, address, point)  ). @channel
// Viết chương trình có chức năng sau:
// Lưu trữ và hiển thị danh sách Student (Lưu bằng mảng).
// Thêm mới một Student -> Nhập thông tin từ bàn phím.
// Xóa 1 Student ra khỏi danh sách.
// Deadline nộp bài tới 21h hôm nay.

public class Student {
    private String name;
    private int age;
    private String address;
    private int point;

    Student(){
    }

    Student(String name, int age, String address, int point){
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}';
    }
}
