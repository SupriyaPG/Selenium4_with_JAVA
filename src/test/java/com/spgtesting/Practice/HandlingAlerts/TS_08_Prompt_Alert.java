package com.spgtesting.Practice.HandlingAlerts;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TS_08_Prompt_Alert {
    @Test
    @Owner("Supriya G")
    @Description("Alert 2 : Prompt alert - Enter value in a checkbox and click on OK or Cancel")
    public void test_PromtAlert() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        waitJVM(2000);

        // Alert 3 : Alert with input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        waitJVM(2000);
        driver.switchTo().alert().sendKeys("Ok");
        waitJVM(2000);
        driver.switchTo().alert().accept();  // for accept alert
        //driver.switchTo().alert().dismiss();  // for cancel alert
        System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

        driver.quit();
    }
}
