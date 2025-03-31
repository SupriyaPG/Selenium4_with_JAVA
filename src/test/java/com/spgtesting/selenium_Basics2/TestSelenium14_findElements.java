package com.spgtesting.selenium_Basics2;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium14_findElements {

    @Owner("Supriya G")
    @Test
    @Description("Verify VWO")
    public void test_login_VWO(){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        //find element By.linkTest
        //WebElement a_tag_free_trail_full_match = driver.findElement(By.linkText("Start a free trial"));
        //a_tag_free_trail_full_match.click();


        //Find element By.partialLinkText
        WebElement tag_free_tril_partialMatch=driver.findElement(By.partialLinkText("Start")); //here we can use any combination of words within the string
        tag_free_tril_partialMatch.click();

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw  new RuntimeException(e);
        }

        driver.quit();

    }
}
