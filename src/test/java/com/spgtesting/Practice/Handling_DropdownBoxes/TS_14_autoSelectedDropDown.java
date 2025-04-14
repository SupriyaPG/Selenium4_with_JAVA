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

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TS_14_autoSelectedDropDown {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver=new EdgeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Test
    @Description("Verify auto dropdown bx on google.")
    @Owner("Supriya G")
    public void test_autoDrop(){
    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
        waitJVM(3000);

        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

        System.out.println(list.size());

        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().equals("Selenium"))
            {
                list.get(i).click();
                break;
            }
        }


    }

    @AfterTest
    public void closeBrowser(){
    driver.quit();
    }
}
