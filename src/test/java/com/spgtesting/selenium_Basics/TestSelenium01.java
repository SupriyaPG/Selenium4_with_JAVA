package com.spgtesting.selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_verifyVWOLogin()
    {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }

}
