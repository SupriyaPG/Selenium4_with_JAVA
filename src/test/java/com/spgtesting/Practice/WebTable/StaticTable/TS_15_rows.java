package com.spgtesting.Practice.WebTable.StaticTable;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_15_rows {

    WebDriver driver=new EdgeDriver();

    @BeforeTest
    public void openBrowser(){
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }


    @Test
    @Description("find total number of rows")
    @Owner("Supriya G")
    public void test_staticTable(){

        int rows=driver.findElements(By.tagName("tr")).size();  //when  multiple table
        System.out.println("Number of rows:"+rows);

        int rows1=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //single  table
        System.out.println("Number of rows:"+rows1);

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
