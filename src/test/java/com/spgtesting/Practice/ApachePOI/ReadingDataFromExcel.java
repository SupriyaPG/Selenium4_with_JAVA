package com.spgtesting.Practice.ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {
        {
            //FileInputStream file=new FileInputStream("C:\\Users\\Win\\IdeaProjects\\Selenium_Basics\\testData\\data.xlsx");
            //intead of using whole path we can use dynamic path
            FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");

            XSSFWorkbook workbook= null;
            try {
                workbook = new XSSFWorkbook(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            //XSSFSheet sheet=workbook.getSheetAt(0); //getting sheet by giving sheet index
            XSSFSheet sheet=workbook.getSheet("sheet1");  //getting sheet by giving sheet name

            int totalNoOfRows=sheet.getLastRowNum();
            int totalCells=sheet.getRow(1).getLastCellNum();

            System.out.println("No of rows"+totalNoOfRows); // rows count starts from 0
            System.out.println("No of cells"+totalCells); // cells count starts from 1

            for (int r=0;r<=totalNoOfRows;r++) // thi loop is representing rows
            {
                    XSSFRow currentRow= sheet.getRow(r);

                // although cell count starts from 1, in java data reads from 0
                for (int c=0;c<totalCells;c++) //this loop is representing cells
                {
                    XSSFCell cell=currentRow.getCell(c);
                    System.out.print(cell.toString()+"  |  ");
                }
                System.out.println();
            }
            workbook.close();
            file.close();

        }
    }
}
