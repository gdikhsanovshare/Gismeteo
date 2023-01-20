package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private WebDriver driver;

    private WebDriverWait wait7;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriverWait getWait7() {
        if (wait7 == null) {
            wait7 = new WebDriverWait(driver, Duration.ofSeconds(5));
        }

        return wait7;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected void switchToAnotherWindow() {

        String originalWindow = getDriver().getWindowHandle();

        for (String windowHandle : getDriver().getWindowHandles()) {
            if (!originalWindow.equals(windowHandle) && getDriver().getWindowHandles().size() == 2) {
                getDriver().switchTo().window(windowHandle);
                break;
            }
        }
    }
}
