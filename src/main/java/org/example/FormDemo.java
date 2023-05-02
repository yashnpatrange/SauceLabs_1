package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class FormDemo extends AbstractPage{
    //calling constructor from parent AbstractPage class
    protected FormDemo(WebDriver driver) {
        super(driver);
    }
    //Locators
    static final String DemoBtn= "//a[@href='/request-demo']//parent::button";
    static final String Country= "//select[@id='Country']";
    static final String Interest= "//select[@id='Product_Interest__c']";
    static final String CheckBox="//label[@id='LblmktoCheckbox_35472_0']";
    static final String SubmitBtn="//button[contains(text(),'Submit')]";

    //Objects
    @FindBy(how= How.XPATH, using = DemoBtn)
    private WebElement demoBtn;
    @FindBy(id="FirstName")
    private WebElement firstName;
    @FindBy(id="LastName")
    private WebElement lastName;
    @FindBy(id="Email")
    private WebElement email;
    @FindBy(id="Company")
    private WebElement company;
    @FindBy(how= How.XPATH, using = Country)
    private WebElement country;
    @FindBy(id="Phone")
    private WebElement phone;
    @FindBy(how= How.XPATH, using = Interest)
    private WebElement interest;
    @FindBy(how= How.XPATH, using = CheckBox)
    private WebElement checkbox;
    @FindBy(how= How.XPATH, using = SubmitBtn)
    private WebElement submitBtn;


    //methods to perform actions
    public void ClickDemoBtn(){
        demoBtn.click();
    }

    public void fillForm(String fname,String lname, String e_mail, String compName, String phoneNum) throws InterruptedException {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        email.sendKeys(e_mail);
        company.sendKeys(compName);
        Select dropdown= new Select(country);
        dropdown.selectByValue("Canada");
        phone.sendKeys(phoneNum);
        Select dropdown1= new Select(interest);
        dropdown1.selectByValue("Mobile App Testing");
        //checkbox.click();
        submitBtn.click();

    }

}
