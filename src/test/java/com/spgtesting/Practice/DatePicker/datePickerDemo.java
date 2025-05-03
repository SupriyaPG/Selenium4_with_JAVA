package com.spgtesting.Practice.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class datePickerDemo {

    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

        // input DOB
        String requiredYear="2025";
        String  requiredMonth="May";
        String requiredDate="04";

       // driver.switchTo().frame("frame-one796456169");

        //Method 1 By using send keys
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2025");

        //Method 2 By using date picker
        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //open date picker




        //driver.quit();
    }
}
