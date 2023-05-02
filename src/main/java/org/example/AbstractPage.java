package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    protected WebDriver driver;

    //Constructor of Abstract class (Super)
    protected AbstractPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

}
