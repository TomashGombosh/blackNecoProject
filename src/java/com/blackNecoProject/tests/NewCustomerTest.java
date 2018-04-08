package com.blackNecoProject.tests;

        import com.blackNecoProject.commons.Config;
        import com.blackNecoProject.pages.LoginPage;
        import com.blackNecoProject.pages.NewCustomerPage;
        import org.openqa.selenium.By;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class NewCustomerTest extends BaseTest {
    private NewCustomerPage newcustomerpage;
    private LoginPage loginpage;

    @Test(description = "Test Case 3 - Create new customer")
    public void createNewCustomer(){
        newcustomerpage = new NewCustomerPage(driver);
        loginpage = new LoginPage(driver);
        loginpage.loginToGuru99(Config.USERNAME,Config.PASSWORD);
        newcustomerpage.enterNewCustomer();
        Assert.assertEquals(By.name("addcust"),newcustomerpage.FormCustomer());
        newcustomerpage.fullFormNewCustomer();
        Assert.assertEquals(By.name("regmsg"),newcustomerpage.getFormRegist());
    }
}
