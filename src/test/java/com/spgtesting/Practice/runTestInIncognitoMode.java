package com.spgtesting.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class runTestInIncognitoMode {
    public static void main(String[] args) {

        EdgeOptions options=new EdgeOptions();
        options.addArguments("--incognito");

        WebDriver driver=new EdgeDriver(options);
        driver.get("https:www.google.com");

        driver.manage().window().maximize();


    }
}
