package steps;

import config.UserConfig;
import impl.AuthServiceImpl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.api.User;
import org.junit.jupiter.api.Assertions;
import pages.SignInPage;
import services.AuthService;

import static app_context.RunContext.*;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();
    AuthService authService = new AuthServiceImpl();

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

    @Then("Login user by API")
    public void loginUserByAPI() {
        User user = get("user", User.class);
        User userLogged = authService.login(user);
        Assertions.assertNotNull(userLogged);

    }
}
