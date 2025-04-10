package com.spgtesting.Assignments_chllenges;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class challenge_5_VWO_Hitmap extends TestCase_BoilerPlate {

    @Test
    @Description
    @Owner("Supriya G")
    public void test_hitmap() {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");

        Actions actions=new Actions(driver);
        actions.keyDown(Keys.SHIFT).keyUp(Keys.SHIFT).build().perform();
        //driver.findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]")).click();

        driver.navigate().to("https://courses.thetestingacademy.com/courses/job-ready-automation-tester-blueprint-with-java-by-pramod-dutta");
        //https://courses.thetestingacademy.com/courses/job-ready-automation-tester-blueprint-with-java-by-pramod-dutta
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//canvas[@id='heatmap-canvas']")));


//        WebElement iframe= driver.findElement(By.xpath("//canvas[@id='heatmap-canvas']"));
//        driver.switchTo().frame(iframe);

        boolean text=driver.findElement(By.xpath("//p[contains(text(),'\uD83D\uDCA5 Exclusive New Year Deal - Closing Soon\uD83D\uDCA5')]")).isDisplayed();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='option-tab selected vwo_player-option']")));
       Assert.assertEquals(text,true);
    }
}