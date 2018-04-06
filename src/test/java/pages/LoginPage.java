package pages;

import org.openqa.selenium.Alert;
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

    //Set user name in textbox
    public void setUserName(String strUserName){
        enterText(user99GuruName, strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword){
        enterText(password99Guru, strPassword);
    }

    //Click on login button
    public void clickLogin(){
        click(login);
    }

    //Get the title of Login Page
    public String getLoginTitle(){
        return getText(titleText);
    }
    public void alere() throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        alert.accept();
    }
    /**
     * This POM method will be exposed in test case to login in the application
     *
     * @param strUserName
     * @param strPasword
     * @return
     */
    public void loginToGuru99(String strUserName, String strPasword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();

    }
}
