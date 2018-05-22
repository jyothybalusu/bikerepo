package automation.pages;

import automation.stepdefs.TestScenario;
import automation.driver.Page;
import automation.driver.SeleniumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class BikeRepoPage extends Page {

    public BikeRepoPage(RemoteWebDriver driver) {
        super(driver);
    }


    //Loads the Bike repo page
    public boolean load(String url) throws Throwable {
        try {
            navigateTo(url);
            return true;
        } catch (Throwable e) {
            throw new Exception("Unable to load DVLA Page: " + e.getMessage());
        }
    }

    //Checks that the bike repo page is loaded
    public boolean isLoaded() throws Throwable {
        try {
            By bikes = By.xpath("//div[@class='col-md-10 prodList']/div");
            if (driver.findElement(bikes).isDisplayed())
                return true;
            else
                return false;
        } catch (Throwable e) {
            throw new Exception("Bike repo page not loaded: " + e.getMessage());
        }
    }

    //Count nuber of bikes displayed on the page
    public void countNumberOfBikes() throws Throwable {
        try {
            List<WebElement> listImages = driver.findElements(By.xpath("//div[@class='col-md-10 prodList']/div"));
            System.out.println("Total number of bikes on the page are: " + listImages.size());
        } catch (Throwable throwable) {
            throw new Exception("Unable to count the number of bikes");
        }
    }

    //Verifies the number of bikes displayed on the page is same as total number of bikes on the page
    public boolean verifyNumberOfBikes() throws Throwable {
        try {
            List<WebElement> listImages = driver.findElements(By.xpath("//div[@class='col-md-10 prodList']/div"));
            assertEquals(7, listImages.size());
            return true;

        } catch (Throwable throwable) {
            throw new Exception("Unable to verify the number of bikes on the bike repo page");
        }
    }


    //Clicks on the specified Bike
    public void clickBikeInformation(String bikeNumber) throws Throwable {

        try {

            int bikeNo;
            bikeNo = Integer.parseInt(bikeNumber);
            WebElement bikeName = driver.findElementByXPath("//div[@class='col-sm-4 ng-scope'][" + bikeNo + "]//div[@class='panel-heading ng-binding']");
            bikeName.click();
        } catch (Throwable throwable) {
            throw new Exception("Unable to click on the specified bike on the bike repo page");
        }
    }

//Refreshes the page
    public void refreshPage() throws Throwable{
        try{
            driver.navigate().refresh();
    }
        catch (Throwable throwable) {
            throw new Exception("Unable to refresh page");
        }
    }
    //Displays the bike name of the selected one
    public boolean bikeNameDisplayed(String bikeNumber) throws Throwable {
        try {

            int bikeNo;
            bikeNo = Integer.parseInt(bikeNumber);
            WebElement bikeName = driver.findElementByXPath("//div[@class='col-sm-4 ng-scope'][" + bikeNo + "]//div[@class='panel-heading ng-binding']");

            switch (bikeNumber) {
                case ("1"): {
                    assertEquals("Verfiy " + bikeNumber + "Name displayed is right", bikeName.getText(), "Litening C:68");
                    break;
                }
                case ("2"): {
                    assertEquals("Verfiy " + bikeNumber + "Name displayed is right", bikeName.getText(), "Litening C:62");
                    break;
                }
                case ("3"): {
                    assertEquals("Verfiy " + bikeNumber + "Name displayed is right", bikeName.getText(), "Agree C:62");
                    break;
                }
                case ("4"): {
                    assertEquals("Verfiy " + bikeNumber + "Name displayed is right", bikeName.getText(), "Attain GTC");
                    break;
                }
                case ("5"): {
                    assertEquals("Verfiy " + bikeNumber + "Name displayed is right", bikeName.getText(), "Attain HPA");
                    break;
                }
                case ("6"): {
                    assertEquals("Verfiy " + bikeNumber + "Name displayed is right", bikeName.getText(), "Cross Race");
                    break;
                }
                case ("7"): {
                    assertEquals("Verfiy " + bikeNumber + "Name displayed is right", bikeName.getText(), "SL Road");
                    break;
                }
                default: {
                    //incorrect pagetype specified
                    Assert.fail("Invalid Bike Number");
                    break;
                }
            }
            return true;
        } catch (Throwable throwable) {
            throw new Exception("Unable to verify the bike name displayed");
        }
    }

    //Displays the bike description of the selected one
    public boolean bikeDescriptionDisplayed(String bikeNumber) throws Throwable {
        try {
            int bikeNo;
            bikeNo = Integer.parseInt(bikeNumber);
            WebElement bikeDescription = driver.findElementByXPath("//div[@class='col-sm-4 ng-scope'][" + bikeNo + "]//div[@class='panel-body desc ng-binding']");

            switch (bikeNumber) {
                case ("1"): {
                    assertEquals("Verfiy " + bikeNumber + "description displayed is right", bikeDescription.getText(), "The bike for the professionals - thanks to our high-end C:68 Carbon frame and race optimized geometry.");
                    break;
                }
                case ("2"): {
                    assertEquals("Verfiy " + bikeNumber + "description displayed is right", bikeDescription.getText(), "A lightweight, dream bike for ambitious cyclists with a high-quality C:62 carbon frame.");
                    break;
                }
                case ("3"): {
                    assertEquals("Verfiy " + bikeNumber + "description displayed is right", bikeDescription.getText(), "With this bike, there are no compromises: C:62 Carbon frame, disc brakes and maximum aerodynamics it's ready for racing.");
                    break;
                }
                case ("4"): {
                    assertEquals("Verfiy " + bikeNumber + "description displayed is right", bikeDescription.getText(), "Comformatable on tours, lightweight carbon fiber frame and with the option of discs make a great all rounder.");
                    break;
                }
                case ("5"): {
                    assertEquals("Verfiy " + bikeNumber + "description displayed is right", bikeDescription.getText(), "A high-quality aluminum frame for long tours with high comfort levels, ergonomically balanced and complete with a disc option.");
                    break;
                }
                case ("6"): {
                    assertEquals("Verfiy " + bikeNumber + "description displayed is right", bikeDescription.getText(), "Reliable through mud, wind and the harshest conditions even when racing.");
                    break;
                }
                case ("7"): {
                    assertEquals("Verfiy " + bikeNumber + "description displayed is right", bikeDescription.getText(), "With the SL road, it's quick and comfortable to work and you can even do a relaxing after work ride.");
                    break;
                }
                default: {
                    //incorrect pagetype specified
                    Assert.fail("Invalid Bike Number");
                    break;
                }
            }
            return true;
        } catch (Throwable throwable) {
            throw new Exception("Unable to verify the bike description displayed");
        }
    }

    //displays the bikes based on the filtered classes

    public boolean bikeClassDisplayed(String bikeNumber) throws Throwable {
        try {
            int bikeNo;
            String bikeClassName = "";
            bikeNo = Integer.parseInt(bikeNumber);
            List<WebElement> bikeClass = driver.findElements(By.xpath("//div[@class='col-sm-4 ng-scope'][" + bikeNo + "]//span[@ng-repeat='c in p.class']"));
            for (WebElement bClass : bikeClass)
                bikeClassName = bikeClassName + " " + bClass.getText();
            System.out.println(bikeClassName);

            switch (bikeNumber) {
                case ("1"): {
                    assertEquals("Verfiy " + bikeNumber + "class displayed is right", bikeClassName, " Endurance, Race");
                    break;
                }
                case ("2"): {
                    assertEquals("Verfiy " + bikeNumber + "class displayed is right", bikeClassName, " Endurance, Race");
                    break;
                }
                case ("3"): {
                    assertEquals("Verfiy " + bikeNumber + "class displayed is right", bikeClassName, " Comfort, Endurance, Race");
                    break;
                }
                case ("4"): {
                    assertEquals("Verfiy " + bikeNumber + "class displayed is right", bikeClassName, " Comfort, Endurance");
                    break;
                }
                case ("5"): {
                    assertEquals("Verfiy " + bikeNumber + "class displayed is right", bikeClassName, " Comfort, Endurance");
                    break;
                }
                case ("6"): {
                    assertEquals("Verfiy " + bikeNumber + "class displayed is right", bikeClassName, " Endurance, Race");
                    break;
                }
                case ("7"): {
                    assertEquals("Verfiy " + bikeNumber + "class displayed is right", bikeClassName, " Comfort");
                    break;
                }
                default: {
                    //incorrect pagetype specified
                    Assert.fail("Invalid Bike Number");
                    break;
                }
            }
            return true;
        } catch (Throwable throwable) {
            throw new Exception("Unable to verify the bike information displayed");
        }
    }


    //Check that the specified bike image is displayed
    public boolean bikeImageDisplayed(String bikeNumber) throws Throwable {
        try {
            WebElement bikeOneImage = driver.findElementByXPath("//img[@ng-src='https://jujhar.com/images/bikes/780300_overview.png']");
            WebElement bikeTwoImage = driver.findElementByXPath("//img[@src='https://jujhar.com/images/bikes/778400_overview.png']");
            WebElement bikeThreeImage = driver.findElementByXPath("//img[@ng-src='https://jujhar.com/images/bikes/778500_overview.png']");
            WebElement bikeFourImage = driver.findElementByXPath("//img[@ng-src='https://jujhar.com/images/bikes/777100_overview.png']");
            WebElement bikeFiveImage = driver.findElementByXPath("//img[@ng-src='https://jujhar.com/images/bikes/776402_overview.png']");
            WebElement bikeSixImage = driver.findElementByXPath("//img[@ng-src='https://jujhar.com/images/bikes/788100_overview.png']");
            WebElement bikeSevenImage = driver.findElementByXPath("//img[@ng-src='https://jujhar.com/images/bikes/776400_overview.png']");


            switch (bikeNumber) {
                case ("1"): {
                    getElement(bikeOneImage, 10).click();
                    assertEquals("Verfiy " + bikeNumber + "image displayed is right", bikeOneImage.getAttribute("ng-src"), "https://jujhar.com/images/bikes/780300_overview.png");
                    break;
                }
                case ("2"): {
                    getElement(bikeTwoImage, 10).click();
                    assertEquals("Verfiy " + bikeNumber + "image displayed is right", bikeTwoImage.getAttribute("ng-src"), "https://jujhar.com/images/bikes/778400_overview.png");
                    break;
                }
                case ("3"): {
                    getElement(bikeThreeImage, 10).click();
                    assertEquals("Verfiy " + bikeNumber + "image displayed is right", bikeThreeImage.getAttribute("ng-src"), "https://jujhar.com/images/bikes/778500_overview.png");
                }
                case ("4"): {
                    getElement(bikeFourImage, 10).click();
                    assertEquals("Verfiy " + bikeNumber + "image displayed is right", bikeFourImage.getAttribute("ng-src"), "https://jujhar.com/images/bikes/777100_overview.png");
                    break;
                }
                case ("5"): {
                    getElement(bikeFiveImage, 5).click();
                    assertEquals("Verfiy " + bikeNumber + "image displayed is right", bikeFiveImage.getAttribute("ng-src"), "https://jujhar.com/images/bikes/776402_overview.png");
                    break;
                }
                case ("6"): {
                    getElement(bikeSixImage, 5).click();
                    assertEquals("Verfiy " + bikeNumber + "image displayed is right", bikeSixImage.getAttribute("ng-src"), "https://jujhar.com/images/bikes/788100_overview.png");
                }
                case ("7"): {
                    getElement(bikeSevenImage, 5).click();
                    assertEquals("Verfiy " + bikeNumber + "image displayed is right", bikeSevenImage.getAttribute("ng-src"), "https://jujhar.com/images/bikes/776400_overview.png");
                    break;
                }
                default: {
                    //incorrect pagetype specified
                    Assert.fail("Invalid Bike Number");
                    break;
                }
            }
            return true;
        } catch (Throwable throwable) {
            throw new Exception("Unable to verify the bike information displayed");
        }
    }

    //Filters bikes based on the bike filter class
    public void filterBikes(String filter) throws Throwable {
        try {
            WebElement enduranceCheckbox = driver.findElementByXPath("//span[text()='endurance']/preceding-sibling::input");
            WebElement raceCheckbox = driver.findElementByXPath("//span[text()='race']/preceding-sibling::input");
            WebElement comfortCheckbox = driver.findElementByXPath("//span[text()='comfort']/preceding-sibling::input");

            switch (filter) {
                case ("endurance"): {
                    enduranceCheckbox.click();
                    driver.navigate().refresh();
                    break;
                }
                case ("race"): {
                    raceCheckbox.click();
                    driver.navigate().refresh();
                    break;
                }
                case ("comfort"): {
                    comfortCheckbox.click();
                    driver.navigate().refresh();
                    break;
                }
            }
        } catch (Throwable throwable) {
            throw new Exception("Unable to verify the bike information displayed");
        }
    }

    //Checks that the right number of bikes are dispayed once thge filter is applied
        public boolean filteredBikesDisplayed(String filter1,String filter2,String filter3) throws Throwable{
            try{
                List<WebElement> listImages = driver.findElements(By.xpath("//div[@class='col-md-10 prodList']/div"));

                if(filter1.equals("endurance")&&filter2.equals("")&&filter3.equals(""))
                    assertEquals(6, listImages.size());

                if(filter1.equals("")&&filter2.equals("race")&&filter3.equals(""))
                       assertEquals(4, listImages.size());

                if(filter1.equals("")&&filter2.equals("")&&filter3.equals("comfort"))
                        assertEquals(4, listImages.size());
                if(filter1.equals("endurance")&&filter2.equals("race")&&filter3.equals(""))
                    assertEquals(4, listImages.size());
                if(filter1.equals("endurance")&&filter2.equals("")&&filter3.equals("comfort"))
                    assertEquals(3, listImages.size());
                if(filter1.equals("")&&filter2.equals("race")&&filter3.equals("comfort"))
                    assertEquals(1, listImages.size());
                if(filter1.equals("endurance")&&filter2.equals("race")&&filter3.equals("comfort"))
                    assertEquals(1, listImages.size());
                return true;
            }
        catch (Throwable throwable) {
            throw new Exception("Unable to verify that the filtered bikes are displayed");
        }
    }
}
