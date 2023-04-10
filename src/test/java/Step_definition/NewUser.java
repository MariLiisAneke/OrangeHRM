package Step_definition;

import Pages.CreateNewUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;

public class NewUser {
    public WebDriver driver;
    public int random;

    @Given("^I get on the homescreen$")
    public void iGetOnTheHomescreen() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(new URL("http://automationpractice.com/index.php"));
    }

    @When("^I get on the Login screen$")
    public void iGetOnTheLoginScreen() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickHomePageSignIn();
        //driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^I enter email address for new account$")
    public void iEnterEmailAddressForNewAccount() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.EnterEmailToCreateNewUser();
    }

    @And("^I click the create account button$")
    public void iClickTheCreateAccountButton() throws InterruptedException {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickCreateAccountButton();
    }

    @When("^I enter all required details$")
    public void iEnterAllRequiredDetails() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.SelectGender();
        page.EnterUserFirstName();
        page.EnterCustomerLastName();
        page.EnterPassword();
        page.SelectDOBDay();
        page.SelectDOBMonth();
        page.SelectDOBYear();
        page.EnterAddress();
        page.EnterCity();
        page.SelectState();
        page.EnterPostCode();
        page.EnterPhoneNumber();
        page.EnterAddressAlias();
    }

    @And("^I click the register button$")
    public void iClickTheRegisterButton() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.clickRegisterButton();
    }

    @Then("^My account should be successfully created$")
    public void myAccountShouldBeSuccessfullyCreated() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.AssertLoggedInUser();

        driver.quit();
    }
}
