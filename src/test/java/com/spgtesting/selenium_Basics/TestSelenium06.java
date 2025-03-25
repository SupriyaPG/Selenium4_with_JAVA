package com.spgtesting.selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium06 {

    @Test
    public void testGoogle_MinMax(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://google.com");

        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.quit();

    }
}
