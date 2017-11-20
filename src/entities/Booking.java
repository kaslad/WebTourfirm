package entities;

public class Booking {
    private int id;
    private int concreteTourId;
    private int userId;
    private int count;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConcreteTourId() {
        return concreteTourId;
    }

    public void setConcreteTourId(int concreteTourId) {
        this.concreteTourId = concreteTourId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Booking(int id, int concreteTourId, int userId, int count) {
        this.id = id;
        this.concreteTourId = concreteTourId;
        this.userId = userId;
        this.count = count;
    }



}
