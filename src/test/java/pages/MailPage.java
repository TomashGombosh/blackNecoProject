package pages;

import commons.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage extends BasePage {
    private By emailid = By.name("emailid");
    private By here = By.xpath(".//body/div/ol/li/a");
    private By visit =By.cssSelector("html body div ol li");
    private By submit = By.name("btnLogin");
    private By Access = By.cssSelector("html body table tbody td");
    private Config objConfig;

        public MailPage(WebDriver driver){ super(driver); }
    public void clickHere(){
        click(here);
    }
    public void setEmail(){
        enterText(emailid,objConfig.Email);
    }
    public String getVisitText() {
        return getText(visit);
    }
    public void clickEmaildSubmit() {
        click(submit);
    }
    public String getAccessDetails() {
        return getText(Access);
    }
}

