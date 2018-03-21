package com.google.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.google.core.BrowsersEnum.CHROME;
import static com.google.core.BrowsersEnum.EDGE;
import static com.google.core.PropertiesCache.getProperty;
import static sun.rmi.rmic.newrmic.Constants.REMOTE;

@Listeners({com.google.core.TestListener.class})
public class WebDriverTestBase {

    protected WebDriver driver;
    protected BrowsersEnum browsersEnum.valueOf(System.getProperty("browser", getProperty("defaultbrowser")));

    private DesiredCapabilities setDesiredCapabilities(String platform, String remoteBrowser){
    DesiredCapabilities caps = new DesiredCapabilities();
    if (platform.equals(IgnoreCase(Platform.WIN10.name))) {
        caps.setPlatform(Platform.WIN10);
        caps.setBrowserName(remoteBrowser);
    }

    return caps;
    }

    @Parameters({"platform", "remoteBrowser"})
    @BeforeClass
    public void SetUp(@Optional String platform, @Optional String remoteBrowser) throws MailformedURLException {
        switch(browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case REMOTE:
                DesiredCapabilities caps = setDesiredCapabilities(platform, remoteBrowser);
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
                break;

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(long.paserLong(getProperty("wait.implicit")),)
    }
    public WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.setBinary("/Applications/Google Chrome Canary.app/Contents/MacOS/Google Chrome Canary");
        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
    }
    @AfterClass
    protected void tearDown() {
        driver.close();
    }
}
