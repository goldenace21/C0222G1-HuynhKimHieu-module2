package case_study.models.facility;

public class House extends Facility {
    private String roomStandard;
    private String floor;

    public House() {

    }

    public House(String id, String name, double areaUse, double price, String rentalPeople, String styleRental, String roomStandard, String floor) {
        super(id, name, areaUse, price, rentalPeople, styleRental);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}
