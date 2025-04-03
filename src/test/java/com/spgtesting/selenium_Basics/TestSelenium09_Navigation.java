package com.spgtesting.selenium_Basics;

import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium09_Navigation {

    @Owner("Supriya G")
    @Test
    @Description("Verify google navigation functionality")
    public void testGoogle_Navigation() throws  Exception{

        WebDriver driver=new EdgeDriver();

        driver.navigate().to("https://google.com");
        driver.manage().window().maximize();
        driver.navigate().to("https://bing.com");
        Thread.sleep(3000);  // to hold so that we can see
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.quit();
    }
}
