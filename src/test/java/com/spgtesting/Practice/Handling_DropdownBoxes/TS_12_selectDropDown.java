package com.spgtesting.Practice.Handling_DropdownBoxes;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_12_selectDropDown {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver=new EdgeDriver();

        driver.get("");
        driver.manage().window().maximize();

    }

    @Owner("Supriya G")
    @Test
    @Description("Handling select dropdown box")
    public void test_selectDropDown(){


    }
}
