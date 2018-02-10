package com.google;

import com.google.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Gmailtest extends WebDriverTestBase {
    private By fieldSearchLocator = By.xpath("//*[@id=\"lst-ib\"]");
    private WebElement fieldSearch;
    private String data = "Gmail";
    private By linkGmailLocator = By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/h3/a");
    private WebElement linkGmail;
    private By gmailLoginLocator = By.xpath("/html/body/nav/div/a[2]");
    private WebElement gmailLogin;
    private By loginFieldLocator = By.xpath("//*[@id=\"identifierId\"]");

    @Test
    public void searchGmailTest() {

        driver.get("https://www.google.com");
        fieldSearch = driver.findElement(fieldSearchLocator);
        fieldSearch.sendKeys(data);
        fieldSearch.submit();
        //*Assert.assertTrue(fieldSearch.getText().contains(data));
        linkGmail = driver.findElement(linkGmailLocator);
        linkGmail.click();
        gmailLogin = driver.findElement(gmailLoginLocator);
        gmailLogin.click();

    }
}
