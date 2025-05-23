package com.spgtesting.Practice.javaScriptExecuteDemo.ScrollingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class scrollPageTillEndOfTheDocument {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new EdgeDriver();

        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor) driver;

        //Scroll to the end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        Thread.sleep(3000);

        //scroll to the initial page
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

        driver.quit();

    }
}
