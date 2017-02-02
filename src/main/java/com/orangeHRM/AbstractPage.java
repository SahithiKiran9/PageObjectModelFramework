package com.orangeHRM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage extends BasePage {
    @FindBy(id="welcome")
    WebElement welcome_message;

    @FindBy(linkText="Logout")
    WebElement logout_link;

    public AbstractPage() {
        PageFactory.initElements(driver, this);
    }

    public void logout() {
        welcome_message.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logout_link.click();
    }
}
