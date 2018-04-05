package com.blackNecoProject.testng.tests;

import com.blackNecoProject.testng.commons.Config;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.blackNecoProject.testng.pages.HomePage;
import com.blackNecoProject.testng.pages.LoginPage;

public class LoginTests extends BaseTest {

    private LoginPage loginPage = new LoginPage(driver);
    private HomePage homePage = new HomePage(driver);

    @Test(description = "Test Case 0 - User can login successfully")
    public void userCanLoginSuccessfully() {
        String loginPageTitle = loginPage.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        loginPage.loginToGuru99(Config.USERNAME, Config.PASSWORD);
        Assert.assertTrue(homePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
    }
}
