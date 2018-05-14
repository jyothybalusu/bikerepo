import automation.pages.bikesPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static automation.driver.base.*;


public class test1 {
    bikesPage bikes;


    @BeforeClass
    public static void setup() throws Throwable {
        navigateToHome();

    }


    @Test
    public void testOne() throws Throwable {
        bikes = new bikesPage(driver);
        bikes.countNumberOfBikes();

    }

    @Test
    public void readBikes() throws Throwable{
        bikes = new bikesPage(driver);


    }


    @AfterClass
    public static void closeSetup()
    {
        close();
    }
}
