package com.nidhinananu.automation.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.nidhinananu.automation.model.Pages.CartPage;
import com.nidhinananu.automation.model.Pages.HomePage;
import com.nidhinananu.automation.model.Pages.SearchResultPage;

import org.junit.jupiter.api.Test;

public class AddToCartTests extends BaseTests {

    @Test
    public void VerifyItemIsAddedToCart() throws Exception{
      HomePage homePage= new HomePage(driver);
      homePage.enterSearchText("bike");
      homePage.clickSearchButton();
      homePage.clickFirstItemFromSearchResults();
      homePage.selectColour();
      homePage.selectSize();
      SearchResultPage searchResultPage= new SearchResultPage(driver);
      searchResultPage.clickAddToCart();
      searchResultPage.clickCartIcon();
      searchResultPage.clickCartIcon();
      CartPage cartPage = new CartPage(driver);
      assertTrue(cartPage.isItemAddedToCart());
    } 
    
}
