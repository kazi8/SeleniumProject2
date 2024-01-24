package data;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "data")
    public static Object[][] createData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "pnt123";
        data[0][1] = "pt123";

        data[1][0] = "pn123";
        data[1][1] = "pnt123";

        data[2][0] = "pt123";
        data[2][1] = "pt23";

        return data;

    }
}
