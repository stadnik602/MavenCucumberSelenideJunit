package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage extends BasicPage {
    private final SelenideElement emailField = $(By.cssSelector("#email"));
    private final SelenideElement passwordField = $(By.cssSelector("#password"));
    private final SelenideElement IM_LEARNER_BUTTON = $(By.xpath("//*[text()=\"I'm a learner\"]"));

    private final SelenideElement firstName = $(By.cssSelector("#firstName"));

    private final SelenideElement lastName = $(By.cssSelector("#lastName"));

    private final SelenideElement emailErrorElement = $(By.xpath("//*[text()='Please input your Email Address. Max 100 characters']"));
    private final SelenideElement firstNameErrorElement = $(By.xpath("//*[text()='Please input your First Name, Max 40 characters']"));
    private final SelenideElement lastNameErrorElement = $(By.xpath("//*[text()='Please input your Last Name. Max 70 characters']"));
    private final SelenideElement passwordErrorElement = $(By.xpath("//*[text()='Password must contain 8-25 characters with at least one сapital letter, one lower case letter, at least one number and symbols.']"));

    private final String emailErrorMessage = "Please input your Email Address. Max 100 characters";
    private final String firstNameErrorMessage = "Please input your First Name, Max 40 characters";
    private final String lastNameErrorMessage = "Please input your Last Name. Max 70 characters";
    private final String passwordErrorMessage = "Password must contain 8-25 characters with at least one сapital letter, one lower case letter, at least one number and symbols.";

    public SelenideElement getImLearnerButton() {
        return IM_LEARNER_BUTTON;
    }

    public boolean isValidationMessageDisplayed(SelenideElement inputFieldElement) {
        return (inputFieldElement.isDisplayed());
    }
    public boolean isValidationMessagesDisplayedWithText(SelenideElement inputFieldElement, String errorMessage) {
         if (inputFieldElement.getText().equals(errorMessage)) {
             return true;
         }
         return false;
    }

    public SelenideElement getEmailField() {
        return emailField;
    }

    public SelenideElement getPasswordField() {
        return passwordField;
    }

    public SelenideElement getFirstName() {
        return firstName;
    }

    public SelenideElement getLastName() {
        return lastName;
    }

    public SelenideElement getEmailErrorElement() {
        return emailErrorElement;
    }

    public SelenideElement getFirstNameErrorElement() {
        return firstNameErrorElement;
    }

    public SelenideElement getLastNameErrorElement() {
        return lastNameErrorElement;
    }

    public SelenideElement getPasswordErrorElement() {
        return passwordErrorElement;
    }

    public String getEmailErrorMessage() {
        return emailErrorMessage;
    }

    public String getFirstNameErrorMessage() {
        return firstNameErrorMessage;
    }

    public String getLastNameErrorMessage() {
        return lastNameErrorMessage;
    }

    public String getPasswordErrorMessage() {
        return passwordErrorMessage;
    }
}
