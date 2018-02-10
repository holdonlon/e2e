package com.google;

import com.google.core.SelenideTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GmailTestSelenide extends SelenideTestBase {
    @Test
    public void Gmailtest() {
        open("https://www.google.com");
        String searchText = "gmaillogin";

        $(By.name("q"))
                .val(searchText)
                .submit();
        $(By.xpath("//*[@id=\"lst-ib\"]"));
    }
}
