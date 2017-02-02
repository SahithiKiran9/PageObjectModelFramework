package com.orangeHRM;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class SmokeTestSuite extends BaseTest {
    // Test Data
    String type = "Admin";
    String user_roleName = "test1";

    String jobTitle = "Junior Tester";
    String jobDescription = "Automation Testing";

    // Creating Objects for Reusable Function Classes
    LoginPage loginPage = new LoginPage();
    DashBoardPage dashboardPage = new DashBoardPage();
    UserRolesPage userRolesPage = new UserRolesPage();
    AddUserRolePage addUserrolePage = new AddUserRolePage();
    JobTitlesPage jobTitlespage = new JobTitlesPage();
    AddJobTitlePage addJobtitlePage = new AddJobTitlePage();
    AbstractPage abstractPage = new AbstractPage();

    @Test
    public void verifyAdminCanAddUserRole(){
        loginPage.loginAs(adminUsername, adminPassword); //Admin is logged in
        Assert.assertTrue(Utils.isTextPresentAt(By.id("welcome"), "Welcome Admin"));
        dashboardPage.navigateToUserRolePage(); // go to user roles page
        userRolesPage.goToAddUserRolePage(); // verify Admin is in addUserRole page
        addUserrolePage.addUserRole(type, user_roleName);
        //verify Admin has added user role
        Utils.wait(10);
        Assert.assertTrue(dashboardPage.isUserLoggedIn(user_roleName));
        //verify admin is back to user roles page
        Assert.assertTrue(Utils.isElementPresent(By.id("resultTable")));
        abstractPage.logout();
    }

    @Test
    public void verifyAdminCanAddJobTitle(){
        loginPage.loginAs(adminUsername, adminPassword); //Admin is logged in
        Assert.assertTrue(Utils.isTextPresentAt(By.id("welcome"), "Welcome Admin"));
        dashboardPage.navigateToJobTitlesPage(); // go to job titles page
        jobTitlespage.goToAddJobTitlePage(); // verify Admin is in addJobTitle page
        addJobtitlePage.addJobTitle(jobTitle, jobDescription);
        // verify Job title is added successfully
        Utils.wait(10);
        Assert.assertTrue(Utils.isTextPresentAt(By.id("frmList_ohrmListComponent"), jobTitle));
        //verify Admin is back to job titles page
        Assert.assertTrue(Utils.isElementPresent(By.id("jobTitleList")));
        abstractPage.logout();
    }

}
