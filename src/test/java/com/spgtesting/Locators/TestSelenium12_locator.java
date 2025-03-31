package com.spgtesting.Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium12_locator {

    @Owner("Supriya G")
    @Test
    @Description("open url")
    public  void test() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximised");


        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        //input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"

        WebElement emailInputBox=driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        //input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"

        WebElement passwordInputBox=driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");

        //<button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // data-qa="sibequkica">


        WebElement buttonSubmit=driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        Thread.sleep(4000);

        //<div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi"
        // Your email, password, IP address or location did not match

        WebElement error_message=driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }
}
