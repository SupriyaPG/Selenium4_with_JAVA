package com.spgtesting.Action_Class;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

import static java.lang.Thread.sleep;


public class TestSelenium27_ActionClass {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--gest");
        driver =new EdgeDriver(edgeOptions);
    }

    @Test
    @Description("")
    @Owner("Supriya G")
    public void test_actionClass(){

        String URL="https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();

        //keys - Action Classes
        WebElement firstname =driver.findElement(By.name("firstname"));

        //keyboard
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstname,"the testing")
                .keyUp(Keys.SHIFT).build().perform();

    }


        @AfterTest
        public void closeBrowser(){

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            driver.quit();
        }

    }

