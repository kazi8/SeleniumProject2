import data.DataProviderClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void loginTest() {
        stratTest().login();
    }

    @Test(dataProvider = "data", dataProviderClass = DataProviderClass.class)
    public void testWrongCrendentials(String userName, String password){
        stratTest().validateWrongCredentialsCanNotLogin(userName, password);
    }
}
