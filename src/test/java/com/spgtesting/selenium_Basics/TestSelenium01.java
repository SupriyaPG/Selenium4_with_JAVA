package com.spgtesting.selenium_Basics;

import io.qameta.allure.Owner;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Owner("Supriya G")
    @Test
    public void test_verifyVWOLogin()
    {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }

}
