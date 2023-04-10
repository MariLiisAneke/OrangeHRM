package Step_definition;

import Base.TestBase;
import Pages.NewAddress;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddress extends TestBase {

    @When("^I click on My addresses$")
    public void iClickOnMyAddresses() {
        NewAddress page = PageFactory.initElements(driver, NewAddress.class);
        page.ClickMyAddressButton();
    }

    @And("^I click Add a new address$")
    public void iClickAddANewAddress() {
        NewAddress page = PageFactory.initElements(driver, NewAddress.class);
        page.ClickAddANewAddressButton();
    }

    @And("^I fill all required fields$")
    public void iFillAllRequiredFields() {
        NewAddress page = PageFactory.initElements(driver, NewAddress.class);
        page.EnterAdress();
        page.EnterCity();
        page.SelectState();
        page.EnterPostalCode();
        page.EnterPhoneNumber();
    }

    @Then("^I click Save button and new address should be added$")
    public void iClickSaveButtonAndNewAddressShouldBeAdded() {
        NewAddress page = PageFactory.initElements(driver, NewAddress.class);
        page.ClickSaveButton();
    }
}
