package com.google.pages;

import com.google.core.WebDriverTestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RozetkaSearchTest extends WebDriverTestBase {
    @Test
    public void SearchAndAddItemTest(){
        String searchText = "iPhone 8";
        driver.get("https://rozetka.com.ua/");
        RozetkaMainPage mainPage = PageFactory.initElements(driver, RozetkaMainPage.class);
        mainPage.setDriver(driver);
        RozetkaResultPage resultPage.searchForGood(searchText);
        Assert.assertTrue(resultPage.getGoods().get(0).getText().contains(searchText));
        resultPage.addGoodToBasket();
        Assert.assertTrue(resultPage.getCartPopup().getLink0LastAddedGood().getText().contains(searchText));

    }
}
