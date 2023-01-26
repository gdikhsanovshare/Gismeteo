package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class BaseUtils {

    static WebDriver createDriver() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
//        options.addArguments("--disable-gpu, --no-sandbox, --disable-dev-shm-usage");
//        options.addArguments("--disable-infobars");
//        options.addArguments("--user-agent=\"Mozilla/5.0 (Windows Phone 10.0; Android 4.2.1; Microsoft; Lumia 640 XL LTE) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Mobile Safari/537.36 Edge/12.10166\"");
        options.addArguments("--disable-blink-features=AutomationControlled");
//        options.addArguments("--ignore-certificate-errors");
//        options.addArguments("--disable-popup-blocking");
//        options.addArguments("test-type");
//        options.addArguments("--window-size=1920,1200");
//        options.addArguments("--enable-precise-memory-info");
//        options.addArguments("--disable-default-apps");
//        options.addArguments("test-type=browser");
//        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//        options.setExperimentalOption("useAutomationExtension", false);
//        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        options.addArguments("--disable-web-security");
//        options.addArguments("--headless");
//        options.addArguments("--start-fullscreen");
//        options.addArguments("--disable-notifications");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        return driver;
    }
}