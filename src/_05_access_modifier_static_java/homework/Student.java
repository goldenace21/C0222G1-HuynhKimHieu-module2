package _05_access_modifier_static_java.homework;
// 3. Các bạn làm thêm bài tập từ phần Demo của mình (Class Student(name, age, address, point)  ). @channel
// Viết chương trình có chức năng sau:
// Lưu trữ và hiển thị danh sách Student (Lưu bằng mảng).
// Thêm mới một Student -> Nhập thông tin từ bàn phím.
// Xóa 1 Student ra khỏi danh sách.
// Deadline nộp bài tới 21h hôm nay.

public class Student extends Person {
    private int point;

    Student(){
    }

    Student(String name, int age, boolean gender, int point){
        super(name,age,gender);
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + isGender() + '\'' +
                ", point=" + point +
                '}';
    }
}
