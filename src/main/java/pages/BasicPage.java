package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {
    public void clickButtonInHeaderByText(String text) {
        $(By.xpath("//*[text()='" + text + "']")).click();
    }
    public void inputField(SelenideElement element, String text) {
        element.val(text);
    }

    public void clickButtonByElement(SelenideElement element) {
        element.click();
    }

    public void clickButtonByText(String text) {
        $(By.xpath("//*[text()='" + text + "']")).click();
    }
}
