package com.google.pages;

import com.google.core.WebDriverUtil;
import org.openqa.selenium.WebDriver;

public class AbstractPage {
    protected WebDriver driver;
    protected WebDriverUtil webDriverUtil;

    public class AdbstractPage (WebDriver driver) {
        this.driver = driver;
        this.webDriverUtil = new WebDriverUtil(driver);
    }
}