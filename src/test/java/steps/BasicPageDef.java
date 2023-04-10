package steps;

import config.EnvConfig;
import io.cucumber.java.en.Then;
import pages.BasicPage;

import static com.codeborne.selenide.Selenide.open;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();
    @Then("Click {string} button in the header")
    public void clickButtonInHeader(String arg0) {
        basicPage.clickButtonInHeaderByText(arg0);
    }

    @Then("Open {string} page")
    public void openPage(String arg0) {
        open(EnvConfig.URL + arg0);
    }




}
