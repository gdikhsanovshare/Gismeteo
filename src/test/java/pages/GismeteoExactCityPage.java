package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GismeteoExactCityPage extends BasePage {
    @FindBy(className = "page-title")
    private WebElement getCurrentCityH1Text;

    public GismeteoExactCityPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public String getCurrentCityTitle() {
        return getWait7().until(ExpectedConditions.visibilityOf(getCurrentCityH1Text)).getText();
    }
}
