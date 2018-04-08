package com.blackNecoProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage extends BasePage {
    private By NewCustomer =By.linkText("New Customer");
    private By FormCustomer=By.name("addcust");
    private By Name =By.name("name");
    private By Gender =By.name("rad1");
    private By Birth =By.name("dob");
    private By Address=By.name("addr");
    private By City =By.name("city");
    private By State =By.name("state");
    private By Pin =By.name("pinno");
    private By Telephone=By.name("telephoneno");
    private By EmailCustomer=By.name("emailid");
    private By PasswordCustomer=By.name("password");
    private By SubmitCustomer=By.name("sub");
    private By FormRegist=By.name("regmsg");

        public NewCustomerPage(WebDriver driver){
        super(driver);
    }

    public void enterNewCustomer(){
        click(NewCustomer);
    }

        public By FormCustomer() {
        return (FormCustomer);
    }

        public void fullFormNewCustomer(){
        enterText(Name,"Fedir");
        //click(Gender);
        setBirth(Birth,"02101996");
        enterText(Address,"Lukasha 4");
        enterText(City,"Lviv");
        enterText(State,"Ukraine");
        enterText(Pin,"903000");
        enterText(Telephone,"380991014586");
        enterText(EmailCustomer,"bedove69@meta.ua");
        enterText(PasswordCustomer,"1234");
        click(SubmitCustomer);
    }
        public By getFormRegist() {
        return FormRegist;
    }
}


