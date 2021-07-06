package com.nidhinananu.automation.tests;

import com.nidhinananu.automation.model.Pages.HomePage;

import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTests{

    @Test
    public void VerifyInvalidLogin(){

        HomePage homePage = new HomePage(driver);
        homePage.clickMyEbay();
        //Unable to proceed due to the captcha in UI
      
    } 
    
}
