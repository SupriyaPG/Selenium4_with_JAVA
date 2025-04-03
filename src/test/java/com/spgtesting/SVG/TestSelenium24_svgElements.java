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

public class TestSelenium24_svgElements {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver=new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();

    }

    @Description("Verify search with SVG Icon resuls are visible.")
    @Test
    public void test_Flipkart_Search_svgIcon() {

        String URL="https://www.flipkart.com/search";
        driver.get(URL);

        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()=\'svg\']"));
        svgElements.get(0).click();

        waitJVM(3000);

        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));
        for (WebElement title : titlesResults) {
            System.out.println(title.getText());
        }
    }

    @AfterTest
    public void closeBrowser(){
        waitJVM(3000);
        driver.quit();
    }


}

