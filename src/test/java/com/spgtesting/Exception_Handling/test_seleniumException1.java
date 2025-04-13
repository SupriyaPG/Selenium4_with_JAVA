package com.spgtesting.Exception_Handling;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class test_seleniumException1 extends TestCase_BoilerPlate {

    @Test
    @Description
    public void test_VWO(){

        System.out.println("Start of the program.");
        driver.get("https://app.vwo.com");

//        try {
//            driver.findElement(By.id("Ambani")); //it will throw exceptio as it not contain in a site
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        //can use NoSuchElementExceptions which is selenium provide

//        try {
//            driver.findElement(By.id("Ambani")); //it will throw exception as it not contain in a site
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//        }

        //This is the best way ,smart way to handling exceptions

        try {
            driver.findElement(By.id("Ambani")); //it will throw exception as it not contain in a site
        } catch (NoSuchElementException e) {
            System.out.println("Element no found.");
        }

        System.out.println("End of the program.");
    }


}
