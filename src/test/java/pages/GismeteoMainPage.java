package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class GismeteoMainPage extends BasePage {
    @FindBy(css = ".input")
    private WebElement searchField;

    @FindBy(xpath = "//div[@class='city-title ' or @class='city-title is-plane']")
    private List<WebElement> searchCityResultList;

    public GismeteoMainPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public GismeteoMainPage inputTextToSearchField(String city) {

        switchToAnotherWindow();
        getWait7().until(ExpectedConditions.elementToBeClickable(searchField)).click();
        new Actions(getDriver())
                .moveToElement(searchField)
                .click()
                .sendKeys(city)
                .pause(2000)
                .perform();

        return this;
    }

    @Step
    public GismeteoExactCityPage findCityByExactTextInDropdownAndClick(String city) {
        WebElement result = null;
        for (WebElement element : searchCityResultList) {
            if (element.getText().equalsIgnoreCase(city)) {
                result = element;
            }
            break;
        }
        if (result != null) {
            getWait7().until(ExpectedConditions.elementToBeClickable(result)).click();
        }

        return new GismeteoExactCityPage(getDriver());
    }
}
