package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    public static void wait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    //Method to check whether the given text is present at given location
    public static boolean isTextPresentAt(By element, String text) {
        return driver.findElement(element).getText().contains(text);
    }
    //Method to check whether the given element is present in the page
    public static boolean isElementPresent(By element) {
        return driver.findElement(element).isDisplayed();
    }

    //method to select an item from the drop down menu
    public static void selectFromList(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

}
