package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Browser {

    private static WebDriver driver;

    public static String getTestProperty(String propertyName){
        try (
            InputStream input = new FileInputStream("src/main/resources/info.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            return prop.getProperty(propertyName);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public static void startDriver() {
        if(getTestProperty("browser").equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (getTestProperty("browser").equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else
            driver = new EdgeDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
