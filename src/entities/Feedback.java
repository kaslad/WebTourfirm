package entities;

import java.util.Calendar;

public class Feedback {
    private String feedback;
    private int rate;
    private Calendar date;
    private int id;
    private int userId;
    private int hotelId;

    public Feedback(String feedback, int rate, long date, int id, int userId, int hotelId) {
        this.feedback = feedback;
        this.rate = rate;
        this.date = Calendar.getInstance();
        this.date.setTimeInMillis(date);
        this.id = id;
        this.userId = userId;
        this.hotelId = hotelId;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }
}