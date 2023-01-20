package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GismeteoTest extends BaseTest {
    @Test
    public void testLocationInHeader() throws InterruptedException {
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
}
