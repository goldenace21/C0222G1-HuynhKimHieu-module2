package case_study.models.person;

public class Customer extends Person {
    private String type;
    private boolean statusBooking = false;

    public Customer() {
    }

    public Customer(String idCard, String name, boolean sex, String dateOfBirth, String email, String phoneNumber, String type, boolean statusBooking) {
        super(idCard, name, sex, dateOfBirth, email, phoneNumber);
        this.type = type;
        this.statusBooking = statusBooking;
    }

    public Customer(String[] array){
        super(array[0], array[1],Boolean.parseBoolean(array[2]) , array[3], array[4], array[5]);
        this.type = array[6];
        this.statusBooking = Boolean.parseBoolean(array[7]);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatusBooking() {
        return statusBooking;
    }

    public void setStatusBooking(boolean statusBooking) {
        this.statusBooking = statusBooking;
    }

    @Override
    public String toString() {
        return super.toString() + ',' + type + ',' + statusBooking;
    }
}
