package com.spgtesting.SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static com.spgtesting.waitHelper.waitHelpers.waitJVM;

public class TestSelenium25_svgMap {


    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver=new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();

    }

    @Description("Verify Tripura is present in a MAP and click to zoom it.")
    @Test
    public void test_India_Map_svgIcon() {

        String URL="https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);

        List<WebElement> states=driver.findElements(By.xpath("//div[@class='amcharts-chart-div']//*[name()='svg']//*[name()='g']//*[name()='g' and contains(@transform,'translate(')]//*[name()='g' and contains(@transform,'translate(')]//*[name()='path']"));

        for(WebElement state:states) {
            System.out.println(state.getDomAttribute("aria-label"));

            if (state.getDomAttribute("aria-label").contains("Tripura")) {
                state.click();
                break;
            }
        }
    }

    @AfterTest
    public void closeBrowser(){
        waitJVM(3000);
        driver.quit();
    }

}
