package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.RegistrationInfo;

public class RegisterPage {
    @FindBy(id = "customer.firstName") private WebElement customerFirstName;
    @FindBy(id = "customer.lastName") private WebElement customerLastName;

    @FindBy(id = "customer.address.street") private WebElement customerAddressStreet;
    @FindBy(id = "customer.address.city") private WebElement customerAddressCity;

    @FindBy(id = "customer.address.state") private WebElement customerAddressState;
    @FindBy(id = "customer.address.zipCode") private WebElement customerAddressZip;

    @FindBy(id = "customer.phoneNumber") private WebElement customerPhone;
    @FindBy(id = "customer.ssn") private WebElement customerSSN;

    @FindBy(id = "customer.username") private WebElement customerUserName;
    @FindBy(id = "customer.password") private WebElement customerPassword;

    @FindBy(id = "repeatedPassword") private WebElement customerConfirmPassword;
    @FindBy(css = "[value='Register']") private WebElement registerButton;

    public void registerAUser(RegistrationInfo registrationInfo) {
        customerFirstName.sendKeys(registrationInfo.getFirsrtName());
        customerLastName.sendKeys(registrationInfo.getLastName());
        customerAddressStreet.sendKeys(registrationInfo.getAddress());
        customerAddressCity.sendKeys(registrationInfo.getCity());
        customerAddressState.sendKeys(registrationInfo.getState());
        customerAddressZip.sendKeys(registrationInfo.getZipCode());
        customerPhone.sendKeys(registrationInfo.getPhoneNumber());
        customerSSN.sendKeys(registrationInfo.getSSN());
        customerUserName.sendKeys(registrationInfo.getUserName());
        customerPassword.sendKeys(registrationInfo.getPassword());
        customerConfirmPassword.sendKeys(registrationInfo.getPassword());
        registerButton.click();

    }

}
