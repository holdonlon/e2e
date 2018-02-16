package com.google;

import com.google.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ThomasCook extends WebDriverTestBase {
    private String login = "kuklapasha";
    private String password = "Serpaultite55";
    private By buttonRegistorlocator = By.xpath("//*[@id=\"login-link\"]");
    private WebElement buttonRegistor;
    private By registerFieldLocator = By.xpath("//*[@id=\"userEmail\"]");
    private WebElement registerfield;
@Test
    public void ThomasCookTest(){
    driver.get("https://www.thomascook.com");
    //LoginThomasPage thomasPage = new LoginThomasPage();
    //thomasPage.setLogin();
    buttonRegistor = driver.findElement(buttonRegistorlocator);
    buttonRegistor.sendKeys(login);
    registerfield = driver.findElement(buttonRegistorlocator);
    registerfield.sendKeys(password);

}
}
