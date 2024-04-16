package org.example.pages.PageObjectModel;

import org.example.base.CommonToAllPage;
import org.example.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POM extends CommonToAllPage {
    WebDriver driver;

    public LoginPage_POM() {

        super();
    }
    //  Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    // Page Actions
    public String loginToVWOInvalidCreds() {
        enterInput(username, "admin");
        enterInput(password, "admin");
        clickElement(signButton);
        try{
            Thread.sleep(5000);
        }catch(Exception ex){
            ex.printStackTrace();
        }
//        presenceOfElement(error_message);
//        visibilityOfElement(error_message);
       return getElement(error_message).getText();

    }
//    public void loginToVWOValidCreds() {
//        enterInput(username, PropertyReader.readyKey("username"));
//        enterInput(password, PropertyReader.readyKey("password"));
//        clickElement(signButton);
//        // Dashboard
//    }
//
//    public DashboardPage_POM afterLoginVWOValidCreds(){
//        return new DashboardPage_POM();
//    }

}