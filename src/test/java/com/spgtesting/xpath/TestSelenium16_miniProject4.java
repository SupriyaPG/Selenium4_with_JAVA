package com.spgtesting.xpath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium16_miniProject4 {

    @Owner("Supriya G")
    @Test
    @Description("Verify free trial button with wrong email and verify error message.")
    public  void test_errorMsg() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.addArguments("--start-Maximized");

      WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeAppointment_btn=driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        makeAppointment_btn.click();

        //By using findE    lement
        WebElement username_textbox=driver.findElement(By.xpath("//input[@name='username']"));
        username_textbox.sendKeys("John Doe");


        //By using findElements
        WebElement password_textbox=driver.findElement(By.xpath("//input[@name='password']"));
        password_textbox.sendKeys("ThisIsNotAPassword");

        WebElement login_btn=driver.findElement(By.xpath("//button[@id=\'btn-login\']"));
        login_btn.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();
    }
}
