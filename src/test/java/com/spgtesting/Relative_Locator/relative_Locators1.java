package com.spgtesting.Relative_Locator;

import com.spgtesting.TestCase_BoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relative_Locators1 extends TestCase_BoilerPlate {

    public void testJS(){
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement spanElement=driver.findElement(By.xpath("//span[normalize-space()='Years of Experience'"));

        driver.findElement(with(By.id("exp-2")).toRightOf(spanElement)).click();

    }
}
