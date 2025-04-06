package com.spgtesting.Practice.Handling_checkboxes;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TS_04_selectingLast_3Checkboxes {

    @Test
    @Description("Selecting last 3 checkboxes.")
    @Owner("Supriya G")
    public void test_selectAllCheckboxes() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> chkBoxs = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        // Logic : total no of checkboxes - how many checkboxes selected = starting index
        // 7-3=4
       for (int i=4;i<chkBoxs.size();i++)
        {
            chkBoxs.get(i).click();
        }

        driver.quit();
    }
}
