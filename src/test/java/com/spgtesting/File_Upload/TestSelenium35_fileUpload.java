package com.spgtesting.File_Upload;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TestSelenium35_fileUpload extends TestCase_BoilerPlate {

    @Test
    @Description("Verify file uploading.")
    @Owner("Supriya G")
    public void test_fileUpload(){

       driver.get("https://awesomeqa.com/selenium/upload.html");
       driver.manage().window().maximize();

        WebElement fileUpload=driver.findElement(By.id("fileToUpload"));

        String  currentDir=System.getProperty("user.dir");
        System.out.println(currentDir);
        //C:\Users\Win\IdeaProjects\Selenium_Basics
        waitJVM(2000);

        fileUpload.sendKeys(currentDir+"/src/test/java/com/spgtesting/File_Upload/testData.txt");
        driver.findElement(By.name("submit")).click();


    }
}
