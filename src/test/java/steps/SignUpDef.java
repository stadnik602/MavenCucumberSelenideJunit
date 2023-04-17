package steps;

import config.UserConfig;
import impl.AuthServiceImpl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.api.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import pages.SignUpPage;
import services.AuthService;

import static app_context.RunContext.put;

public class SignUpDef {
    SignUpPage signUpPage = new SignUpPage();
    AuthService authService = new AuthServiceImpl();

    @Then("Click I'm a learner button")
    public void clickImALearnerButton() {
        signUpPage.clickButtonByElement(signUpPage.getImLearnerButton());
    }

    @When("Input random email")
    public void inputRandomEmail() {
        String email = "Auto_" + RandomStringUtils.randomAlphabetic(5) + "@mailinator.com";
        signUpPage.inputField(signUpPage.getEmailField(), email);
        put("email", email);
        System.out.println("New client email is: " + email);
    }

    @When("Input first name")
    public void inputFirstName() {
        String firstName = UserConfig.USER_FIRST_NAME;
        signUpPage.inputField(signUpPage.getFirstName(), firstName);
        put("firstName", firstName);
    }

    @When("Input last name")
    public void inputLastName() {
        String lastName = UserConfig.USER_LAST_NAME;
        signUpPage.inputField(signUpPage.getLastName(), lastName);
        put("lastName", lastName);

    }

    @Then("Validation error should be displayed below Email field")
    public void emailValidationMessageIsDisplayed() {
        Assertions.assertTrue(signUpPage.isValidationMessageDisplayed(signUpPage.getEmailErrorElement()));
    }

    @Then("Validation error should be displayed below First Name field")
    public void firstNameValidationMessageIsDisplayed() {
        Assertions.assertTrue(signUpPage.isValidationMessageDisplayed(signUpPage.getFirstNameErrorElement()));
    }

    @Then("Validation error should be displayed below Last Name field")
    public void lastNameValidationMessageIsDisplayed() {
        Assertions.assertTrue(signUpPage.isValidationMessageDisplayed(signUpPage.getLastNameErrorElement()));
    }

    @Then("Validation error should be displayed below Password field")
    public void passwordValidationMessageIsDisplayed() {
        Assertions.assertTrue(signUpPage.isValidationMessageDisplayed(signUpPage.getPasswordErrorElement()));
    }

    @Then("Email validation message should be correct")
    public void checkEmailErrorMessage() {
        Assertions.assertEquals(signUpPage.getEmailErrorElement().getText(), signUpPage.getEmailErrorMessage());
    }

    @Then("First Name validation message should be correct")
    public void checkFirstNameErrorMessage() {
        Assertions.assertEquals(signUpPage.getFirstNameErrorElement().getText(), signUpPage.getFirstNameErrorMessage());
    }

    @Then("Last Name validation message should be correct")
    public void checkLastNameErrorMessage() {
        Assertions.assertEquals(signUpPage.getLastNameErrorElement().getText(), signUpPage.getLastNameErrorMessage());
    }

    @Then("Password validation message should be correct")
    public void checkPasswordErrorMessage() {
        Assertions.assertEquals(signUpPage.getPasswordErrorElement().getText(), signUpPage.getPasswordErrorMessage());
    }
    @When("Create user by API")
    public void createUserByAPI() {
        User newUser = User.builder()
                .email("auto_" + RandomStringUtils.randomAlphabetic(5) + "@mailinator.com")
                .firstName(UserConfig.USER_FIRST_NAME)
                .lastName(UserConfig.USER_LAST_NAME)
                .password(UserConfig.USER_PASSWORD)
                .rememberMe(true)
                .build();

        User createdUser = authService.createUser(newUser);
        Assertions.assertNotNull(createdUser);
    }
}
