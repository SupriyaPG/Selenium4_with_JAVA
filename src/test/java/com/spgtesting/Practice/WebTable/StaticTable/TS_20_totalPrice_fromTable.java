package com.spgtesting.Practice.WebTable.StaticTable;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_20_totalPrice_fromTable {

    WebDriver driver=new EdgeDriver();

    @BeforeTest
    public void openBrowser(){
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }


    @Test
    @Description("find total price of all books")
    @Owner("Supriya G")
    public void test_staticTable(){

        int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of rows:"+rows);

        int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of columns:"+cols);

        int total=0;
        for (int r=2;r<=rows;r++)
        {
                String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
                System.out.println(price+"\t" );
                total=total+Integer.parseInt(price);
        }

        System.out.println("Total Price:"+total);

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
