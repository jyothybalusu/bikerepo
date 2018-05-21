package automation.pages;

import automation.stepdefs.TestScenario;
import automation.driver.Page;
import automation.driver.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class BikeRepoPage extends Page {

    /**
     * Declaration of all the Webelements used on this page
     */

    @FindBy(xpath = "//div[@class='col-md-10 prodList']/div")
    WebElement bikeCounter;

    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]")
    WebElement bikeOne;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//div[@class='panel-heading ng-binding']")
    WebElement bikeOneName;
    @FindBy(xpath = "//img[@src='https://jujhar.com/images/bikes/780300_overview.png']")
    WebElement bikeOneImg;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//div[@class='panel-body desc ng-binding']")
    WebElement bikeOneDesc;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//span[@ng-repeat='c in p.class']")
    List<WebElement> bikeOneClass;

    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][2]")
    WebElement bikeTwo;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//div[@class='panel-heading ng-binding']")
    WebElement bikeTwoName;
    @FindBy(xpath = "//img[@src='https://jujhar.com/images/bikes/778400_overview.png']")
    WebElement bikeTwoImg;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//div[@class='panel-body desc ng-binding']")
    WebElement bikeTwoDesc;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//span[@ng-repeat='c in p.class']")
    List<WebElement> bikeTwoClass;

    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][3]")
    WebElement bikeThree;
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


    @FindBy(xpath = "//input[@type='checkbox'] /following-sibling::span[text()='endurance']")
    WebElement enduranceCheckbox;

    @FindBy(xpath = "//input[@type='checkbox'] /following-sibling::span[text()='race']")
    WebElement raceCheckbox;

    @FindBy(xpath = "//input[@type='checkbox'] /following-sibling::span[text()='comfort']")
    WebElement comfortCheckbox;

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
            By bikes = By.xpath("//div[@class='col-md-10 prodList']/div");
           if(driver.findElement(bikes).isDisplayed())
            return true;
           else
               return false;
        } catch (Throwable e) {
            throw new Exception("Bike repo page not loaded: " + e.getMessage());
        }
    }

    public boolean navigateTOBikeRepo(String url) {
        TestScenario.landingPage = new BikeRepoPage(SeleniumDriver.getDriver());
        driver.get(url);
        return true;
    }

    public void countNumberOfBikes() throws Throwable {
        try {
            List<WebElement> listImages = driver.findElements(By.xpath("//div[@class='col-md-10 prodList']/div"));
            System.out.println("Total number of bikes on the page are: " + listImages.size());
        } catch (Throwable throwable) {
            throw new Exception("Unable to count the number of bikes");
        }
    }

    public boolean verifyNumberOfBikes() throws Throwable {
        try {
            List<WebElement> listImages = driver.findElements(By.xpath("//div[@class='col-md-10 prodList']/div"));
            assertEquals(7,listImages.size());
            return true;

        } catch (Throwable throwable) {
            throw new Exception("Unable to verify the number of bikes on the bike repo page");
        }
    }



    public void bikeInformation(String bikeNumber) throws Throwable {
        try{
//bikeOne, BikeOneName, BikeOneImg, BikeOneClass, BikeOneDesc
            int bikeNo;
            bikeNo = Integer.parseInt(bikeNumber);

                WebElement bikeName = driver.findElementByXPath("//div[@class='col-sm-4 ng-scope']["+bikeNo+"]//div[@class='panel-heading ng-binding']");
                 bikeName.getText();
                  System.out.println("Bike Name is : " + bikeName.getText());

        }catch (Throwable throwable) {
            throw new Exception("Unable to verify the number of bikes on the bike repo page");
        }
    }
    public void bikeInformationDisplayed() throws Throwable {
        try {

        } catch (Throwable throwable) {
            throw new Exception("Unable to verify the bike information displated");
        }
    }
}
