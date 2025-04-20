package com.spgtesting.Practice.WebTable.StaticTable;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_18_aallData {

    WebDriver driver=new EdgeDriver();

    @BeforeTest
    public void openBrowser(){
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }


    @Test
    @Description("find all data from all rows and cols")
    @Owner("Supriya G")
    public void test_staticTable(){

         int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of rows:"+rows);

        int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of columns:"+cols);


        System.out.println("BookName"+"\t"+"|"+"Auther"+"\t"+"|"+"Subject"+"\t"+"|"+"Price");
        for (int r=2;r<rows;r++)
        {
            for(int c=1;c<=cols;c++)
            {
                String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(value+"\t" + "|");
            }
            System.out.println();
        }



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
