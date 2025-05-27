package com.spgtesting.Practice.captureScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.time.Duration;

public class capltureLogoScreenshot {
    public static void main(String[] args) {


        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourcefile=logo.getScreenshotAs(OutputType.FILE);
        File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");

        sourcefile.renameTo(targetFile); //copy sourcefile to target file

        driver.quit();
    }
}
