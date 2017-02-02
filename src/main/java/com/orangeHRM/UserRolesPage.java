package com.orangeHRM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRolesPage extends BasePage {
    @FindBy(id="btnAdd")
    WebElement add_userRoleButton;

    public UserRolesPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToAddUserRolePage(){
        add_userRoleButton.click();
    }
}
