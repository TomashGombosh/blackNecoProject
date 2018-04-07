package com.blackNecoProject.tests;

        import com.blackNecoProject.pages.LoginPage;
        import com.blackNecoProject.pages.NewCustomer;
        import org.openqa.selenium.By;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class NewCustomerTest extends BaseTest {
    private NewCustomer newcustomer;
    private LoginPage loginpage;

    @Test(description = "Test Case 3 - Create new customer")
    public void createNewCustomer(){
        newcustomer = new NewCustomer(driver);
        loginpage = new LoginPage(driver);
        loginpage.loginToGuru99("mngr125317", "123!");
        newcustomer.enterNewCustomer();
        Assert.assertEquals(By.name("addcust"),newcustomer.FormCustomer());
        newcustomer.fullFormNewCustomer();
        Assert.assertEquals(By.name("regmsg"),newcustomer.getFormRegist());
    }
}
