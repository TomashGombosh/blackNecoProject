package com.blackNecoProject.testng.tests;

import com.blackNecoProject.testng.commons.Config;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.blackNecoProject.testng.pages.MailPage;

public class MailPageTest extends BaseTest {
    private MailPage mailPage = new MailPage(driver);

    @Test(description = "Test Case 1 - Get access to demo site")
    public void getAccessToDemoSite(){
        Assert.assertEquals("Visit - here", mailPage.getVisitText(),"Visit - here text should be displayed");
        mailPage.clickHere();
        mailPage.setEmail(Config.EMAIL);
        mailPage.clickEmailIdSubmit();
        Assert.assertTrue(mailPage.getAccessDetailsText().toString().contains("mngr125317"));
        Assert.assertTrue(mailPage.getAccessDetailsText().toString().contains("123!"));
    }
}
