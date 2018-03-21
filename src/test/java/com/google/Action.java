package com.google;

import com.google.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Action extends WebDriverTestBase{
    @Test
    public void dragAnd(){
        driver.get("https://gojs.net/latest/samples/htmlDragDrop.html?gclid=CLjWnLeG5tQCFUeVGwodCowEcA");
        WebElement fromElem = driver.findElement(By.xpath(""));
        //WebElement toElem = driver.findElement("By.xpath")

    }
}
