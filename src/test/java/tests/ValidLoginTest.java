package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class ValidLoginTest extends BaseTest {
    private LoginPage loginpage;
    @Test(description = "Test Case 1 - User can't login successful")
    public void userCantLoginSuccess ()throws InterruptedException{
        loginpage = new LoginPage(driver);
        String loginPageTitle = loginpage.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        loginpage.loginToGuru99("mgr123", "mgr23");
        loginpage.alere();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
    }
}
