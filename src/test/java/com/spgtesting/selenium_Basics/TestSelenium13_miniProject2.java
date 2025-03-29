package com.spgtesting.selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium13_miniProject2 {
    @Test
    @Description("Verify current URL")
    public  void test_curaHealthcare() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximised");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // id="btn-make-appointment"
        // href="./profile.php#login"
        // class="btn btn-dark btn-lg"
        // >Make Appointment

        //click on make appointment
        WebElement buttonAppointment=driver.findElement(By.id("btn-make-appointment"));
        buttonAppointment.click();

        Thread.sleep(3000);

        //<input
        // type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"
        // placeholder="Username"
        // value="" autocomplete="off">

        WebElement userNameInput=driver.findElement(By.id("txt-username"));
        userNameInput.sendKeys("John Doe");

        //<input
        // type="password"
        // class="form-control"
        // id="txt-password"
        // name="password"
        // placeholder="Password"
        // value="" autocomplete="off">

        WebElement passwordInput=driver.findElement(By.name("password"));
        passwordInput.sendKeys("ThisIsNotAPassword");

        //<button
        // id="btn-login"
        // type="submit"
        // class="btn btn-default"
        // >Login</button>
        WebElement loginButton=driver.findElement(By.id("btn-login"));
        loginButton.click();

        Thread.sleep(3000);

        //Verify URL-->https://katalon-demo-cura.herokuapp.com/#appointment
        //<form class="form-horizontal" action="https://katalon-demo-cura.herokuapp.com/appointment.php#summary" method="post">

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        //div
        // class="col-sm-12 text-center">
        //h2>Make Appointment</h2>
        if(driver.getPageSource().contains("Make Appointment")){
            System.out.println("Heading 'Make Appointment' is availabe.");
            Assert.assertTrue(true);
        }else {
            //Assert.assertTrue(false);
            // OR we can use throw Exception
            throw new Exception("Heading 'Make Appointment' is not available.");
        }
        driver.quit();
    }

}
