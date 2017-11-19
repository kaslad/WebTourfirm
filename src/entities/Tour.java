package entities;

public class Tour {
    private int id;
    private String name;
    private int hotelId;
    private boolean specialMark;
    private String description;

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    private String toCity;
    private String fromCity;

    public Tour(int id, String name, int hotelId, boolean specialMark, String description, String fromCity, String toCity ) {
        this.id = id;
        this.name = name;
        this.hotelId = hotelId;
        this.specialMark = specialMark;
        this.description = description;
        this.toCity = toCity;
        this.fromCity = fromCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public boolean isSpecialMark() {
        return specialMark;
    }

    public void setSpecialMark(boolean specialMark) {
        this.specialMark = specialMark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
