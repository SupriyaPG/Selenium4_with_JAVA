package com.spgtesting.Action_Class;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TestSelenium28_ActionsOnSpicejet extends TestCase_BoilerPlate
{

    @Test
    @Description("Verify actions on spicejet.")
    @Owner("Supriya G")
    public void test_actions_spicejet()
    {
        String URL="https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        waitJVM(2000);
        WebElement source =driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions=new Actions(driver);
        // Move to element
        //click
        // sens keys

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

    }


}
