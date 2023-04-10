package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SignInPage extends BasicPage {
    private final SelenideElement emailField = $(By.cssSelector("#email"));
    private final SelenideElement passwordField = $(By.cssSelector("#password"));
    private final SelenideElement logInButton = $(By.xpath("//*[text()='Log In']"));


    public SelenideElement getEmailField() {
        return emailField;
    }

    public SelenideElement getPasswordField() {
        return passwordField;
    }
}
