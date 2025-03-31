package com.spgtesting.selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TestSelenium07 {

    @Owner("Supriya G")
    @Test
    @Description("Verifying google title")
    public  void testGoogle_assertion(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://google.com");

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
        //aaserj used for validationC
      assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

      driver.quit();

    }
}
