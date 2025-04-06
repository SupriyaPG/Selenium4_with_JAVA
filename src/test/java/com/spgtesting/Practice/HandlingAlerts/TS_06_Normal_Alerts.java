package com.spgtesting.Practice.HandlingAlerts;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TS_06_Normal_Alerts {

    @Test
    @Description("Alert 1 : Normal Alert - alert with ok button")
    @Owner("Supriya G")
    public void test_Alerts(){

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        waitJVM(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
       // driver.switchTo().alert().accept();

         //for capture alert message and accept alert
         //first store alert window in an alert variable

        Alert myalert=driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();

        driver.quit();
    }
}
