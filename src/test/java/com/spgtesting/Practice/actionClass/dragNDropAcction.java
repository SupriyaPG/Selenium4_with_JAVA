package com.spgtesting.Practice.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragNDropAcction {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        Actions act=new Actions(driver);

        WebElement sourceElement=driver.findElement(By.id("box5"));
        WebElement targetElement=driver.findElement(By.xpath("//div[@id='box105']"));

        act.dragAndDrop(sourceElement,targetElement).perform();

        driver.quit();

    }
}
