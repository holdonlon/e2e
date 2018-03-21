package com.google.core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.WebDriverRunner.FIREFOX;
import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.EDGE;

public class SelenideTestBase {
    private String browser = System.getProperty("browser", CHROME);
    protected WebDriverManager driver;
   @BeforeClass
    public void setUp() {

        Configuration.browser = browser;
        Configuration.holdBrowserOpen=true;
        switch (browser) {
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                break;
            case FIREFOX:
                    FirefoxDriverManager.getInstance().setup();
                    break;
            case EDGE:
                EdgeDriverManager.getInstance().setup();
                break;

        }

    }
    @AfterClass
    public void tearDown(){
        WebDriverRunner.getWebDriver().quit();
    }


}
