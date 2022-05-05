package case_study.models.facility;

public class Villa extends Facility {
    private String roomStandard;
    private Double poolArea;
    private String floor;

    public Villa() {

    }

    public Villa(String id, String name, double areaUse, double price, String rentalPeople, String styleRental, String roomStandard, Double poolArea, String floor) {
        super(id, name, areaUse, price, rentalPeople, styleRental);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString() + ',' + roomStandard + ',' + poolArea + ',' + floor;
    }
}
