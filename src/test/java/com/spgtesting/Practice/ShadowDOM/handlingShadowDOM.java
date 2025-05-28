package com.spgtesting.Practice.ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class handlingShadowDOM {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new EdgeDriver();

        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

//        driver.findElement(By.cssSelector("#input")).sendKeys("Welcome");  //throws NoSuchElementException

        // So have to handle with shadow DOM
        SearchContext shadow=driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome");
    }
}
