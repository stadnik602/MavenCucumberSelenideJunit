package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import config.UserConfig;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderFragment {
    private SelenideElement userName = $(By.xpath("//*[text()='" + UserConfig.userName + "']"));
    private SelenideElement nameInHeader = $(By.xpath("(//li//div//strong)[1]"));

    public boolean isElementDisplayed(SelenideElement element) {
        return element.shouldBe(Condition.appear).isDisplayed();
    }

    public SelenideElement getUserName() {
        return userName;
    }

    public SelenideElement getNameFromHeader() {
        return nameInHeader;
    }
}
