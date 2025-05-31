package com.spgtesting.Practice.ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class writtingDynamicDataIntoExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile_DynamicData.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet  sheet=workbook.createSheet("Data2");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many Rows:");
        int noOfRows=sc.nextInt();

        System.out.println("Enter how many Rows:");
        int noOfCells=sc.nextInt();

        for (int r=0;r<=noOfRows;r++)
        {
            XSSFRow currentRow=sheet.createRow(r);

            for(int c=0;c<=noOfCells;c++)
            {
                XSSFCell cell=currentRow.createCell(c);
                //cell.setCellValue(" "); //for hard code value
                cell.setCellValue(sc.next()); //takes value from user
            }
        }
        System.out.println("File is Created.");
        workbook.write(file);
        workbook.close();
        file.close();

    }
}
