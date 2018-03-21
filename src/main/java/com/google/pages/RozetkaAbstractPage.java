package com.google.pages;

import com.google.core.WebDriverUtil;
import org.openqa.selenium.WebDriver;

public class RozetkaAbstractPage {

    protected WebDriver driver;
    private WebDriverUtil driverUtil;

    public RozetkaAbstractPage(WebDriver driver);

    {
        this.driver = driver;
        this.driverUtil = new WebDriverUtil(driver);
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
