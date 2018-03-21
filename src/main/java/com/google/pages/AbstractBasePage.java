package com.google.pages;

import com.google.core.WebDriverUtil;
import org.openqa.selenium.WebDriver;

public class AbstractBasePage {
    protected WebDriver driver;
    protected WebDriver util;

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        this.util = new WebDriverUtil(driver);
    }


}
