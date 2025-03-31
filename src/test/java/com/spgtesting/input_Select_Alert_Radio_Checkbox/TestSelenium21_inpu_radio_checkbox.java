package com.spgtesting.input_Select_Alert_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestSelenium21_inpu_radio_checkbox {

    public static void main(String[] args) {

        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://awesomeqa.com/practice.html");

        edgeDriver.findElement(By.name("firstname")).sendKeys("SG Testing");

        //Radio Box
        edgeDriver.findElement(By.id("sex-1")).click();

        //checkbox
        edgeDriver.findElement(By.id("profession-1"));

        edgeDriver.quit();

    }
}
