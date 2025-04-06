package com.spgtesting.Practice.Handling_Frames;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TS_11_switchingFrame {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver=new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();

    }

    @Test
    @Description("Switching frame and entering value in respective textboxes.")
    @Owner("Supriya G")
    public void test_Frames(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
        driver.get("https://ui.vision/demo/webtest/frames/");


        //Frame 1
        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");

        driver.switchTo().defaultContent();  // go back to main page

        //Frame 2
        WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");

        driver.switchTo().defaultContent();

        //Frame 3
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");

       // inner iframe - part of frame 3
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//span[normalize-space()='I am a human']")).click();
        driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']")).click();

        driver.switchTo().defaultContent();

        //frame 5
        WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);
        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Python");
        driver.findElement(By.xpath("//a[@href='https://a9t9.com']")).click();

        //iframe
        WebElement iframe=driver.findElement(By.xpath("//iframe[@allow='join-ad-interest-group']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//html")).isDisplayed();


        driver.switchTo().defaultContent();
    }

    @AfterTest
    public void closeBrowser(){

        driver.quit();
    }

}

