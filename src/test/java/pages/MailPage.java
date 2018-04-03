package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage extends BasePage {
    private By emailid = By.name("emailid");
    private By here = By.cssSelector("html body div ol li a");
    private By visit =By.cssSelector("html body div ol li");
    private By submit = By.name("btnLogin");
    private By Access = By.cssSelector("html body table tbody td");

        public MailPage(WebDriver driver){ super(driver); }
    public void clickHere(){
        click(here);
    }
    public void setEmailid( ){
        enterText(emailid,"bedove69@meta.ua");
    }
    public String getText() {
        return getText(visit);
    }
    public void clickEmailSubmit() {
        click(submit);
    }
    public String accessDetails() {
        return getText(Access);
    }
}

