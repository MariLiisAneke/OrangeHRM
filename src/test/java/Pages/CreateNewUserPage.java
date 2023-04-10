package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUserPage {

    public int random;

    //Declare your locators
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME, using = "email_create")
    public static WebElement CreateNewUserEmailField;

    @FindBy(how = How.ID_OR_NAME, using = "SubmitCreate")
    public static WebElement CreateAnAccountButton;

    @FindBy(how = How.ID_OR_NAME, using = "id_gender2")
    public static WebElement FemaleGenderButton;

    @FindBy(how = How.ID_OR_NAME, using = "customer_firstname")
    public static WebElement CustomerFirstName;

    @FindBy(how = How.ID_OR_NAME, using = "customer_lastname")
    public static WebElement CustomerLastName;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    public static WebElement Password;

    @FindBy(how = How.ID_OR_NAME, using = "days")
    public static WebElement DOBDays;

    @FindBy(how = How.ID_OR_NAME, using = "months")
    public static WebElement DOBMonths;

    @FindBy(how = How.ID_OR_NAME, using = "years")
    public static WebElement DOBYears;

    @FindBy(how = How.ID_OR_NAME, using = "address1")
    public static WebElement Address;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    public static WebElement City;

    @FindBy(how = How.ID_OR_NAME, using = "id_state")
    public static WebElement State;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    public static WebElement PostCode;

    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    public static WebElement PhoneNumber;

    @FindBy(how = How.ID_OR_NAME, using = "alias")
    public static WebElement AddressAlias;

    @FindBy(how = How.ID_OR_NAME, using = "submitAccount")
    public static WebElement RegisterButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement LoggedInUser;


    //Declare Your Method
    public void ClickHomePageSignIn() {
        SignInLink.click();
    }

    public void EnterEmailToCreateNewUser() {
        random = 100 + (int)(Math.random()* (1000-1) +1);
        CreateNewUserEmailField.sendKeys("lanrejuly22" + random + "@gmail.com");
    }

    public void ClickCreateAccountButton() throws InterruptedException {
        CreateAnAccountButton.click();
        Thread.sleep(6000);
    }

    public void SelectGender() {
        FemaleGenderButton.click();
    }

    public void EnterUserFirstName() {
        CustomerFirstName.sendKeys("Mari-Liis");
    }

    public void EnterCustomerLastName() {
        CustomerLastName.sendKeys("Aneke");
    }

    public void EnterPassword() {
        Password.sendKeys("testing");
    }

    public void SelectDOBDay() {
        Select day = new Select(DOBDays);
        day.selectByIndex(10);
    }

    public void SelectDOBMonth() {
        Select month = new Select(DOBMonths);
        month.selectByValue("9");
    }

    public void SelectDOBYear() {
        Select year = new Select(DOBYears);
        year.selectByValue("1990");
    }

    public void EnterAddress() {
        Address.sendKeys("No 1 testing street");
    }

    public void EnterCity() {
        City.sendKeys("Chicago");
    }

    public void SelectState() {
        Select state = new Select(State);
        state.selectByVisibleText("Illinois");
    }

    public void EnterPostCode() {
        PostCode.sendKeys("00000");
    }

    public void EnterPhoneNumber() {
        PhoneNumber.sendKeys("0405177359");
    }

    public void EnterAddressAlias() {
        AddressAlias.sendKeys("QA House");
    }

    public void clickRegisterButton() {
        RegisterButton.click();
    }

    public void AssertLoggedInUser() {
        String ExpectedLoggedInUser = "Mari-Liis Aneke";
        String ActualLoggedInUser = LoggedInUser.getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);
    }

}
