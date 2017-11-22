package entities;

public class User {
    private String login;
    private int id;
    private String password;
    private String cookie;

    private String name;
    private String lastName;
    private String fatherName;
    private String imgUrl;
    private String sex;
    private String passportSeries;
    private String passportNumber;
    private String passportWhoGave;
    private String phoneNumber;
    private String email;

    public User(String login, int id, String password, String cookie, String name, String lastName, String fatherName, String imgUrl, String sex, String passportSeries, String passportNumber, String passportWhoGave, String phoneNumber, String email) {
        this.login = login;
        this.id = id;
        this.password = password;
        this.cookie = cookie;
        this.name = name;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.imgUrl = imgUrl;
        this.sex = sex;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.passportWhoGave = passportWhoGave;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User(String login, int id, String password, String cookie, String name, String lastName, String fatherName, String imgUrl, String sex, String passport_series, String passportNumber, String passport_who_gave) {
        this.login = login;
        this.id = id;
        this.password = password;
        this.cookie = cookie;
        this.name = name;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.imgUrl = imgUrl;
        this.sex = sex;
        this.passportSeries = passport_series;
        this.passportNumber = passportNumber;
        this.passportWhoGave = passport_who_gave;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", cookie='" + cookie + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", sex='" + sex + '\'' +
                ", passportSeries='" + passportSeries + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", passportWhoGave='" + passportWhoGave + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportWhoGave() {
        return passportWhoGave;
    }

    public void setPassportWhoGave(String passportWhoGave) {
        this.passportWhoGave = passportWhoGave;
    }






    //id
    //password
    public User( String login, String password) {

        this.login = login;
        this.password = password;
    }
}
