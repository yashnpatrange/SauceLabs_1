package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends AbstractPage {

    //calling constructor from parent AbstractPage class
    protected SignInPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    static final String LoginBtn = "//input[@id='login-button']";


    //Objects
    @FindBy(id="user-name")
    private WebElement username;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(how = How.XPATH, using = LoginBtn)
    private WebElement logInBtn;


    //methods to perform login action
    public void performLogin(String uname, String paswd){
        username.sendKeys(uname);
        password.sendKeys(paswd);
        logInBtn.click();
    }

}
