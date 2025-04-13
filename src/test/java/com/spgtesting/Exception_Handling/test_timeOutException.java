package com.spgtesting.Exception_Handling;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class test_timeOutException extends TestCase_BoilerPlate {

    @Test
    @Description
    @Owner("Supriya G")
    public void test_TimeOut_Exception(){

        System.out.println("Start of the program.");

       driver.get("https://google.com");

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));

        WebElement search_inputbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_inputbox.sendKeys("the testing academy");


        System.out.println("End og the program");

    }
}
