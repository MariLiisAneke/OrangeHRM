package Step_definition;

import Base.TestBase;
import Pages.CreateNewUserPage;
import Pages.LoggingIn;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class common2 extends TestBase {


        @Before
        public void setup() throws IOException {
            initialize();
        }

    @Given("^I am on the application homepage$")
    public void iAmOnTheApplicationHomepage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @When("^I press on signin$")
    public void iPressOnSignin() {
        LoggingIn page =  PageFactory.initElements(driver, LoggingIn.class);
        page.PressHomepageSignin();
    }

    @And("^I enter correct email address$")
    public void iEnterCorrectEmailAddress() {
        LoggingIn page =  PageFactory.initElements(driver, LoggingIn.class);
        page.EnterCorrectEmailAddress();
    }

    @And("^i enter correct password$")
    public void iEnterCorrectPassword() {
        LoggingIn page =  PageFactory.initElements(driver, LoggingIn.class);
        page.EnterCorrectPassword();
    }

    @When("^I click the signin button$")
    public void iClickTheSigninButton() {
        LoggingIn page =  PageFactory.initElements(driver, LoggingIn.class);
        page.ClickToSignIn();
    }

    @Then("^I should be successfully logged in$")
    public void iShouldBeSuccessfullyLoggedIn() {
        LoggingIn page =  PageFactory.initElements(driver, LoggingIn.class);
        page.ConfirmLoggedInUser();
    }
}
