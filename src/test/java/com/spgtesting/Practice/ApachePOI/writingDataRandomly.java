package com.spgtesting.Practice.ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class writingDataRandomly {
    public static void main(String[] args) throws IOException {

        FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myFileRandom.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("RandomData");
        XSSFRow row1=sheet.createRow(3);
        XSSFCell cell=row1.createCell(4);
        cell.setCellValue("jdfjs");

        XSSFCell cell2=row1.createCell(3);
        cell2.setCellValue("kldjfdslk");

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File is created.");
    }
}
