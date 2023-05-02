package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest {

    public static WebDriver driver;


    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void cleanUp() {
        driver.quit();
    }

    //method to run tests
    @Test
    public void Test_1() throws InterruptedException { //To sign in
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //calling method to test from Tabs
        SignInPage signIn = new SignInPage(driver);
        signIn.performLogin("standard_user", "secret_sauce");
        Thread.sleep(3000);
    }

    @Test
    public void Test_2() throws InterruptedException { //To hover over tabs
        driver.get("https://saucelabs.com/");
        driver.manage().window().maximize();
        Tabs tabs = new Tabs(driver);
        tabs.ClickTabs("Products");
        Thread.sleep(5000);

    }

    @Test
    public void Test_3() throws InterruptedException {
        driver.get("https://saucelabs.com/");
        driver.manage().window().maximize();
        FormDemo formdemo = new FormDemo(driver);
        formdemo.ClickDemoBtn();
        Thread.sleep(5000);
        formdemo.fillForm("John", "Wick", "jwich@qac.com", "QAC", "905-828-0101");
        Thread.sleep(4000);
    }
}


