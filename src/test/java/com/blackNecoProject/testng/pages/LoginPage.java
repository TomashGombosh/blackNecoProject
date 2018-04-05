package com.blackNecoProject.testng.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {
    private By user99GuruName = By.name("uid");
    private By password99Guru = By.name("password");
    private By titleText = By.className("barone");
    private By login = By.name("btnLogin");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public String getLoginTitle(){
        return getText(titleText);
    }

    public void loginToGuru99(String userName, String passWord){
        enterText(user99GuruName, userName);
        enterText(password99Guru, passWord);
        click(login);
    }
}
