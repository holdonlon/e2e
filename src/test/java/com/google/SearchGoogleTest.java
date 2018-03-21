package com.google;

import com.google.core.WebDriverTestBase;
import com.google.pages.GoogleResultPage;
import com.google.pages.GoogleSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;


public class SearchGoogleTest extends WebDriverTestBase {
    private By searchFieldLocator = By.xpath("//*[@id=\"lst-ib\"]");
    private By linkLocator = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/h3/a");
    private By searchButtonLocator = By.cssSelector("input[name='btnK']);
    private WebElement searchField;
    private WebElement linkField;
    private List<WebElement> resultList;
    private WebElement searchButton;
    private String searchData = "Selenium";


    @Test
    public void searchGoogleTest(){
        driver.get("https://www.google.ua");
        searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(searchData);
        searchField.submit();
        //linkField = driver.findElement(linkLocator);
        //Assert.assertTrue(linkField.getText().contains(searchData));
        for(WebElement element : resultList) {
            assert.assertTrue(element.getText().toLowerCase().contains(searchData));
        }
        driver.quit();

    }

   @Test
    public void searchGooglePageObjectTest() {
        driver.get("https://www.google.com.ua");
        GoogleSearchPage searchPage = PageFactory.initElements(driver,GoogleSearchPage.class);
        searchPage.searchFor(searchData);
        GoogleResultPage resultPage = new GoogleResultPage(driver);
        linkField = resultPage.findLink();
        String result = linkField.getText().toLowerCase();
        Assert.assertTrue(linkField.getText().toLowerCase().contains(searchData));
        driver.close();
        //Assert.assertTrue(resultPage.findLink().getText().contains(searchData));
    }

}