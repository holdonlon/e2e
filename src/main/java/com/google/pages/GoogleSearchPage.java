package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchPage {
   // private WebDriver driver;
    //private By searchFieldLocator = By.xpath("//*[@id=\"lst-ib\"]");
    @FindBy(how = How.XPATH, using = "//*[@id=\"lst-ib\"]")
    private WebElement searchField;

    //public GoogleSearchPage(WebDriver driver) {
        //this.driver = driver;
    //}

    public void searchFor(String searchdata) {
        //searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(searchdata);
        searchField.submit();
    }
}