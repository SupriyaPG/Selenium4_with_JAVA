package com.spgtesting.Action_Class;

import com.spgtesting.TestCase_BoilerPlate;
import com.spgtesting.waitHelper.waitHelpers;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TestSelenium29_ActionsOnMakeMyTrip extends TestCase_BoilerPlate
{

    @Test
    @Description("Verify actions on makemytrip.com")
    @Owner("Supriya G")
    public void test_actions_makeMyTrip(){

        String URL="https://www.makemytrip.com/";
        driver.manage().window().maximize();
        driver.get(URL);

        //wait for popup to come and click the X button
      //  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        //OR use this
        waitHelpers.checkVisibility(driver,By.xpath("//span[@data-cy='closeModal']"));

        //This will close modal
        WebElement modal=driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        modal.click();

        waitJVM(2000);
        WebElement from=driver.findElement(By.id("fromCity"));

        Actions actions=new Actions(driver);
        actions.moveToElement(from).click().sendKeys("PNQ").build().perform();

        List<WebElement> elementList=driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']"));

        for (WebElement element:elementList)
        {
            if(element.getText().contains("Pune Airport"))
            {
                element.click();
            }
        }


    }
}
