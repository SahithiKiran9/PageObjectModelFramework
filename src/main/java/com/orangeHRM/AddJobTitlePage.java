package com.orangeHRM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddJobTitlePage extends BasePage {
    @FindBy(id="jobTitle_jobTitle")
    WebElement job_Title;

    @FindBy(id="jobTitle_jobDescription")
    WebElement job_Description;

    @FindBy(id="btnSave")
    WebElement save_JobTitle;

    public AddJobTitlePage() {
        PageFactory.initElements(driver, this);
    }

    public void addJobTitle(String jobTitle, String jobDescription){
        job_Title.sendKeys(jobTitle);
        job_Description.sendKeys(jobDescription);
        save_JobTitle.click();
    }
}
