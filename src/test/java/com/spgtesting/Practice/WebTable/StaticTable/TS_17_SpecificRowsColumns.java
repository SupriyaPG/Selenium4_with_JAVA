package com.spgtesting.Practice.WebTable.StaticTable;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_17_SpecificRowsColumns {
    WebDriver driver=new EdgeDriver();

    @BeforeTest
    public void openBrowser(){
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }


    @Test
    @Description("find specific row and column")
    @Owner("Supriya G")
    public void test_staticTable(){

        String bookName=driver.findElement(By.xpath("//table [@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(bookName);


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
