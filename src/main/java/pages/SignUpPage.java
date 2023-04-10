package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage extends BasicPage {
    private final SelenideElement IM_LEARNER_BUTTON = $(By.xpath("//*[text()=\"I'm a learner\"]"));

    public SelenideElement getImLearnerButton() {
        return IM_LEARNER_BUTTON;
    }
}
