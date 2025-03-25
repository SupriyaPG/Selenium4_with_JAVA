package com.spgtesting.selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.testng.TestInstanceParameter;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Test
    @Description
    public void testVWO_login(){
        //open URL
        EdgeDriver driver=new EdgeDriver();
        //new Edgedriver(); --> Post request (Browser Driver)

        // navigate the URL --> get the URL
        driver.get("https://app.vwo.com");

        //Assert the URL
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
