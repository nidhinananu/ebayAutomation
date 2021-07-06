package com.nidhinananu.automation.model.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private By shoppingcartHeader = By.xpath("//h1[@class='main-title' and starts-with(text(), 'Shopping cart')]");

    public CartPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    public boolean isItemAddedToCart()
    {
    try{
            if(driver.findElement(shoppingcartHeader).getText().contains("1 item"))
        {
            return true;
        }
        else{
            return false;
        }
            
    }
    catch(NoSuchElementException e)
    {
        return false;
    }

    }
    
}
