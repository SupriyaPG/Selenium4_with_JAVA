package com.spgtesting.Assignments_chllenges;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class Assignment_Automate_CURA {

    WebDriver driver;

    @BeforeTest
    public  void openBrowser(){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver=new EdgeDriver(edgeOptions);
         driver.manage().window().maximize();
    }

    @Test
    @Owner("Supriya G")
    @Description("Verify the full flow of book appointment till logout.")
    public void test_CURA(){

        String URL="https://katalon-demo-cura.herokuapp.com/";
        driver.get(URL);

        WebElement makeAppointment=driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        makeAppointment.click();

        WebElement userName=driver.findElement(By.id("txt-username"));
        userName.sendKeys("John Doe");

        //waitJVM(1000);

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement btnLogin=driver.findElement(By.id("btn-login"));
        btnLogin.click();

        waitJVM(2000);

        //Login failed! Please ensure the username and password are valid.

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
      //  waitJVM(1000);

        WebElement facility=driver.findElement(By.id("combo_facility"));
        facility.sendKeys("Seoul CURA Healthcare Center");
       // waitJVM(2000);

        WebElement chkBox=driver.findElement(By.id("chk_hospotal_readmission"));
        chkBox.click();

        //waitJVM(2000);

        WebElement healthcareProgram=driver.findElement(By.id("radio_program_none"));
        healthcareProgram.click();
       // waitJVM(2000);

        WebElement visitDate=driver.findElement(By.id("txt_visit_date"));
        visitDate.sendKeys("12/12/2025");
      //  waitJVM(2000);

        WebElement comment=driver.findElement(By.id("txt_comment"));
        comment.sendKeys("abc");

        WebElement btnBooking=driver.findElement(By.id("btn-book-appointment"));
        btnBooking.click();

        waitJVM(2000);

        WebElement heading=driver.findElement(By.tagName("h2"));
        Assert.assertTrue(heading.isDisplayed());
        Assert.assertEquals(heading.getText(),"Appointment Confirmation");

        WebElement con_facility=driver.findElement(By.xpath("//p[@id='facility']"));
        Assert.assertTrue(con_facility.isDisplayed());

        WebElement reAdmission=driver.findElement(By.id("hospital_readmission"));
        Assert.assertEquals(reAdmission.getText(),"Yes");

        WebElement program=driver.findElement(By.id("program"));
        Assert.assertEquals(program.getText(),"None");

        WebElement visitedDate=driver.findElement(By.id("visit_date"));
        Assert.assertEquals(visitedDate.getText(),"12/12/2025");

        WebElement comm=driver.findElement(By.id("comment"));
        System.out.println(comm.getText());
        Assert.assertEquals(comm.getText(),"abc");

        WebElement barIcon=driver.findElement(By.xpath("//i[@class='fa fa-bars']"));
        barIcon.click();

        WebElement logout=driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
        logout.click();

    }


    @AfterTest
    public void closeBrowser(){

        waitJVM(3000);
        driver.quit();

    }
}
