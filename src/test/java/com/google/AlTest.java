package com.google;

import com.google.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AlTest extends WebDriverTestBase {
    @Test
    public void allertTest(){
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        WebElement iFrame = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.xpath("/html/body/button")).click();
        driver.switchTo().alert().dismiss();
        WebElement fildResult = driver.findElement(By.id("demo"));
        String text = fildResult.getText();
        Assert.assertTrue(text.equals("You pressed Cancel!"));

    }
}
