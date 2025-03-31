package com.spgtesting.Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium17_waits {

    @Test
    @Owner("Supriya G")
    @Description("Verify print the prices  of iMAC")
    public void test_imac_price(){
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");

        try {
            Thread.sleep(2000); //JVM will holt
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
