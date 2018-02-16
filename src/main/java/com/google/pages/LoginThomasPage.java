package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginThomasPage {
    private WebDriver driver;
    private String login = "kuklapasha";
    private String password = "Serpaultite55";
    private By registorbuttonLocator = By.id("login-link");
    private WebElement registorButton;
    public void setLogin(){
        registorButton = driver.findElement(registorbuttonLocator);
        registorButton.click();


    }
}
