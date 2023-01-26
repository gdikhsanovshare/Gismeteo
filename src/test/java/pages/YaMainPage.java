package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YaMainPage extends BasePage {

    @FindBy(id = "text")
    private WebElement searchField;

    public YaMainPage(WebDriver driver) {
        super(driver);
    }

//    public YaMainPage openBaseUrl(String Url) {
//        getDriver().get(Url);
//
//        return this;
//    }
    @Step
    public YandexSearchPage inputTextAndEnter(String text) {
        getWait7().until(ExpectedConditions.elementToBeClickable(searchField));
        new Actions(getDriver())
                .moveToElement(searchField)
                .click()
                .pause(500)
                .sendKeys(text)
                .pause(500)
                .sendKeys(Keys.ENTER)
                .perform();

        return new YandexSearchPage(getDriver());
    }



}
