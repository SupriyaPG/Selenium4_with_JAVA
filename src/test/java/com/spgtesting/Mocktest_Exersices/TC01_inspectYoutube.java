package com.spgtesting.Mocktest_Exersices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC01_inspectYoutube {

    @Test
    public void testYoutube()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        WebElement serach=driver.findElement(By.xpath("//input[@name='search_query']"));
        serach.sendKeys("rd automation learning");

        driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();

        driver.quit();
    }
}
