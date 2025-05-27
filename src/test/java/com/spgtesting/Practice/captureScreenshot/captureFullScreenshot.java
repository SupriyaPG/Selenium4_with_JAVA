package com.spgtesting.Practice.captureScreenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.time.Duration;

public class captureFullScreenshot {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        TakesScreenshot ts=(TakesScreenshot)driver;

        File sourcefile=ts.getScreenshotAs(OutputType.FILE);

        File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");

        sourcefile.renameTo(targetFile); //copy sourcefile to target file

        driver.quit();

    }
}
