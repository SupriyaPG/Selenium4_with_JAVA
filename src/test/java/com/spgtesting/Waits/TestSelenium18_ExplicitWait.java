package com.spgtesting.Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium18_ExplicitWait {

    @Test
    @Description("Verify VWO navigation")
    @Owner("Supriya G")
    public void loginNavigatio() {

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement emailInputBox=driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("ThisIsNotAPassword");

        WebElement buttonSubmit=driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

       // WebElement error_message=driver.findElement(By.className("notification-box-description"));
        //instead of thread we will use below code i.e. explicit wait
        //util this notification displayed or visible we have to wait for max 3 sec
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        // wait.until(ExpectedConditions.visibilityOf(error_message));
        //  OR
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        WebElement error_message=driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }
}
