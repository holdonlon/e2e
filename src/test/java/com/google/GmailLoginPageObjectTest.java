package com.google;

import com.google.pages.GmailLoginPage;
import com.google.pages.GmailLoginPageFactoryPattern;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static com.google.core.PropertiesCache.getProperty;

public class GmailLoginPageObjectTest extends WebDriverWait {

    @Test
    public void gmailLoginTest() {
        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        GmailLoginPage gmailLoginPage = new GmailLoginPage(driver);
        gmailLoginPage.Login("slnmtstaccnt@gmail.com", "pss$slnm");
    }
@Test
public void gamilLoginFactoryUseTest(){
    driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    GmailLoginPageFactoryPattern loginPage = PageFactory.initElements(driver, GmailLoginPageFactoryPattern.class);
    loginPage.Login(getProperty("gmail.login"), getProperty("gmail.password"));
}
@Test
public void gmailLoginHomeTest() {
    driver.get("https://www.gmail.com");
    GmailLoginPageFactoryPattern loginPage = PageFactory.initElements(driver, GmailLoginPageFactoryPattern.class);

 }

}
