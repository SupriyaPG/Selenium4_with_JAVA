package com.spgtesting.Practice.Handling_checkboxes;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TS_01_select_specific_checkbox {

    @Test
    @Description("Selecting specific checkbox.")
    @Owner("Supriya G")
    public void test_selectSpecificCheckbox(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='sunday']"));

        driver.quit();

    }
}
