package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class NewAddress {

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
    public static WebElement MyAddress;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[2]/a/span")
    public static WebElement AddANewAddress;

    @FindBy(how = How.ID_OR_NAME, using = "address1")
    public static WebElement Address;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    public static WebElement City;

    @FindBy(how = How.ID_OR_NAME, using = "id_state")
    public static WebElement State;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    public static WebElement PostalCode;

    @FindBy(how = How.ID_OR_NAME, using = "phone")
    public static WebElement HomePhone;

    @FindBy(how = How.XPATH, using = "//*[@id=\"submitAddress\"]/span")
    public static WebElement SaveButton;






    public void ClickMyAddressButton() {
        MyAddress.click();
    }

    public void ClickAddANewAddressButton() {
        AddANewAddress.click();
    }

    public void EnterAdress() {
        Address.sendKeys("Morgan Street 55");
    }

    public void EnterCity() {
        City.sendKeys("Huntsville");
    }

    public void SelectState() {
        Select state = new Select(State);
        state.selectByValue("1");
    }

    public void EnterPostalCode() {
        PostalCode.sendKeys("00000");
    }

    public void EnterPhoneNumber() {
        HomePhone.sendKeys("0405866759");
    }

    public void ClickSaveButton() {
        SaveButton.click();
    }
}
