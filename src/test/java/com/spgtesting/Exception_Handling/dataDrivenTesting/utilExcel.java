package com.spgtesting.Exception_Handling.dataDrivenTesting;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class utilExcel {

    // using Apache POI read file
    //create workbook
    //create sheet
    //Row and Cell
    //2D Object - getData

    static Workbook book;
    static Sheet sheet;

    public static String SHEET_PATH=System.getProperty("user.dir")+"/src/test/Resources/TestData.xlsx";

    public static Object[][] getTestDataFromExcel(String sheetName){


       // System.out.println("Path : "+SHEET_PATH);
        FileInputStream file = null;
        try {
             file=new FileInputStream(SHEET_PATH);
            book= WorkbookFactory.create(file);
            sheet= book.getSheet(sheetName);
        } catch (IOException e) {
            System.out.println("File not found! OR workbook not created!");
        }

        Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i=0;i< sheet.getLastRowNum();i++)
        {
            for (int j=0;j< sheet.getRow(0).getLastCellNum();j++){

                //First row email,password ->column name - skip -header
                data[i][j]=sheet.getRow(i+1).getCell(j).toString();

            }
        }

        return data;
    }
    }
