package com.spgtesting.selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium05
{

    @Owner("Supriya G")
    @Test
    @Description
    public void testGoogle_getTitle(){

        WebDriver driver=new EdgeDriver();
         driver.get("https://google.com");

         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());
         System.out.println(driver.getPageSource());

        driver.quit();
    }
}
