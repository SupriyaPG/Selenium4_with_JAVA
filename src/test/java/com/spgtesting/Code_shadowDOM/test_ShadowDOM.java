package com.spgtesting.Code_shadowDOM;

import com.spgtesting.TestCase_BoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test_ShadowDOM extends TestCase_BoilerPlate {

    public void testShadowDOM(){

    driver.get("https://selectorshub.com/xpath-practice-page/");
    driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement div_to_scroll=driver.findElement(By.xpath("//div[@id='userName"));

        WebElement pizza=driver.findElement(By.id("pizza"));
        pizza.sendKeys("farmhouse");

    }

}
