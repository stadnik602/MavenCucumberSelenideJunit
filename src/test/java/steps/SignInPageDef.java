package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();

    @When("Input user email")
    public void inputUserEmail() {
        signInPage.inputField(signInPage.getEmailField(), UserConfig.USER_EMAIL);

    }

    @When("Input user password")
    public void inputUserPassword() {
        signInPage.inputField(signInPage.getPasswordField(), UserConfig.USER_PASSWORD);
    }


    @When("Click {string} button")
    public void clickButton(String arg0) {
        signInPage.clickButtonByText(arg0);
    }

    @Then("Validation error below Email field should be displayed")
    public void checkEmailErrorMessage() {
        signInPage.isEmailErrorMessageDisplayed();
    }
    @Then("Validation error below Password field should be displayed")
    public void checkPasswordErrorMessage() {
        signInPage.isPasswordErrorMessageDisplayed();
    }
}
