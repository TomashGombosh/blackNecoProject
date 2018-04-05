package com.blackNecoProject.testng.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage extends BasePage {
    private By emailId = By.name("emailid");
    private By here = By.xpath(".//body/div/ol/li/a");
    private By visit = By.cssSelector("html body div ol li");
    private By submit = By.name("btnLogin");
    private By Access = By.xpath(".//table");
    //private Config config;

    public MailPage(WebDriver driver){
        super(driver);
    }

    public void clickHere(){
        click(here);
    }

    public void setEmail(String email){
        enterText(emailId, email);
    }

    public String getVisitText(){
        return getText(visit);
    }

    public void clickEmailIdSubmit(){
        click(submit);
    }

    public String getAccessDetailsText(){
        return getText(Access);
    }
}

