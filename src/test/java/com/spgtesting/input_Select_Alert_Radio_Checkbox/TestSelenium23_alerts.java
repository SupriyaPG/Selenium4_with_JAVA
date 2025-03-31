package com.spgtesting.input_Select_Alert_Radio_Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TestSelenium23_alerts {

    public static void main(String[] args) {

        EdgeDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element=driver.findElement(By.cssSelector("button[onClick='jsAlert()']"));
        element.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3)) ;
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert=driver.switchTo().alert();
        alert.accept(); // If want to accept
        //alert.dismiss();  // If dont want to accept

        String result=driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");

        driver.quit();
    }
}
