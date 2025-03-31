package com.spgtesting.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class TestSelenium20_fluentWait {

    public static void main(String args[]){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement emailInputBox=driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("ThisIsNotAPassword");

        WebElement buttonSubmit=driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();


         FluentWait<WebDriver> wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        WebElement errorMsg=wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.className("notification-box-description"));
            }
        });




        driver.quit();
    }
}
