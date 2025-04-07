package com.spgtesting.Action_Class;

import com.spgtesting.TestCase_BoilerPlate;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TestSelenium30_pageUp_pageDown extends TestCase_BoilerPlate {

    @Test
    @Description("Verify The Testing Academy page scroll up and down")
    @Owner("Supriya G")
    public void test_actions_scrollUP_Down()
    {
        String URL=("https://www.thetestingacademy.com/");
        driver.get(URL);
        driver.manage().window().maximize();

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform();

        waitJVM(1000);

    }
}
