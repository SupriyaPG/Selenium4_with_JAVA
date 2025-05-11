package com.spgtesting.Practice.actionClass;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().window().maximize();

        WebElement button=driver.findElement(By.id("elements"));

        //Actions is a class
        Actions act=new Actions(driver);

        //creating action and storing into variable
        Action myAction=act.contextClick(button).build();

        //performing action
        myAction.perform();

        driver.quit();

    }
}
