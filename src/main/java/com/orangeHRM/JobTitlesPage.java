package com.orangeHRM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobTitlesPage extends BasePage {
    @FindBy(id="btnAdd")
    WebElement add_JobTitle;

    public JobTitlesPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToAddJobTitlePage() {
        add_JobTitle.click();
    }

}
