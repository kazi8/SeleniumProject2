import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        Browser.startDriver();
        driver = Browser.getDriver();
        driver.navigate().to(Browser.getTestProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }

    public HomePage stratTest(){
        return PageFactory.initElements(driver, HomePage.class);
    }
}
