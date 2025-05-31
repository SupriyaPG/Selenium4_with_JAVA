package com.spgtesting.Practice.ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class writtingDataIntoExcel {
    public static void main(String[] args) throws IOException {

        FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile1.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("Data");
        XSSFRow row1=sheet.createRow(0);
            row1.createCell(0).setCellValue("Java");
            row1.createCell(1).setCellValue("Automation");
            row1.createCell(2).setCellValue("1234");

        XSSFRow row2=sheet.createRow(1);
            row2.createCell(0).setCellValue("Python");
            row2.createCell(1).setCellValue("Playwright");
            row2.createCell(2).setCellValue("5846");

        XSSFRow row3=sheet.createRow(2);
            row3.createCell(0).setCellValue("c#");
            row3.createCell(1).setCellValue("Automation");
            row3.createCell(2).setCellValue("8746");

            workbook.write(file);
            workbook.close();
            file.close();

            System.out.println("File is created.");
    }
}
