package com.spgtesting.Practice.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickAction {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement rightClick_Button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act=new Actions(driver);
        // right click action
        act.contextClick(rightClick_Button).build().perform();

        driver.quit();


    }
}
