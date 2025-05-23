package com.spgtesting.Practice.javaScriptExecuteDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class javaScriptExecuterDemo {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        //ChromeDriver driver1=new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement inputbox=driver.findElement(By.xpath("//input[@  id='name']"));

        //passing the text into inputbox  - alternate of sendkeys()
        JavascriptExecutor js=(JavascriptExecutor) driver;  //JavascriptExecutor js=driver;
        js.executeScript("arguments[0].setAttribute('value','John')",inputbox);

       WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()",radiobtn);

    driver.quit();
    }
}
