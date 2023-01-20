package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexSearchPage extends BasePage {

    @FindBy(xpath = "(//a[@href = 'https://www.gismeteo.ru/'])[1]")
    private WebElement gismeteoFirstLink;

    public YandexSearchPage(WebDriver driver) {
        super(driver);
    }

    public GismeteoMainPage clickGismeteoFirstSearchResult() {
        gismeteoFirstLink.click();

        return new GismeteoMainPage(getDriver());
    }
}
