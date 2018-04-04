package pages;

import commons.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static commons.Config.Email;

public class MailPage extends BasePage {
    private By emailid = By.name("emailid");
    private By here = By.xpath(".//body/div/ol/li/a");
    private By visit =By.cssSelector("html body div ol li");
    private By submit = By.name("btnLogin");
    private By Access = By.xpath(".//table");
    //private Config config;

        public MailPage(WebDriver driver){ super(driver); }
    public void clickHere(){
        click(here);
    }
    public void setEmail(){
        enterText(emailid, Email);
    }
    public String getVisitText() {
        return getText(visit);
    }
    public void clickEmaildSubmit() {
        click(submit);
    }
    public String getAccessDetailsText() {
        return  getText(Access);
    }
}

