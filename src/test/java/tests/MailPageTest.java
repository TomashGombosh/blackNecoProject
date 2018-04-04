package tests;

import commons.Config;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MailPage;
import static org.testng.Assert.assertEquals;

public class MailPageTest extends BaseTest {
    private MailPage mailPage;

    @Test(description = "Get access to demo site" )
    public void getAccessToDemoSite(){
        mailPage =new MailPage(driver);
        assertEquals("Visit - here",mailPage.getVisitText());
        mailPage.clickHere();
        mailPage.setEmail();
        mailPage.clickEmaildSubmit();
        Assert.assertTrue(mailPage.getAccessDetailsText().toString().contains("mngr125317"));
        Assert.assertTrue(mailPage.getAccessDetailsText().toString().contains("123!"));
    }
}
