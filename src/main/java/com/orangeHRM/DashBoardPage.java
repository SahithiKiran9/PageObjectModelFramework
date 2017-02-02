package com.orangeHRM;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BasePage{
    @FindBy(id="menu_admin_viewAdminModule")
    WebElement admin_menu;

    @FindBy(id="menu_admin_viewUserRoles")
    WebElement user_Role;

    @FindBy(id="menu_admin_viewJobTitleList")
    WebElement jobTitle_List;

    public DashBoardPage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToUserRolePage(){
        admin_menu.click();
        user_Role.click();

    }

    public void navigateToJobTitlesPage(){
        admin_menu.click();
        jobTitle_List.click();
    }

    public boolean isUserLoggedIn(String user_roleName){
        return Utils.isTextPresentAt((By.id("frmList_ohrmlistComponent")), user_roleName);
    }


}
