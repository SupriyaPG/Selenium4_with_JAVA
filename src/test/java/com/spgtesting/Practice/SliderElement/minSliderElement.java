package com.spgtesting.Practice.SliderElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class minSliderElement {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act=new Actions(driver);

        //Min slider
        WebElement minSlider=driver.findElement(By.xpath("//span[1][@class='ui-slider-handle ui-corner-all ui-state-default']"));
        //(59, 257)
        System.out.println("Default location of slider"+minSlider.getLocation());
        act.dragAndDropBy(minSlider,100,257).perform();
        //(158, 251)
        System.out.println("Location of the min slider after moving:"+minSlider.getLocation());



        driver.quit();
    }
}
