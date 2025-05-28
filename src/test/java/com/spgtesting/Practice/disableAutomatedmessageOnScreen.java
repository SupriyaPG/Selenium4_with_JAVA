package com.spgtesting.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class disableAutomatedmessageOnScreen {
    public static void main(String[] args) {

        EdgeOptions options=new EdgeOptions();
        options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

        WebDriver driver=new EdgeDriver(options);
        driver.get("https://demo.nopcommerce.com/");
        String act_title=driver.getTitle();

            System.out.println(act_title);


    }
}
