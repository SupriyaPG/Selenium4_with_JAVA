package com.spgtesting.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class tabsAndWindows {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://google.com/");

        driver.switchTo().newWindow(WindowType.TAB); //switching to new tab

        driver.get("https://thetestingacademy.com");

        driver.switchTo().newWindow(WindowType.WINDOW); // switching to new window

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

        driver.quit();
    }
}
