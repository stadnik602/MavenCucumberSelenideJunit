package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage extends BasicPage {
    private final SelenideElement emailField = $(By.cssSelector("#email"));
    private final SelenideElement passwordField = $(By.cssSelector("#password"));
    private final SelenideElement logInButton = $(By.xpath("//*[text()='Log In']"));

    private final SelenideElement emailErrorElement = $(By.xpath("//*[text()='Please input your Email Address']"));

    private final SelenideElement passwordErrorElement = $(By.xpath("//*[text()='Please input your Password']"));

    private final String emailMessage = "Please input your Email Address";
    private final String passwordMessage = "Please input your Password";


    public SelenideElement getEmailField() {
        return emailField;
    }

    public SelenideElement getPasswordField() {
        return passwordField;
    }

    public String getEmailErrorMessage() {
       return emailErrorElement.getText();
    }
    public String getPasswordErrorMessage() {
       return passwordErrorElement.getText();
    }

    public boolean isEmailErrorMessageDisplayed() {
        return emailErrorElement.isDisplayed();
    }
    public boolean isPasswordErrorMessageDisplayed() {
        return passwordErrorElement.isDisplayed();
    }
}
