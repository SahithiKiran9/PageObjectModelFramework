package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    @FindBy(id="txtUsername")
    WebElement usernameField;

    @FindBy(id="txtPassword")
    WebElement passwordField;

    @FindBy(id="btnLogin")
    WebElement login_button;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void loginAs(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        login_button.click();
    }
}
