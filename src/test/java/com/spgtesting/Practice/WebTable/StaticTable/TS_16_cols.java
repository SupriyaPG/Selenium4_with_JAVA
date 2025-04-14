package com.spgtesting.Practice.WebTable.StaticTable;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_16_cols{
    WebDriver driver=new EdgeDriver();

    @BeforeTest
    public void openBrowser(){
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }


    @Test
    @Description("find total number of columns")
    @Owner("Supriya G")
    public void test_staticTable_cols(){

        int cols1=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();  //for single  tables
        System.out.println("Number of columns:"+cols1);

        int cols=driver.findElements(By.tagName("td")).size();  //when multiple table
        System.out.println("Number of columns:"+cols);


         }

    @AfterTest
    public void closeBrowser(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
