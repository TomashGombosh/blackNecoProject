package com.blackNecoProject.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.blackNecoProject.pages.HomePage;
import com.blackNecoProject.pages.LoginPage;

public class LoginTests extends BaseTest {

        private LoginPage loginPage;
        private HomePage homePage;

    /**
     * This test case will login in http://demo.guru99.com/V4/
     * Verify login page title as guru99 bank
     * Login to application
     * Verify the home page using Dashboard message
     */
    @Test(description = "Test Case 1 - User can login successfully")
    public void userCanLoginSuccessfully() {
        //Create Page object
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        //Verify login page title
        String loginPageTitle = loginPage.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        //login to application
        loginPage.loginToGuru99("mgr123", "mgr!23");
        //Verify home page
        Assert.assertTrue(homePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
    }
}
