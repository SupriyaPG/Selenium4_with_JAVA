package com.spgtesting.Assignments_chllenges;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class challenge_3_demoqa2 extends TestCase_BoilerPlate {

    @Test
    @Description("Verify large modal message from demoqa.com")
    public void test_largeModal(){

        driver.get("https://demoqa.com/modal-dialogs");
        driver.findElement(By.id("showLargeModal")).click();

       boolean text=driver.findElement(By.xpath("//div[@class='modal-header']")).isDisplayed();
       Assert.assertEquals(text,true);

        driver.findElement(By.id("closeLargeModal")).click();

    }
}
