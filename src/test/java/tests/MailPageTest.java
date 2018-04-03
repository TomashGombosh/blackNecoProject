package tests;

import org.testng.annotations.Test;
import pages.MailPage;
import static org.testng.Assert.assertEquals;

public class MailPageTest extends BaseTest {
    private MailPage objMail;

    @Test(description = "Get access to demo site")
    public void getAccessToDemoSite(){
        objMail =new MailPage(driver);
        assertEquals("Visit - here",objMail.getVisitText());
        objMail.clickHere();
        objMail.setEmail();
        objMail.clickEmaildSubmit();
        assertEquals("Access details to demo site.",objMail.getAccessDetails());
    }
}
