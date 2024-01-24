package utilis;

import com.github.javafaker.Faker;

public class RegistrationInfo {
    private String firsrtName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String SSN;

    private String userName = "pnt123";
    private String password = "pnt123";


    Faker faker = new Faker();

    public RegistrationInfo() {
        this.firsrtName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.address = faker.address().streetAddress();
        this.city = faker.address().city();
        this.state = faker.address().state();
        this.zipCode = faker.address().zipCode();
        this.phoneNumber = faker.phoneNumber().phoneNumber();
        this.SSN = faker.idNumber().ssnValid();
    }

    public String getFirsrtName() {
        return firsrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSSN() {
        return SSN;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Faker getFaker() {
        return faker;
    }
}
