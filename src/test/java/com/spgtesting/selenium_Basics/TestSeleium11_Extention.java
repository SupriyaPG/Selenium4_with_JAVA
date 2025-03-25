package com.spgtesting.selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSeleium11_Extention {

    @Test
    @Description("open url")
    public  void test_addExtentions() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addExtensions(new File("src\\test\\java\\com\\spgtesting\\selenium_Basics\\CRX-Extractor-Downloader-Chrome-Web-Store.crx"));

        EdgeDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");


    }
}
