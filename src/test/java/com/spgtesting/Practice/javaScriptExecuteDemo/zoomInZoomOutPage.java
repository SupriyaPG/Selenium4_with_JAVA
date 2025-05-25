package com.spgtesting.Practice.javaScriptExecuteDemo;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class zoomInZoomOutPage {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver=new EdgeDriver();

        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        //Scroll to the end of the page
        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(2000);

        js.executeScript("document.body.style.zoom='80%'");
        Thread.sleep(2000);

        js.executeScript("document.body.style.zoom='100%'");

        driver.quit();
    }
}
