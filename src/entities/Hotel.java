package entities;

public class Hotel {
    private int id;
    private String name;
    private int countStar;
    private String description;

    public Hotel(int id, String name, int countStar, String description) {
        this.id = id;
        this.name = name;
        this.countStar = countStar;
        this.description = description;
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

    public int getCountStar() {
        return countStar;
    }

    public void setCountStar(int countStar) {
        this.countStar = countStar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
