package com.spgtesting.File_Upload;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TestSelenium34_browserStack extends TestCase_BoilerPlate {

    @Test
    @Description("Verify apk file upload on browserStack.")
    @Owner("Supriya G")
    public void test_browserStack_fileUpload(){


        driver.get("https://app-automate.browserstack.com/dashboard/v2/getting-started");
        driver.manage().window().maximize();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));

        driver.findElement(By.id("user_email_login")).sendKeys("sasd48010@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("asd@1234");

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tnc_checkbox")));
        //driver.findElement(By.id("tnc_checkbox")).click();

        driver.findElement(By.id("user_submit")).click();

        System.out.println("URL"+driver.getCurrentUrl());
        driver.get("https://app-automate.browserstack.com/dashboard/v2/getting-started");
         waitJVM(2000);
         System.out.println("URL"+driver.getCurrentUrl());
        WebElement fileUpload=driver.findElement(By.xpath("aa-app-uploader__upload-app-btn aa-app-uploader__upload-app-btn--blue"));

        String workingDIR=System.getProperty("user.dir");

        fileUpload.sendKeys(workingDIR+"src/test/java/com/spgtesting/File_Upload/testdroid-sample-app.apk");

        String code=driver.findElement(By.xpath("//span[@class='aa-app-uploader__upload-text align-self-center']")).getText();

        Assert.assertEquals(code,"bs://4be8bee783a34e42018f496380b603c48fade201");



    }
}
