package com.spgtesting.Practice.WebTable.StaticTable;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_21_Assignment_lowestPrice {

    WebDriver driver=new EdgeDriver();

    @BeforeTest
    public void openBrowser(){
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();

    }

    @Test
    @Description("")
    @Owner("Supriya G")
    public void test_blazedemo(){

        driver.findElement(By.name("fromPort")).sendKeys("Bostan");
        WebElement dropDownElement=driver.findElement(By.name("fromPort"));
        Select drpCity=new Select(dropDownElement);
        drpCity.selectByIndex(2);

        WebElement dropDownElement2=driver.findElement(By.xpath("//Select[@name='toPort']"));
        Select drpDesCity=new Select(dropDownElement2);
        drpDesCity.selectByValue("London");

        WebElement subButton=driver.findElement(By.xpath("//input[@type='submit']"));
        subButton.click();

        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,"https://blazedemo.com/reserve.php");


        int rows=driver.findElements(By.xpath("//table//tr")).size();
        int col=driver.findElements(By.xpath("//table//th")).size();
        System.out.println(rows);
        System.out.println(col);

        int i;
        int j=0;
       double lowerPrice=0.0;
        for ( i=1;i<rows;i++)
                {
                       String price = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[6]")).getText();
                       String button=driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[1]")).getText();
                       String str=price.replace("$","");
                       // System.out.println("Price :"+str);
                        double temp= Double.parseDouble(str);
                        if(i==1)
                        {
                            lowerPrice=temp;
                        }

                        if (lowerPrice>temp) {
                              lowerPrice=temp;
                              j=i;

                           }
                }
        System.out.println("Lowerprice:"+lowerPrice);
        //String flight=driver.findElement(By.xpath("//td[normalize-space()="+$+"+lowerPrice"])).  // //td[normalize-space()='$200.98']
        System.out.println("j :"+j);
        driver.findElement(By.xpath("//table[@class='table']//tr["+j+"]//td[1]")).click();

        driver.findElement(By.id("inputName")).sendKeys("John");
        driver.findElement(By.id("address")).sendKeys("Link Road");
        driver.findElement(By.id("city")).sendKeys("Aroura");
        driver.findElement(By.id("state")).sendKeys("Texas");
        driver.findElement(By.id("zipCode")).sendKeys("54682");
        WebElement cardTypeDropDown= driver.findElement(By.id("cardType"));
        Select type=new Select(cardTypeDropDown);
        type.selectByVisibleText("Visa");
        driver.findElement(By.id("creditCardNumber")).sendKeys("548796321546");
        driver.findElement(By.id("creditCardMonth")).sendKeys("6");
        driver.findElement(By.id("creditCardYear")).sendKeys("2030");
        driver.findElement(By.id("nameOnCard")).sendKeys("John");

        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

        String msg=driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();

        Assert.assertEquals(msg,"Thank you for your purchase today!");


    }

  @AfterTest
    public void closeBrowser()
    {
        try {
            Thread.sleep(3000 );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
