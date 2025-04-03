package com.spgtesting.selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestSelenium_26_browserWindows {

    @Test
    public void windowHandling() {
        WebDriver driver=new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://bugbug.io/");

        WebElement logo=driver.findElement(By.xpath("//img[@alt='BugBug 2.0 - Automation testing made ultra-simple | Product Hunt']"));
        logo.click();
        driver.manage().window().maximize();

         Set<String> windowIDs=driver.getWindowHandles();

//        //Approach 1
//        List<String> windowList=new ArrayList(windowIDs);
//        String parentID=windowList.get(0);
//        String childID=windowList.get(1);
//
//        driver.switchTo().window(childID);
//        System.out.println("Child ID: "+driver.getTitle());
//
//        driver.switchTo().window(parentID);
//        System.out.println("Parent ID: "+driver.getTitle());

        //Approach 2
        for (String winID:windowIDs)
        {
            String title=driver.switchTo().window(winID).getTitle();
            System.out.println(driver.getCurrentUrl());
        }

     driver.quit();

    }
}
