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

    @FindBy(xpath="//div[@class='col-sm-4 ng-scope'][1]")
    WebElement bike1;
    @FindBy(xpath="//div[@class='col-sm-4 ng-scope'][1]//div[@class='panel-heading ng-binding']")
    WebElement bikeOneName;
    @FindBy(xpath="//div[@class='col-sm-4 ng-scope'][1]//div[@class='panel-body desc ng-binding']")
    WebElement bikeOneDesc;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][1]//span[@ng-repeat='c in p.class']")
    WebElement bikeOneClass;
    @FindBy(xpath = "//div[@class='col-sm-4 ng-scope'][2]")
    WebElement bike2;
    @FindBy(xpath="//div[@class='col-sm-4 ng-scope'][3]")
    WebElement bike3;
    @FindBy(xpath="//div[@class='col-sm-4 ng-scope'][4]")
    WebElement bike4;
    @FindBy(xpath="//div[@class='col-sm-4 ng-scope'][5]")
    WebElement bike5;
    @FindBy(xpath="//div[@class='col-sm-4 ng-scope'][6]")
    WebElement bike6;
    @FindBy(xpath="//div[@class='col-sm-4 ng-scope'][7]")
    WebElement bike7;


    public bikesPage(WebDriver driver) {
        /**
         * Initialises all the Webelements defined on the top
         */
        PageFactory.initElements(driver, this);
    }
public void countNumberOfBikes() throws Throwable{
    try{
        int counter=0;
        List<WebElement> listImages=driver.findElements(By.xpath("//div[@class='col-md-10 prodList']/div"));
        System.out.println("No. of Images: "+listImages.size());
        for(WebElement image:listImages)
            if(image.isDisplayed())
                counter++;
        System.out.println("No. of total displable images: "+counter);
    }
    catch (Throwable throwable) {
        throw new Exception("Unable to Login to the application");
    }
}
}