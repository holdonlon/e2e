package com.google;

import com.google.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectTest extends WebDriverTestBase {
    @Test
    public void testDropdown() {
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        WebElement iFrame = driver.findElement(By.id("iframeResult"));
        driver.switchTo ().frame(iFrame);
    }

}
