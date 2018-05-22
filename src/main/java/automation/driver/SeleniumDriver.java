package automation.driver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDriver {

    private static RemoteWebDriver driver;
    private static long TIMEOUT = 60;


        public static RemoteWebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver", "//Users/Jyothi/bikerepo/src/main/resources/chromedriver");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
           return driver;
    }

    public synchronized static void closeDriver() {
        driver.quit();
        driver = null;
    }
    public static long getTimeout() {
        return SeleniumDriver.TIMEOUT;
    }
}