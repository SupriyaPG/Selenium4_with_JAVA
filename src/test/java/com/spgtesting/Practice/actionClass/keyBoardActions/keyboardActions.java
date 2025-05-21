package com.spgtesting.Practice.actionClass.keyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyboardActions {

    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("inputText1")).sendKeys("Welcome");

        Actions act=new Actions(driver);

        //ctrl + A Select text
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //ctrl + C  Copy text
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //Tab  Shift to 2nd tab
        act.keyDown(Keys.TAB).perform();

        //ctrl + V  Paste text
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

        driver.quit();
    }
}
