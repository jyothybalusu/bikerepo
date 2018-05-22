package automation.stepdefs;
import automation.driver.SeleniumDriver;
import automation.pages.BikeRepoPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
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
        // new BikeRepoPage(SeleniumDriver.getDriver());
        assertTrue("verify Bike Repo Page is Loaded: ", ((BikeRepoPage) TestScenario.landingPage).isLoaded());
    }

    @When("^I count the number of bikes$")
    public void iCountTheNumberOfBikes() throws Throwable {
        ((BikeRepoPage) TestScenario.landingPage).countNumberOfBikes();
    }

    @Then("^the total number of bikes on the page are verified$")
    public void theTotalNumberOfBikesOnThePageAreVerified() throws Throwable {
        assertTrue("Verify total number of bikes on the repo page", ((BikeRepoPage) TestScenario.landingPage).verifyNumberOfBikes());
        SeleniumDriver.closeDriver();
    }

    @When("^I click the information of \"([^\"]*)\"$")
    public void iClickTheInformationOf(String bikeNumber) throws Throwable {
        ((BikeRepoPage) TestScenario.landingPage).clickBikeInformation(bikeNumber);
    }


    @Then("^I check the bike name, bike description, bike class of \"([^\"]*)\" are displayed$")
    public void iCheckTheBikeNameBikeDescriptionBikeClassOfAreDisplayed(String bikeNumber) throws Throwable {
        assertTrue("Verify that bike name is displayed", (((BikeRepoPage) TestScenario.landingPage).bikeNameDisplayed(bikeNumber)));
        assertTrue("Verify that bike description is displayed", (((BikeRepoPage) TestScenario.landingPage).bikeDescriptionDisplayed(bikeNumber)));
        assertTrue("Verify that bike class is displayed", (((BikeRepoPage) TestScenario.landingPage).bikeClassDisplayed(bikeNumber)));
        //assertTrue("Verify that bike Image is displayed",(((BikeRepoPage) TestScenario.landingPage).bikeImageDisplayed(bikeNumber)));
        SeleniumDriver.closeDriver();
    }


    @When("^I filter the bikes page by \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iFilterTheBikesPageBy(String filter1, String filter2, String filter3) throws Throwable {
        ((BikeRepoPage) TestScenario.landingPage).filterBikes(filter1);
        ((BikeRepoPage) TestScenario.landingPage).filterBikes(filter2);
        ((BikeRepoPage) TestScenario.landingPage).filterBikes(filter3);
    }

    @Then("^I verify that the bikes are sorted based on bike class \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iVerifyThatTheBikesAreSortedBasedOnBikeClass(String filter1, String filter2, String filter3) throws Throwable {
        assertTrue("Verify that filtered bikes are displayed", (((BikeRepoPage) TestScenario.landingPage).filteredBikesDisplayed(filter1, filter2, filter3)));
        SeleniumDriver.closeDriver();
    }

    @And("^I refresh the page$")
    public void iRefreshThePage() throws Throwable {
        ((BikeRepoPage) TestScenario.landingPage).refreshPage();
    }
}
