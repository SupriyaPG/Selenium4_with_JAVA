package com.spgtesting.Exception_Handling;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test_staleElementException2 extends TestCase_BoilerPlate {

    @Test
    @Description
    @Owner("Supriya G")
    public void testStale_Exception(){

        driver.get("https://google.com");
        System.out.println("Start of Program");

        WebElement search_input_Box=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        System.out.println(driver.getWindowHandle()); // can cm-pair the handle it will same although page refresh

        //HTML page DOM is refreshed NOW
        driver.navigate().refresh(); // Due refresh stale Element Exception created

        try {
            search_input_Box.sendKeys("The Testing Academy."+Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("Stale Element Exception");
        }


        System.out.println(driver.getWindowHandle());
        System.out.println("End of the program.");
    }
}
