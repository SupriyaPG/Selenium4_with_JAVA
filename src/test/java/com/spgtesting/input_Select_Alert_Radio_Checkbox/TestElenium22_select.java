package com.spgtesting.input_Select_Alert_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestElenium22_select {

    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element_select=driver.findElement(By.id("dropdown"));
        Select select=new Select(element_select);
      //  select.selectByIndex(1);  //select by index
        //select.selectByVisibleText("Option 2");  //or select by text
        select.selectByValue("2");   // or by value element
        driver.quit();

    }
}
