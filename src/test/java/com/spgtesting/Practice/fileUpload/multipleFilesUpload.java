package com.spgtesting.Practice.fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class multipleFilesUpload {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        String file1="D:\\SW Testing\\text1.txt";
        String file2="D:\\SW Testing\\text2.txt";
        driver.findElement(By.id("filesToUpload")).sendKeys(file1+"\n"+file2);

        int noOfFiles=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

        //validating by no. of files
        if(noOfFiles==2)
        {
            System.out.println("All Files are uploaded successfully.");
        }
        else {
            System.out.println("File uploading fails.");
        }

        //validating by file names
        if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("text1.txt") && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("text2.txt"))
        {
            System.out.println("File names are matching.");
        }
        driver.quit();
    }
}
