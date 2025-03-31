package com.spgtesting.selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium10 {

    @Owner("Supriya G")
    @Test
    @Description("option class")
    public  void test() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        //every browser has a option class
        //FireFoxOptions, ChromeOption, SafariOption

        //Option class will help you to set the browser
        //optionsto browser
        //window-size
        //headless mode - there is not UI -> advantage - fast execution
        //full UI mode - default - UI browser
        //incognito mode-switch
        //start max
        //add extensions - browsers
        //100+ others option,http, https
        //localstorage, download

        edgeOptions.addArguments("--window-size=1280,700");
        edgeOptions.addArguments("--headeless");

        EdgeDriver driver=new EdgeDriver(edgeOptions);
        Thread.sleep(3000);

        driver.quit();

    }
}
