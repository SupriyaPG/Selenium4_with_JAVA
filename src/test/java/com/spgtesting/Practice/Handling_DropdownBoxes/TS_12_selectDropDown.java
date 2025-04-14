package com.spgtesting.Practice.Handling_DropdownBoxes;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TS_12_selectDropDown {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver=new EdgeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

    }

    @Owner("Supriya G")
    @Test
    @Description("Handling select dropdown box")
    public void test_selectDropDown(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement dropDownElement=driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCountry=new Select(dropDownElement);

        //select option from the drop-down

        //drpCountry.selectByVisibleText("France");  //selectByVisibleText()

        //drpCountry.selectByValue("japan");   // selectByValue()

            drpCountry.selectByIndex(2);  //selectByIndex()

        //capture the options from the dropdown
        List<WebElement> options=drpCountry.getOptions();
        System.out.println("Number of options in a dropdrown."+options.size());

        // printing the options
//        for (int i=0;i<options.size();i++)
//        {
//            System.out.println(options.get(i).getText());
//        }

        // using enhanced for loop
        for (WebElement op:options)
        {
            System.out.println(op.getText());
        }
    }

    @AfterTest
    public  void closeBrowser(){

        driver.quit();
    }
}
