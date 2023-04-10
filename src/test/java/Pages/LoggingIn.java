package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoggingIn {

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME, using = "email")
    public static WebElement EnterEmailAddress;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    public static WebElement EnterPassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\"SubmitLogin\"]")
    public static WebElement ClickSigninButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement UserConfirmation;


    public void PressHomepageSignin() {
        SignInLink.click();
    }

    public void EnterCorrectEmailAddress() {
        EnterEmailAddress.sendKeys("lanre_april@gmail.com");
    }

    public void EnterCorrectPassword() {
        EnterPassword.sendKeys("testing");
    }

    public void ClickToSignIn() {
        ClickSigninButton.click();
    }

    public void ConfirmLoggedInUser() {
        String ExpectedLoggedInUser = "Dorice Mbonde";
        String ActualLoggedInUser = UserConfirmation.getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
    }
}
