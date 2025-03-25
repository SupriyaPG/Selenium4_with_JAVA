package com.spgtesting.selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import  static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium08_Mini_Project {

    @Test
    @Description("Testing given heading is available on https://www.google.com/  page")
    public void testKatalon() throws Exception {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        if(driver.getPageSource().contains("Google")){
            System.out.println("Heading 'Google' is availabe.");
            Assert.assertTrue(true);
        }else {
            //Assert.assertTrue(false);
            // OR we can use throw Exception
            throw new Exception("Heading 'Google' is not available.");
        }

        driver.quit();

    }
}
