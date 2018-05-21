package automation.stepdefs;
import automation.driver.SeleniumDriver;
import automation.pages.BikeRepoPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class bikeRepo {

    @Given("^I have navigated to the Bike store page \"([^\"]*)\"$")
     public void iHaveNavigatedToTheBikeStorePage(String url) throws Throwable {
        // Navigates to Bike Repo
        TestScenario.landingPage = new BikeRepoPage(SeleniumDriver.getDriver());
        ((BikeRepoPage) TestScenario.landingPage).load(url);
        assertTrue("verify Bike Repo Page is Loaded: ", ((BikeRepoPage) TestScenario.landingPage).isLoaded());
    }

    @When("^I count the number of bikes$")
    public void iCountTheNumberOfBikes() throws Throwable {
        ((BikeRepoPage) TestScenario.landingPage).countNumberOfBikes();
    }

    @Then("^the total number of bikes on the page are verified$")
    public void theTotalNumberOfBikesOnThePageAreVerified() throws Throwable {
      assertTrue("Verify total number of bikes on the repo page",((BikeRepoPage) TestScenario.landingPage).verifyNumberOfBikes());
    }

    @When("^I check the informarion of bike \"([^\"]*)\"$")
    public void iCheckTheInformarionOfBike(String bikeNumber) throws Throwable {
        ((BikeRepoPage) TestScenario.landingPage).bikeInformation(bikeNumber);
    }

    @Then("^the bike name, bike description, bike class are displayed$")
    public void theBikeNameBikeDescriptionBikeClassAreDisplayed() throws Throwable {
        ((BikeRepoPage) TestScenario.landingPage).bikeInformationDisplayed();
    }

    @When("^I filter the bikes page by ''filter(\\d+)\"$")
    public void iFilterTheBikesPageByFilter(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the filtered bikes name, bikes description, bikes class are displayed$")
    public void theFilteredBikesNameBikesDescriptionBikesClassAreDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
