package com.spgtesting.Exception_Handling.dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_TestNG_POI {

    @Test(dataProvider = "getData")
    public void test_DDT_VWO_Login(String email,String password){

        System.out.println(email+" - "+password);
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
          new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin123@gmail.com","pass123"},
                new  Object[]{"admin123@gmail.com","pass124"}
        };
    }
}
