package case_study.models.person;

import java.security.PrivateKey;

public abstract class Person {
    private String idCard;
    private String name;
    private boolean sex;
    private String dateOfBirth;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(String idCard, String name, boolean sex, String dateOfBirth, String email, String phoneNumber) {
        this.idCard = idCard;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
                "idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
