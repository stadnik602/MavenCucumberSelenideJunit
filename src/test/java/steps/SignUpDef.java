package steps;

import io.cucumber.java.en.Then;
import pages.SignUpPage;

public class SignUpDef {
    SignUpPage signUpPage = new SignUpPage();
    @Then("Click I'm a learner button")
    public void clickImALearnerButton() {
        signUpPage.clickButtonByElement(signUpPage.getImLearnerButton());
    }
}
