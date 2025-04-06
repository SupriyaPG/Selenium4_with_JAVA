package com.spgtesting.Practice.HandlingAlerts;

import com.google.j2objc.annotations.Weak;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class TS_10_authenticatedPopup {

    private static final Logger log = LoggerFactory.getLogger(TS_10_authenticatedPopup.class);

    @Test
    @Owner("Supriya G")
    @Description("Handling authenticated popup")
    public void testAuth_Popup(){

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        //driver.get("https://the-internet.herokuapp.com/basic_auth");
        //instead of this we have to send username and password along with URL
        // Syntax : https://username:password@the-internet.herokuapp.com/basic_auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");



    }
}
