package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();

    @Then("Input user email")
    public void inputUserEmail() {
        signInPage.inputField(signInPage.getEmailField(), UserConfig.USER_EMAIL);

    }

    @Then("Input user password")
    public void inputUserPassword() {
        signInPage.inputField(signInPage.getPasswordField(), UserConfig.USER_PASSWORD);
    }


    @Then("Click {string} button")
    public void clickButton(String arg0) {
        signInPage.clickButtonByText(arg0);
    }
}
