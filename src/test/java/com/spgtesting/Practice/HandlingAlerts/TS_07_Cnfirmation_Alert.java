package com.spgtesting.Practice.HandlingAlerts;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TS_07_Cnfirmation_Alert {

    @Test
    @Owner("Supriya G")
    @Description("Alert 2 : Confirmation alert - click on OK or Cancel")
    public void test_confirmationAlert(){

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        waitJVM(2000);

         driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        waitJVM(2000);
        //driver.switchTo().alert().accept();  //close alert using ok button
        driver.switchTo().alert().dismiss();  //close alert using cancel btuton
        waitJVM(2000);
        String alertMessage=driver.findElement(By.xpath("//p[@id='result']")).getText();
        waitJVM(2000);
        Assert.assertEquals(alertMessage,"You clicked: Cancel");

        driver.quit();

    }
}
