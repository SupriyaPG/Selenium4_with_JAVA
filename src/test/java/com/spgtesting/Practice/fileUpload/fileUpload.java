package com.spgtesting.Practice.fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class fileUpload {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        driver.findElement(By.id("filesToUpload")).sendKeys("D:\\SW Testing\\text1.txt");

        if(driver.findElement(By.xpath("//ul[@id='fileList']// li")).getText().equals("text1.txt"))
        {
            System.out.println("File upload successfully.");
        }

        driver.quit();

    }
}
