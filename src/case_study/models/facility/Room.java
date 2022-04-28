package case_study.models.facility;

public class Room extends Facility {
    public String freeService;

    public Room() {
    }

    public Room(String id, String name, double areaUse, double price, String rentalPeople, String styleRental, String freeService) {
        super(id, name, areaUse, price, rentalPeople, styleRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
