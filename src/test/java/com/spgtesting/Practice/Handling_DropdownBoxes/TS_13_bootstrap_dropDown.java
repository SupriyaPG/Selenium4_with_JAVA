package com.spgtesting.Practice.Handling_DropdownBoxes;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class TS_13_bootstrap_dropDown {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver=new EdgeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
    }

    @Test
    @Description("Select element from bootstrap dropdown.")
    @Owner("Supriya G")
    public void test_bootstrap_dropDown(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); //opens dropdown options

        // Select single option
        driver.findElement(By.xpath("//input[@value='jQuery']")).click();

        //capture all options and find the size
        List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println("Number of options:"+options.size());

        // printing options from dropdown
//        for (WebElement option:options){
//            System.out.println(option.getText());
//        }

        //Selecting multiple options
        for (WebElement op:options)
        {
            String option=op.getText();

            if(option.equals("Java") || option.equals("Python") || option.equals("MySQL"))
            {
                op.click();
            }
        }

    }

    @AfterTest
    public void closeBrowser(){

        driver.quit();
    }
}
