package com.nidhinananu.automation.model.Pages;

import java.util.List;


import javax.lang.model.util.ElementScanner14;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

    private By txtSearch= By.xpath("//input[@aria-label='Search for anything']");
    private By btnSearch= By.xpath("//input[@type='submit' and @value='Search']");
    private By searchResults = By.xpath("//ul[@class='srp-results srp-list clearfix']//li[starts-with(@class, 's-item')]");
    private By resultImage= By.xpath("//img[@class='s-item__image-img']");
    private By ddColour = By.xpath("//div[@id='mainContent' and @aria-labelledby='itemInfoLabel']//select[@name='Colour']");
    private By ddSize =  By.xpath("//div[@id='mainContent' and @aria-labelledby='itemInfoLabel']//select[contains(@name, 'Size')]");
    private By btnMyEbay= By.xpath("//a[@title='My eBay']");
    
    public HomePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    public void enterSearchText(String searchText)
    {
        driver.findElement(txtSearch).sendKeys(searchText);
    }

    public void clickSearchButton()
    {
        driver.findElement(btnSearch).click();
    }

    public List<WebElement> getSearchReults()
    {
        List<WebElement> searchResultList = driver.findElements(searchResults);
        return searchResultList;
    }

    public void clickFirstItemFromSearchResults() throws Exception
    {
        List<WebElement> listOfItems = getSearchReults();
        if(listOfItems!=null)
        {
            getSearchReults().get(0).findElement(resultImage).click();
        }
        else{
            
            throw new Exception("Search criteria entered doesnt have any results");
        }
       
    }

    public boolean verifyIfColourSelectionRequired()
    {
        try{

            if(driver.findElement(ddColour).isDisplayed())
            {
                return true;
            }
            else
              return false;


        }
        catch(NoSuchElementException e)
        {
            return false;
        }
        
        
    }

    public boolean verifyIfSizeSelectionRequired()
    {
        try{

            if(driver.findElement(ddSize).isDisplayed())
            {
                return true;
            }
            else
              return false;

        }
        catch(NoSuchElementException e)
        {
            return false;
        }
               
        
    }

    public void selectColour()
    {
        if(verifyIfColourSelectionRequired())
        {
            Select colour= new Select(driver.findElement(ddColour));
            colour.selectByIndex(1);
        }
        else
         return;
       
    }

    public void selectSize()
    {
        if(verifyIfSizeSelectionRequired())
        {
            Select colour= new Select(driver.findElement(ddSize));
            colour.selectByIndex(1);
        }
        else
        return;
       
           
    }
    public void clickMyEbay() {

        driver.findElement(btnMyEbay).click();
    }
    


}
