package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    @FindBy(name = "username") private WebElement userName;
    @FindBy(name = "password") private WebElement password;
    @FindBy(css = "[value='Log In']") private WebElement loginButton;
    @FindBy(linkText = "Register") private WebElement registerLink;

    @FindBy(xpath = "//*[@id='rightPanel']/h1") private WebElement errorMessage;

    WebDriver driver = Browser.getDriver();

    public void login() {
        userName.sendKeys(Browser.getTestProperty("username"));
        password.sendKeys(Browser.getTestProperty("password"));
        loginButton.click();
    }

    public void validateWrongCredentialsCanNotLogin(String uName, String pword) {
        userName.sendKeys(uName);
        password.sendKeys(pword);
        loginButton.click();

        String message = errorMessage.getText();

        Assert.assertEquals(message, "Error!");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public RegisterPage clickOnregistrationLink() {
        registerLink.click();
        return PageFactory.initElements(driver, RegisterPage.class);
    }
}
