package steps;

import io.cucumber.java.en.Then;
import pages.HeaderFragment;

public class HeaderFragmentDef {
    private final HeaderFragment headerFragment = new HeaderFragment();

    @Then("Check name in the header")
    public void checkNameInTheHeader() {
        headerFragment.isElementDisplayed(headerFragment.getUserName());
    }
}
