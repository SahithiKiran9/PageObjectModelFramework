package com.orangeHRM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserRolePage extends BasePage {
    @FindBy(id="userrole_type")
    WebElement userRole_Type;

    @FindBy(id="userrole_name")
    WebElement userRole_Name;

    @FindBy(id="btnSave")
    WebElement save_UserRole;

    public AddUserRolePage() {
        PageFactory.initElements(driver, this);
    }

    public void addUserRole(String type, String user_roleName) {
        Utils.selectFromList(userRole_Type, type);
        userRole_Name.sendKeys(user_roleName);
        save_UserRole.click();

    }
}
