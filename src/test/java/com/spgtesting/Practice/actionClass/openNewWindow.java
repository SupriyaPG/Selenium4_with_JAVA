package com.spgtesting.Practice.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class openNewWindow {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=33");
        driver.manage().window().maximize();

        Actions act=new Actions(driver);

        WebElement myAccount=driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]"));
        act.keyDown((Keys.CONTROL)).click(myAccount).keyUp(Keys.CONTROL).perform();
        WebElement regLink=driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[normalize-space()='Register']"));
        act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();

        //getting window handles
        List<String> ids=new ArrayList(driver.getWindowHandles());
        //switching new window
        driver.switchTo().window(ids.get(1));

        WebElement registrationPage= (driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/h1[1]")));

        String chk=registrationPage.getText();
        System.out.println(chk);
        if(chk.matches("Register Account")) {
                System.out.println("Registration Page display");
        }

        driver.quit();

    }
}
