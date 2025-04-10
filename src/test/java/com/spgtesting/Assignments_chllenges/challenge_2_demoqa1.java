package com.spgtesting.Assignments_chllenges;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class challenge_2_demoqa1 {

    @Test
    @Description()
    @Owner("Supriya G")
    public void test_Edit_button(){

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Meena");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("More");
        driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("meena@example.com");
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("35");
        driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("25000");
        driver.findElement(By.xpath("//input[@placeholder='Department']")).sendKeys("HR");
        driver.findElement(By.id("submit")).click();
        String name=driver.findElement(By.xpath(" //div[normalize-space()='Meena']")).getText();

        Assert.assertEquals(name,"Meena");

        driver.quit();

    }
}
