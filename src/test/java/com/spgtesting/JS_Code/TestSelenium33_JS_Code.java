package com.spgtesting.JS_Code;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestSelenium33_JS_Code extends TestCase_BoilerPlate {

    @Test
    @Description("")
    @Owner("Supriya G")
    public void testJSCode(){

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));
       // WebElement scroller=driver.findElement(By.xpath("//div[@id='userName'])"));

        js.executeScript("arguments[0].scrollIntoView(true);",div_to_scroll);


        String url=js.executeScript("return document.URL;").toString();
        String title=js.executeScript("return document.title").toString();

        System.out.println(url);
        System.out.println(title);


    }
}
