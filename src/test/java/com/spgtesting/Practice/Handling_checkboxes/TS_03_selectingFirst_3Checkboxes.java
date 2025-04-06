package com.spgtesting.Practice.Handling_checkboxes;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TS_03_selectingFirst_3Checkboxes {

    @Test
    @Description("selecting 1st 3 checkboxes.")
    @Owner("Supriya G")
    public void test_selectAllCheckboxes() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> chkBoxs = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

       for (int i=0;i<3;i++)
        {
            chkBoxs.get(i).click();
        }

       driver.quit();
    }
}
