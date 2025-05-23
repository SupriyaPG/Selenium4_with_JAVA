package com.spgtesting.Practice.javaScriptExecuteDemo.ScrollingPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scrollingPageByPixelNumber {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();

        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        //Scroll down the page by pixel number
        js.executeScript("window.scrollBy(0,2000)","");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        driver.quit();
    }
}
