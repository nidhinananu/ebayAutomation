package com.nidhinananu.automation.tests;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTests {

    protected WebDriver driver;

    @BeforeEach
    public void setup(){
        //System.setProperty("chromedriver.exe", "");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.ebay.com.au/");
    }

    @AfterEach
    public void shutdown()
    {
        driver.close();
    }
    
}
