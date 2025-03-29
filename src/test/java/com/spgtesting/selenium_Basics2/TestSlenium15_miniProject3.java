package com.spgtesting.selenium_Basics2;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSlenium15_miniProject3 {

    @Owner("Supriya")
    @Test
    @Description("open url")
    public  void test_errorMsg() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();;
        edgeOptions.addArguments("--start-Maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement tag_free_tril_partialMatch=driver.findElement(By.partialLinkText("Start")); //here we can use any combination of words within the string
        tag_free_tril_partialMatch.click();

        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        driver.quit();

    }
}
