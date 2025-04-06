package com.spgtesting.Practice.HandlingAlerts;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TS_09_by_using_axplicit_wait {

    @Test
    @Description("Handling alert with explicit wait" +
            "")
    @Owner("Supriya G")
    public void testCheckbox(){

        WebDriver driver=new EdgeDriver();
        //Explicit wait declaration
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        waitJVM(1000);
        Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());

        System.out.println(myalert.getText());
        myalert.accept();

        driver.quit();

    }
}
