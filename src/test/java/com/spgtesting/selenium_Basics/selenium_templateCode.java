package com.spgtesting.selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class selenium_templateCode {

    @Test
    @Description("open url")
    public  void test() throws Exception{

            WebDriver driver=new EdgeDriver();
    }
}
