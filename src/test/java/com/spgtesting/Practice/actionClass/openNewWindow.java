package com.spgtesting.Practice.actionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class openNewWindow {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=33");
        driver.manage().window().maximize();

        Actions act=new Actions(driver);
        //act.keyDown(Keys.CONTROL).sendKeys()
        driver.quit();


    }
}
