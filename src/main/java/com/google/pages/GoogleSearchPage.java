package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"lst-ib\"]")
    private WebElement searchField;

    public void searchFor(String searchdata) {
        searchField.sendKeys(searchdata);
        searchField.submit();
    }
}