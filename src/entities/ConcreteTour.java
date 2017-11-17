package entities;

import java.util.Calendar;

public class ConcreteTour {
    private int id;
    private int tourId;
    private Calendar date;
    private Calendar dateEnd;
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

    public ConcreteTour(int id, int tourId, long date, long dateEnd, String airline, String nutritionType, int price) {
        this.id = id;
        this.tourId = tourId;
        this.date.setTimeInMillis(date);
        this.date.setTimeInMillis(dateEnd);
        this.airline = airline;
        this.nutritionType = nutritionType;
        this.price = price;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
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

    public Calendar getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Calendar dateEnd) {
        this.dateEnd = dateEnd;
    }
}
