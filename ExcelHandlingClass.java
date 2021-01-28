package com.company;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelHandlingClass {
    public static void write(String workBookName,String sheetName, List<String> listname,List<String> newListname) throws IOException
    {
        //define the file path where excel sheet will be generated
        String filepath= (System.getProperty("user.dir")+"\\"+workBookName+".xlsx");
        File file= new File(filepath);
        FileOutputStream fos=new FileOutputStream(file);
        //create the blank workbook
        Workbook wb= new XSSFWorkbook();
        //create the blank excel sheet
        Sheet sh= wb.createSheet(sheetName);
        //define the position in the excel sheet where write operation needs to perform
        Row rw= sh.createRow(0);
        Cell cl=rw.createCell(0);
        cl.setCellType(CellType.STRING);
        cl.setCellValue("Region");
        int size = listname.size();

        for(int i =1; i<size ; i++){
            Cell cell=rw.createCell(i);
            cell.setCellType(CellType.STRING);
            //define the data value
            cell.setCellValue(listname.get(i));
        }
        Row rwNew= sh.createRow(1);
        Cell clNew=rw.createCell(0);
        clNew.setCellType(CellType.STRING);
        clNew.setCellValue("Enquiry Type");
        int sizeNew = listname.size();

        for(int i =1; i<sizeNew ; i++){
            Cell cell=rwNew.createCell(i);
            cell.setCellType(CellType.STRING);
            //define the data value
            cell.setCellValue(newListname.get(i));
        }


        wb.write(fos);
    }

}
