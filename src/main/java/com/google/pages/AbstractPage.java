package com.google.pages;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
    protected WebDriver driver;
    protected WebDriverUtil webDriverUtil;

    public AdbstractPage(WebDriver driver) {
        this.driver = driver;
        this.webDriverUtil = new WebDriverUtil(driver);
    }
}
