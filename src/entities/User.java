package entities;

public class User {
    private String login;
    private long id;
    private String password;
    private String cookie;

    private String name;
    private String lastName;
    private String fatherName;
    private String imgUrl;
    private String sex;
    private Integer passport_series;
    private Integer passport_number;
    private String passport_who_gave;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getPassport_series() {
        return passport_series;
    }

    public void setPassport_series(Integer passport_series) {
        this.passport_series = passport_series;
    }

    public Integer getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(Integer passport_number) {
        this.passport_number = passport_number;
    }

    public String getPassport_who_gave() {
        return passport_who_gave;
    }

    public void setPassport_who_gave(String passport_who_gave) {
        this.passport_who_gave = passport_who_gave;
    }






    //id
    //password
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
