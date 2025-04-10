package com.spgtesting;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_BoilerPlate {

    //public WebDriver driver;
    public  EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--gest");
        driver =new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
       // driver=new ChromeDriver(edgeOptions);
    }

    @Test
    @Description("")
    @Owner("Supriya G")
    public void test_actionClass(){

    }


    @AfterTest
    public void closeBrowser(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
