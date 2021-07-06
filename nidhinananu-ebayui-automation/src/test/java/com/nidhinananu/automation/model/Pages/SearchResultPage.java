package com.nidhinananu.automation.model.Pages;

import javax.lang.model.util.ElementScanner14;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage {

    private By btnAddToCart = By.xpath("//a[@role='button' and contains(text(),'Add to cart')]");
    private By protectionPlanPopup = By.xpath("//div[@class='oly_container']");
    private By btnNoThanks = By.xpath("//div[@class='oly_container']//button[text()='No thanks']");
    private By btnCartIcon = By.xpath("//*[@class='gh-cart-icon']//parent::a");
    

    public SearchResultPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    public void clickAddToCart()
    {
        driver.findElement(btnAddToCart).click();
        if(driver.findElement(protectionPlanPopup).isDisplayed())
        {
            driver.findElement(btnNoThanks).click();
        }
    }

    public void clickCartIcon() {

        driver.findElement(btnCartIcon).click();
    }

   
    
}
