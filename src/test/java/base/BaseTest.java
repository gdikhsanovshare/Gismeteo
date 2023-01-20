package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.YaMainPage;

import java.time.Duration;

public class BaseTest {
    private final static String BASE_URL = "https://ya.ru/";

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public static String getBaseUrl() {
        return BASE_URL;
    }

    @BeforeMethod
    protected void beforeMethod() {
        driver = BaseUtils.createDriver();
    }

    @AfterMethod
    protected void afterMethod() {
        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;

    }

    protected WebDriverWait getWait() {
        if (webDriverWait == null) {
            webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        }

        return webDriverWait;
    }

    public YaMainPage openBaseUrl() {
        driver.get(getBaseUrl());
        return new YaMainPage(getDriver());
    }
}
