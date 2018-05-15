package automation.pages;

import automation.stepdefs.TestScenario;
import automation.driver.Page;
import automation.driver.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;


public class BikeRepoPage extends Page {



    public BikeRepoPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean load(String url) throws Throwable {
        try {
            navigateTo(url);
             return true;
        } catch (Throwable e) {
            throw new Exception("Unable to load DVLA Page: " + e.getMessage());
        }
    }

    public boolean isLoaded() throws Throwable {
        try {
            By startBtn = By.xpath("//*[@id='get-started']/a");
           if(driver.findElement(startBtn).isDisplayed())
            return true;
           else
               return false;
        } catch (Throwable e) {
            throw new Exception("Home Page not loaded: " + e.getMessage());
        }
    }

    public boolean navigateTOBikeRepo(String url) {
        TestScenario.landingPage = new BikeRepoPage(SeleniumDriver.getDriver());
        driver.get(url);
        return true;
    }

    public void countNumberOfBikes() throws Throwable {
        try {
            int counter = 0;
            List<WebElement> listImages = driver.findElements(By.xpath("//div[@class='col-md-10 prodList']/div"));
            System.out.println("No. of Images: " + listImages.size());
            for (WebElement image : listImages)
                if (image.isDisplayed())
                    counter++;
            System.out.println("No. of total displable images: " + counter);
        } catch (Throwable throwable) {
            throw new Exception("Unable to count the number of bikes");
        }
    }

}
