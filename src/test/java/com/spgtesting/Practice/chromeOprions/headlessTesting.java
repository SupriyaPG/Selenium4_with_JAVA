package com.spgtesting.Practice.chromeOprions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class headlessTesting {
    public static void main(String[] args) {

        EdgeOptions options=new EdgeOptions();
        options.addArguments("--headless=new");  //setting for headless mode of execution

        WebDriver driver=new EdgeDriver(options);
        driver.get("https://demo.opencart.com");
        String act_title=driver.getTitle();
        if(act_title.equals("Your Store"))
        {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        driver.quit();

    }
}
