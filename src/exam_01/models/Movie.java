package exam_01.models;

public class Movie {
    private String id;
    private String name;
    private String showDate;
    private int quantity;

    public Movie() {
    }

    public Movie(String id, String name, String showDate, int quantity) {
        this.id = id;
        this.name = name;
        this.showDate = showDate;
        this.quantity = quantity;
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

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + showDate + "," + quantity;
    }
}
