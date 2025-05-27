package com.spgtesting.Practice.chromeOprions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class sslHandling {
    public static void main(String[] args) {

        EdgeOptions options=new EdgeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriver driver=new EdgeDriver(options);
        driver.get("https://expired.badssl.com/");
        System.out.println("title of the page:"+driver.getTitle());

        driver.quit();
    }
}
