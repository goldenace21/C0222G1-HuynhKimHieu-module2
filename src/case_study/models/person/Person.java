package case_study.models.person;

import java.security.PrivateKey;

public abstract class Person {
    private String idCard;
    private String name;
    private int age;
    private boolean sex;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(String idCard, String name, int age, boolean sex, String email, String phoneNumber) {
        this.idCard = idCard;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean gender) {
        this.sex = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idCard=" + idCard +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + sex +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
