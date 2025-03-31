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

import java.util.List;

public class TestSlenium15_miniProject3 {

    @Owner("Supriya G")
    @Test
    @Description("Verify free trial button with wrong email and verify error message.")
    public  void test_errorMsg() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();;
        edgeOptions.addArguments("--start-Maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement tag_free_tril_partialMatch=driver.findElement(By.partialLinkText("Start")); //here we can use any combination of words within the string
        tag_free_tril_partialMatch.click();

        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email=driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement chkboxpol_policy=driver.findElement(By.name("gdpr_consent_checkbox"));
        chkboxpol_policy.click();

        List<WebElement> buttonList=driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errorMsg=driver.findElement(By.className("invalid-reason"));
        Assert.assertTrue(errorMsg.isDisplayed());
        Assert.assertEquals(errorMsg.getText(),"The email address you entered is incorrect.");

        driver.quit();

    }
}
