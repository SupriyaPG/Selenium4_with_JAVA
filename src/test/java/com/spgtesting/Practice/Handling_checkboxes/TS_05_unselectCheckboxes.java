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

public class TS_05_unselectCheckboxes {

    @Test
    @Description("Unselect checkboxes if they are selected.")
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

        waitJVM(2000);
        for (int i=4;i<chkBoxs.size();i++)
        {
            if(chkBoxs.get(i).isSelected()) {
                chkBoxs.get(i).click();
            }
        }

        driver.quit();

    }
}
