package com.spgtesting.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickAction {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();

        driver.switchTo().frame("iframeResult");

        WebElement field1=driver.findElement(By.id("field1"));
        WebElement field2=driver.findElement(By.id("field2"));
        WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        field1.clear();
        field1.sendKeys("Welcome");

        Actions act=new Actions(driver);
        //double click action
        act.doubleClick(button).build().perform();

        //validating copy contains
        String s1=field1.getAttribute("value");
        String s2=field2.getAttribute("value");

        System.out.println(s1);
        System.out.println(s2);


        if(s1.equals(s2))
        {
            System.out.println("Text copied successfully!");
        }
        else
            System.out.println("Not copied!");

        driver.quit();

    }
}
