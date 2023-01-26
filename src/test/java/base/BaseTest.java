package base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.YaMainPage;

public class BaseTest {
    private final static String BASE_URL = "https://ya.ru/";
    private final static String TEST_URL = "https://intoli.com/blog/not-possible-to-block-chrome-headless/chrome-headless-test.html";

    private WebDriver driver;

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


    public YaMainPage openBaseUrl() {
        driver.get(getBaseUrl());
        return new YaMainPage(getDriver());
    }
    @Step("Open Test URL method")
    public void openWebdriverVisibilityTestUrl() {
        driver.get(TEST_URL);
    }
}
