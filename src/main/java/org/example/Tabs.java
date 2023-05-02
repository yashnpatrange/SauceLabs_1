package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Tabs extends AbstractPage {

    //calling constructor from parent AbstractPage class
    protected Tabs(WebDriver driver) {
        super(driver);
    }

    //Locators
    static final String DeveloperTab = "//a[@href='/developers']";
    static final String PricingTab = "//a[@href='/pricing']";
    static final String EnterpriseTab = "//a[@href='/enterprise']";
    static final String PlayVideo = "//*[@data-testid='PlayArrowIcon']//parent::button";

    //Objects
    @FindBy(how = How.XPATH, using = DeveloperTab)
    private WebElement developerTab;
    @FindBy(how = How.XPATH, using = PricingTab)
    private WebElement pricingTab;
    @FindBy(how = How.XPATH, using = EnterpriseTab)
    private WebElement enterpriseTab;
    @FindBy(how = How.XPATH, using = PlayVideo)
    private WebElement playVideo;

    //methods to perform actions
    public String ClickTabs(String tabName) throws InterruptedException {
        // Pull out the options as web elements
        List<WebElement> matches = driver.findElements(By.xpath("//div[@class='css-e3zn88']"));
        // Traverse the web elements to extract the particular element
        for (WebElement ele : matches) {
            if (tabName == "Products") {
                WebElement hoverElement= driver.findElement(By.xpath("//span[text()='Products']"));
                Actions actions= new Actions(driver);
                actions.moveToElement(hoverElement).build().perform();
                Thread.sleep(2000);
                WebElement option= driver.findElement(By.xpath("//a[@href='/products/cross-browser-testing']"));
                option.click();
            }
            else if (tabName == "Developer") {
                developerTab.click();
//                driver.switchTo().frame(0);
//                playVideo.click();
            }
            else if(tabName=="Pricing"){
                pricingTab.click();
            }
            else if(tabName=="Enterprise"){
                enterpriseTab.click();
            }
            else if (tabName == "Resources") {
                WebElement hoverElement1= driver.findElement(By.xpath("//span[text()='Resources']"));
                Actions actions1= new Actions(driver);
                actions1.moveToElement(hoverElement1).build().perform();
                Thread.sleep(2000);
                WebElement option1= driver.findElement(By.xpath("//a[@href='/resources/blog']"));
                option1.click();
            }
        }
        return tabName;

    }

}



