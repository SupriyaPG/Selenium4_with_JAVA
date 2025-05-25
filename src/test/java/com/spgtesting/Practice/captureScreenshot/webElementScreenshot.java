package com.spgtesting.Practice.captureScreenshot;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.time.Duration;

public class webElementScreenshot {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourcefile=featuredProducts.getScreenshotAs(OutputType.FILE);
        File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\featueredproducts.png");

        sourcefile.renameTo(targetFile); //copy sourcefile to target file

        driver.quit();
    }
}
