package com.spgtesting.Exception_Handling.dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_TestNG_POI_xlsx {

    @Test(dataProvider = "getDataxlsx")
    public void test_DDT_xlsx(String email,String  password){
        System.out.println(email+" - "+password);

    }

    @DataProvider
    public Object[][] getDataxlsx(){
        //Read the data from the excel file
        //Give them in the 2D Array

       return  utilExcel.getTestDataFromExcel("sheet1");
    }
}
