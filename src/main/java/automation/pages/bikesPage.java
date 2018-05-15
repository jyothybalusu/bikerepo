package automation.pages;

import automation.driver.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class bikesPage extends base {

    /**
     * Declaration of all the Webelements used on this page
     */

    @FindBy(xpath = "//div[@class='col-md-10 prodList']/div")
    WebElement bikeCounter;

    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]")
    WebElement bike1;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//div[@class='panel-heading ng-binding']")
    WebElement bikeOneName;
    @FindBy(xpath = "//img[@src='https://jujhar.com/images/bikes/780300_overview.png']")
    WebElement bikeOneImg;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//div[@class='panel-body desc ng-binding']")
    WebElement bikeOneDesc;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//span[@ng-repeat='c in p.class']")
    List<WebElement> bikeOneClass;

    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][2]")
    WebElement bike2;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//div[@class='panel-heading ng-binding']")
    WebElement bikeTwoName;
    @FindBy(xpath = "//img[@src='https://jujhar.com/images/bikes/778400_overview.png']")
    WebElement bikeTwoImg;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//div[@class='panel-body desc ng-binding']")
    WebElement bikeTwoDesc;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//span[@ng-repeat='c in p.class']")
    List<WebElement> bikeTwoClass;

    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][3]")
    WebElement bike3;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][3]//div[@class='panel-heading ng-binding']")
    WebElement bikeThreeName;
    @FindBy(xpath = "//img[@src='https://jujhar.com/images/bikes/778500_overview.png']")
    WebElement bikeThreeImg;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][3]//div[@class='panel-body desc ng-binding']")
    WebElement bikeThreeDesc;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][3]//span[@ng-repeat='c in p.class']")
    List<WebElement> bikeThreeClass;

    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][4]")
    WebElement bikeFour;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][4]//div[@class='panel-heading ng-binding']")
    WebElement bikeFourName;
    @FindBy(xpath = "//img[@src='https://jujhar.com/images/bikes/777100_overview.png']")
    WebElement bikeFourImg;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][4]//div[@class='panel-body desc ng-binding']")
    WebElement bikeFourDesc;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][4]//span[@ng-repeat='c in p.class']")
    List<WebElement> bikeFourClass;

    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]")
    WebElement bikeFive;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]//div[@class='panel-heading ng-binding']")
    WebElement bikeFiveName;
    @FindBy(xpath = "//img[@src='https://jujhar.com/images/bikes/776402_overview.png']")
    WebElement bikeFiveImg;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]//div[@class='panel-body desc ng-binding']")
    WebElement bikeFiveDesc;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]//span[@ng-repeat='c in p.class']")
    List<WebElement> bikeFiveClass;

    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]")
    WebElement bikeSix;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]//div[@class='panel-heading ng-binding']")
    WebElement bikeSixName;
    @FindBy(xpath = "//img[@src='https://jujhar.com/images/bikes/788100_overview.png']")
    WebElement bikeSixImg;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]//div[@class='panel-body desc ng-binding']")
    WebElement bikeSixDesc;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]//span[@ng-repeat='c in p.class']")
    List<WebElement> bikeSixClass;

    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]")
    WebElement bikeSeven;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]//div[@class='panel-heading ng-binding']")
    WebElement bikeSevenName;
    @FindBy(xpath = "//img[@src='https://jujhar.com/images/bikes/776400_overview.png']")
    WebElement bikeSevenImg;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]//div[@class='panel-body desc ng-binding']")
    WebElement bikeSevenDesc;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]//span[@ng-repeat='c in p.class']")
    List<WebElement> bikeSevenClass;

    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][4]")
    WebElement bike4;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][5]")
    WebElement bike5;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][6]")
    WebElement bike6;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][7]")
    WebElement bike7;

    @FindBy(xpath = "//input[@type='checkbox'] /following-sibling::span[text()='endurance']")
    WebElement enduranceCheckbox;

    @FindBy(xpath = "//input[@type='checkbox'] /following-sibling::span[text()='race']")
    WebElement raceCheckbox;

    @FindBy(xpath = "//input[@type='checkbox'] /following-sibling::span[text()='comfort']")
    WebElement comfortCheckbox;

    public bikesPage(WebDriver driver) {
        /**
         * Initialises all the Webelements defined on the top
         */
        PageFactory.initElements(driver, this);
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

    public void bikeInformation() throws Throwable {
        try{

        }
        catch (Throwable throwable) {
            throw new Exception("Unable to get the bike information");
        }
    }
}