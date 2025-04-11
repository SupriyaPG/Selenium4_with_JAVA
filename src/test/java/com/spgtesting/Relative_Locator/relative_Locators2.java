package com.spgtesting.Relative_Locator;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relative_Locators2 extends TestCase_BoilerPlate {

    @Test
    @Description("Verify retative locators")
    @Owner("Supriya G")
    public void test_RL2() {

        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        //iframe
        driver.switchTo().frame("result");

        WebElement submit = driver.findElement(By.xpath("//form[@id=\"form\"]/button"));
        submit.click();

        WebElement username_element = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_element));
        String errorElementText=error_element.getText();

        Assert.assertEquals(errorElementText,"username must be at least 3 characters");
    }
}
