package case_study.models.facility;

public abstract class Facility {
    private String id ;
    private String name ;
    private double areaUse ;
    private double price ;
    private String rentalPeople;
    private String styleRental;

    public Facility() {
    }

    public Facility(String id, String name, double areaUse, double price, String rentalPeopleMax, String styleRental) {
        this.id = id;
        this.name = name;
        this.areaUse = areaUse;
        this.price = price;
        this.rentalPeople = rentalPeopleMax;
        this.styleRental = styleRental;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRentalPeople() {
        return rentalPeople;
    }

    public void setRentalPeople(String rentalPeople) {
        this.rentalPeople = rentalPeople;
    }

    public String getStyleRental() {
        return styleRental;
    }

    public void setStyleRental(String styleRental) {
        this.styleRental = styleRental;
    }

    @Override
    public String toString() {
        return  id + ',' + name + ',' + areaUse + ',' + price + ',' + rentalPeople + ',' + styleRental;
    }
}
