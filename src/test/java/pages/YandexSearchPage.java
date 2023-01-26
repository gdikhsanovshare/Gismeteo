package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YandexSearchPage extends BasePage {

    @FindBy(xpath = "(//a[@href = 'https://www.gismeteo.ru/'])[1]")
    private WebElement gismeteoFirstLink;

    @FindBy(css = ".CheckboxCaptcha-Anchor")
    private WebElement notARobotCheckbox;

    @FindBy(xpath = "//form[@method='POST']")
    private WebElement notARobotFrame;

    public YandexSearchPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public GismeteoMainPage clickGismeteoFirstSearchResult() {
        clickNotARobotCheckbox();
        getWait7().until(ExpectedConditions.elementToBeClickable(gismeteoFirstLink)).click();

        return new GismeteoMainPage(getDriver());
    }

    public void clickNotARobotCheckbox() {
        if (notARobotFrame.isDisplayed()) {
        new Actions(getDriver())
                .moveToElement(notARobotCheckbox)
                .pause(1000)
                .click()
                .perform();
        }
    }
}
