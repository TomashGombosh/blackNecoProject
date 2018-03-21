package tests;

import commons.Config;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    private LoginPage loginPage = new LoginPage(driver);
    private HomePage homePage = new HomePage(driver);

    @Test(description = "Test Case 1 - User can login successfully")
    public void userCanLoginSuccessfully(){
        String loginPageTitle = loginPage.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        loginPage.loginToGuru99(Config.USERNAME, Config.PASSWORD);
        Assert.assertTrue(homePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : " + Config.USERNAME));
    }

}
