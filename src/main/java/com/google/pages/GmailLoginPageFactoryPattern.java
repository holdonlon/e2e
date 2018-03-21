package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GmailLoginPageFactoryPattern {

    @FindBy(how = How.ID, using = "headingSubtext")
    private WebElement headingText;

    @FindBy(how = How.CSS, using = "input[name=identifier]")
    private WebElement loginTextBox;

    @FindBy(how = How.ID, using = "passwordNext")
    private WebElement submitButton;

    public void Login(String login, String password) {
        loginTextBox.sendKeys(login);
        WebElement nextButton;
        nextButton.click();
    }
}
