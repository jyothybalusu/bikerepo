package automation.driver;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Page {

    protected RemoteWebDriver driver;
    protected WebDriverWait wait;

    public Page(RemoteWebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, SeleniumDriver.getTimeout());
    }
    public Page navigateTo(String url) throws Throwable {
        try {

            driver.get(url);
             return new Page(driver);
        } catch (Exception e) {
            throw e;
        }
    }
    protected ElementImpl getElement(WebElement element, int seconds) throws Throwable {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            return new ElementImpl(wait.until(ExpectedConditions.visibilityOf(element)));
        } catch (Exception e) {
            throw e;
        }
    }

    public List<WebElement> getElements(By by) {
        try {
            return driver.findElements(by);
        } catch (Throwable e) {
            throw e;
        }
    }


}
