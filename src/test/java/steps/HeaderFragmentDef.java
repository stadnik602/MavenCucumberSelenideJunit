package steps;

import app_context.RunContext;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.HeaderFragment;

public class HeaderFragmentDef {
    private final HeaderFragment headerFragment = new HeaderFragment();

    @Then("Name in the header should be displayed")
    public void checkNameInTheHeader() {
        headerFragment.isElementDisplayed(headerFragment.getUserName());
    }

    @Then("Registration first name should be displayed in header")
    public void registrationFirstNameShouldBeDisplayedInHeader() {
        headerFragment.isElementDisplayed(headerFragment.getNameFromHeader());
        String actualName = headerFragment.getNameFromHeader().text();
        Assertions.assertEquals((RunContext.get("firstName", String.class)), actualName);
    }
}
