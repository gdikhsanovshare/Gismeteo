package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GismeteoTest extends BaseTest {
    @Ignore
    @Test
    public void testLocationInHeader() {
        String city = "Сочи";

        String actualCityH1Text =
                openBaseUrl()
                        .inputTextAndEnter("gismeteo")
                        .clickGismeteoFirstSearchResult()
                        .inputTextToSearchField(city)
                        .findCityByExactTextInDropdownAndClick(city)
                        .getCurrentCityTitle();

        Assert.assertEquals(actualCityH1Text, "Погода в " + city + " сегодня");
    }

    @Test (description = "Open Test URL")
    public void testWebdriverVisibility() {
        openWebdriverVisibilityTestUrl();
    }
}
