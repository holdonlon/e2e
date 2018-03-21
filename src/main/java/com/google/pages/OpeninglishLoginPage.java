package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpeninglishLoginPage extends AbstractBasePage {

    private By loginTextboxLocator = By.id("username");
    private WebElement loginTextbox;

    private By passwordTextboxLocator = By.id("password");
    private WebElement passwordTextbox;

    private By loginButtonLocator = By.id("login-btn");
    private WebElement loginButton;

    private By bunnerContinueButtonLocator = By.id("banner-continue-btn");
    private WebElement bunnerContinueButton;

    private By avatarImageLocator = By.cssSelector("div.navbar-toggler");
    private WebElement avatarImage;

    private By dropdownUsernameLocator = By.cssSelector("p.dropdown-item.username");
    private WebElement dropdownUsername;

    public OpeninglishLoginPage(WebDriver driver) {
        super(driver);
    }

        public void enterLogin(String s) {
            loginTextbox = driver.findElement(passwordTextboxLocator);
            passwordTextbox.sendKeys(s);
    }

    public void pressLogInButton() {
        loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    public void closeBunnerContinue() {
        bunnerContinueButton = driver.findElement(bunnerContinueButtonLocator);
        bunnerContinueButton.click();
    }

    public void hoverAvatarImage(){

    }

    public String getDropdownUserName(){
        avatarImage = driver.findElement(avatarImageLocator);
        avatarImage.click();
        dropdownUsername = driver.findElement(dropdownUsernameLocator);
        return dropdownUsername.getText();
    }
}
