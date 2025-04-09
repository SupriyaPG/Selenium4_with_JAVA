package com.spgtesting.Action_Class;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium31_dragDrop extends TestCase_BoilerPlate {

    @Test
    @Description("Verify actions drag and drop.")
    @Owner("Supriya G")
    public void test_dragDrop(){

        String URL="https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(URL);
        driver.manage().window().maximize();

        Actions actions=new Actions(driver);

        WebElement from=driver.findElement(By.id("column-a"));
        WebElement to=driver.findElement(By.id("column-b"));

        actions.dragAndDrop(from,to).build().perform();
    }
}
