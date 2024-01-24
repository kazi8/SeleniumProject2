import browser.Browser;
import org.testng.annotations.Test;
import utilis.RegistrationInfo;

import java.time.Duration;

public class RegisterPageTest extends BaseTest {
    RegistrationInfo registrationInfo = new RegistrationInfo();

    @Test
    public void makeARegistrationTest() {
        stratTest().clickOnregistrationLink().registerAUser(registrationInfo);
    }
}
