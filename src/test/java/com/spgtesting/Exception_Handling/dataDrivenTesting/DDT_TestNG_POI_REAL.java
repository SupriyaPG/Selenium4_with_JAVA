package com.spgtesting.Exception_Handling.dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DDT_TestNG_POI_REAL {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        driver =new EdgeDriver(edgeOptions);

    }

    @Test(dataProvider = "getData")
    public void test_DDT_VWO_Login(String email,String password){

        System.out.println(email+" - "+password);


        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        WebElement emailInputBox=driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys(password);

        WebElement buttonSubmit=driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        WebElement error_message=driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
          new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin123@gmail.com","pass123"},
                new  Object[]{"admin123@gmail.com","pass124"}
        };
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
