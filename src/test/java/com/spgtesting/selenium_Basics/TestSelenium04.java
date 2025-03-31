package com.spgtesting.selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {

    @Owner("Supriya G")
    @Test
    @Description
    public void testBrowsers(){

        WebDriver driver=new ChromeDriver();  //parent instance we can create any browser object
        driver=new EdgeDriver();  //97% uses
        driver=new ChromeDriver(); // 97% uses

                driver.get("https://google.com");

        driver.quit();
    }
}
