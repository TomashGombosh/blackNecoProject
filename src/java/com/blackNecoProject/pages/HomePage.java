package com.blackNecoProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By homePageUserName = By.xpath("//table//tr[@class='heading3']");

    public HomePage(WebDriver driver){
        super(driver);
    }

    //Get the User name from Home Page
    public String getHomePageDashboardUserName(){
        return getText(homePageUserName);
    }
}
