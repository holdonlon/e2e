package com.google;

import com.google.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop extends WebDriverTestBase {

    @Test
    public void testDragandDrop() throws InterruptedException {
    driver.get("https://gojs.net/latest/samples/htmlDragDrop.html?gclid=CLjWnLeG5tQCFUeVGwodCowEcA");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"sample\"]/div[1]/span[1]/div/div[1]"));
        //WebElement to = driver.findElement(By.xpath(""));
        Actions builder = new Actions(driver);
        from.getAttribute("src").equals("");
    }
}
