package com.spgtesting.Practice.SliderElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class maxSliderElement {

    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act=new Actions(driver);

        //Max Slider
        WebElement maxSlider=driver.findElement(By.xpath("//span[2][@class='ui-slider-handle ui-corner-all ui-state-default']"));
        System.out.println("Default location of slider"+maxSlider.getLocation());
       act.dragAndDropBy(maxSlider,-100,257).perform();

        System.out.println("Location of max slider after moving"+maxSlider.getLocation());
         driver.quit();
    }
}
