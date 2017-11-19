package entities;



public class ConcreteTour {
    private int id;
    private int tourId;
    private String date;
    private String dateEnd;
    private String airline;
    private String nutritionType;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTourId() {
        return tourId;
    }

    public ConcreteTour(int id, int tourId, String date, String dateEnd, String airline, String nutritionType, int price) {
        this.id = id;
        this.tourId = tourId;
        this.date = date;
        this.dateEnd = dateEnd;
        this.airline = airline;
        this.nutritionType = nutritionType;
        this.price = price;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getNutritionType() {
        return nutritionType;
    }

    public void setNutritionType(String nutritionType) {
        this.nutritionType = nutritionType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
}
