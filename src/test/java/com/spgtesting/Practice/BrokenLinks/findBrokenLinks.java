package com.spgtesting.Practice.BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.HttpURLConnection;
import  java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;


public class findBrokenLinks {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.deadlinkcity.com/");
        driver.manage().window().maximize();

            //capture all the links from website
        List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: "+link.size());

        int noOfBrokenLinks=0;

        for(WebElement linkElement:link)
        {
            String hrefattValue=linkElement.getAttribute("herf");

            if(hrefattValue==null || hrefattValue.isEmpty())
            {
                System.out.println("herf attribute value is null or empty. So not possible to check.");
                continue;
            }

            //hit url to the server
            try
            {
                URL linkUrl=new URL(hrefattValue); //coverted herf value from String to url
                HttpURLConnection conn=(HttpURLConnection) linkUrl.openConnection();// open connection to the server
                conn.connect(); //connect to the server and send request to the server

                if(conn.getResponseCode()>=400)
                {
                    System.out.println(hrefattValue+"  Broken Link");
                }
                else
                {
                    System.out.println(hrefattValue+" Not a broken link");
                }
            } catch (Exception e) {

            }

        }
        System.out.println("Number of broken Links: "+noOfBrokenLinks);
    }
}
