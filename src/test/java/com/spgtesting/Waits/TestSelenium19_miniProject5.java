package com.spgtesting.Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium19_miniProject5 {

    @Test
    @Description("Verify MakeMy Trip ")
    @Owner("Supriya G")
    public void testCloseModal(){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        //condition
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='commonModal__close']")));

        WebElement closeModal=driver.findElement(By.xpath("//span[@class='commonModal__close']"));
        closeModal.click();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
