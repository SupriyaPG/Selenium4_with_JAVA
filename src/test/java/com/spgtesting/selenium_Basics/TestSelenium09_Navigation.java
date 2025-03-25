package com.spgtesting.selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium09_Navigation {

    @Test
    @Description("Verify google navigation functionality")
    public void testGoogle_Navigation() throws  Exception{

        WebDriver driver=new EdgeDriver();
        driver.get("https://google.com");
        Thread.sleep(3000);  // to hold so that we can see
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().forward();

        Thread.sleep(4000);

        driver.quit();


    }
}
