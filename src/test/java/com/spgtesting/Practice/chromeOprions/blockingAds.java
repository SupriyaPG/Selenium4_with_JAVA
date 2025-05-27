package com.spgtesting.Practice.chromeOprions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;

public class blockingAds {
    public static void main(String[] args) {


        EdgeOptions options=new EdgeOptions();

        File file=new File("C:\\Drivers\\SelectorsHub.crx"); //give file address of crx file here
        options.addExtensions(file);

        WebDriver driver=new EdgeDriver(options);
        driver.get("https://text-compare.com/");

        driver.manage().window().maximize();
    }
}
