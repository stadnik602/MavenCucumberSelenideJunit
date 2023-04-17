package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before("@UI")
    @Given("The home page is opened")
    public void openUrl() {
        open("https://grinfer.com/");
    }
}
