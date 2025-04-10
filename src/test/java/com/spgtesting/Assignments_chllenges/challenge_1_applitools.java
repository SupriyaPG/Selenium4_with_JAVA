package com.spgtesting.Assignments_chllenges;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class challenge_1_applitools {

    @Test
    @Description("Calculate the Total Amount of Money Spent ")
    @Owner("Supriya G")
    public void test_applitools(){

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get(" https://demo.applitools.com");

        driver.findElement(By.id("username")).sendKeys("Admin");
        driver.findElement(By.id("password")).sendKeys("Password@123");
        driver.findElement(By.id("log-in")).click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.applitools.com/app.html");

        List<WebElement> amount=driver.findElements(By.xpath("//td[last()]"));
        double totalamount=0.0;

        for (WebElement amt:amount)
        {
            String actualAmt = amt.getText().replace("+", "").replace("USD", "").replace(",","").replace("-","").trim();
            System.out.println(actualAmt);
            double doubleAmt=Double.parseDouble(actualAmt);
            totalamount +=doubleAmt;
        }

        System.out.println("Total spending : "+totalamount);

        Assert.assertEquals(totalamount,"1996.22","Total amount mismatched");

        driver.quit();
    }
}
