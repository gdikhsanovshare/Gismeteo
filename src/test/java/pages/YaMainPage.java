package pages;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YaMainPage extends BasePage {

    @FindBy(id = "text")
    private WebElement searchField;

    public YaMainPage(WebDriver driver) {
        super(driver);
    }

    public YaMainPage openBaseUrl(String Url) {
        getDriver().get(Url);

        return this;
    }

    public YandexSearchPage inputTextAndEnter(String text) {
        searchField.click();
        searchField.sendKeys(text, Keys.ENTER);

        return new YandexSearchPage(getDriver());
    }



}
