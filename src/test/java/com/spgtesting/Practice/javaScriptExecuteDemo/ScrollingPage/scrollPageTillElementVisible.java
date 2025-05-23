package com.spgtesting.Practice.javaScriptExecuteDemo.ScrollingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class scrollPageTillElementVisible {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();

        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement ele=driver.findElement(By.xpath("//div[normalize-space()='Read next']"));
        js.executeScript("arguments[0].scrollIntoView()",ele);
        System.out.println(js.executeScript("return window.pageYOffset;"));

        driver.quit();
    }
}
