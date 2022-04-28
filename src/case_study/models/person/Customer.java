package case_study.models.person;

public class Customer extends Person {
    private String type;

    public Customer() {
    }

    public Customer(String idCard, String name, boolean sex, String dateOfBirth, String email, String phoneNumber, String type) {
        super(idCard, name, sex, dateOfBirth, email, phoneNumber);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
