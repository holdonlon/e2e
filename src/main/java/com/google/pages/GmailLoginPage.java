package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class GmailLoginPage extends AbstractPage {

    private WebElement loginTextBox;
    private By loginTextBoxLocator = By.id("identifierId");

    private WebElement passwordTextBox;
    private By passwordTextBoxLocator = By.cssSelector("input[name=password]");

    private WebElement nextButton;
    private By nextButtonLocator = By.id("identifierNext");

    private WebElement getNextButton;
    private By submitButtonLocator = By.id("passwordNext");

    public GmailLoginPage(WebDriver driver) {
        super(driver);
    }
    public void Login(String login, String password) {

        loginTextBox = driver.findElement(loginTextBoxLocator);
        loginTextBox.sendKeys(login);

        nextButton = driver.findElement(nextButtonLocator);
        nextButton.click();

        passwordTextBox = webDriverUtil.waitFor(elementToBeClickable(passwordTextBoxLocator));
        passwordTextBox.sendKeys(password);

        submitButton= webDriverUtil.waitFor(elementToBeClickable(submitButtonLocator));
        submitButton.click();


    }
}
