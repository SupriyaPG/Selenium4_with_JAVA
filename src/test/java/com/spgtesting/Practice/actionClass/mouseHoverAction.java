package com.spgtesting.Practice.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class mouseHoverAction {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");

        WebElement contact = driver.findElement(By.xpath("//a[normalize-space()='Contact']"));

        Actions act = new Actions(driver);
        //mouse Hover action
        act.moveToElement(contact).build().perform();

        driver.quit();
    }
}
