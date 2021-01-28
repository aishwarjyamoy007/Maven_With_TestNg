package com.company;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class LatestThinkingClass extends DriverSetup {
    @Test(groups = {"Regression"},priority = '0')
    public void clickLatestThinking(){
        driver.navigate().to(Constants.webUrl);
        driver.findElement(By.xpath(Constants.xpathLatestThinking)).click();
    }
    @Test(groups = {"Regression"},priority = '1')
    public void clickJobsOfFutureIndex(){
        driver.findElement(By.xpath(Constants.xpathJobsOfFutureIndex)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(Constants.xpathIndex)));


    }
    @Test(groups = {"Regression"},priority = '2')
    public void addQtrChangeValues()throws Exception{
        DatabaseConnectionClass.createNewDatabase("COGNIZANT.db");
        DatabaseConnectionClass.createNewTable(driver.findElement(By.xpath(Constants.xpathQtrChange)).getText(),driver.findElement(By.xpath(Constants.qtrChangeValue)).getText());
        String filepath= (System.getProperty("user.dir")+"\\LatestThinking.xlsx");
        File file= new File(filepath);
        FileOutputStream fos=new FileOutputStream(file);
        //create the blank workbook
        Workbook wb= new XSSFWorkbook();
        //create the blank excel sheet
        Sheet sh= wb.createSheet("latestthinking");
        //define the position in the excel sheet where write operation needs to perform
        Row rw= sh.createRow(0);
        Cell cl=rw.createCell(0);
        cl.setCellType(CellType.STRING);
        cl.setCellValue(driver.findElement(By.xpath(Constants.xpathQtrChange)).getText());
        Cell cell=rw.createCell(1);
        cell.setCellType(CellType.STRING);
        cell.setCellValue(driver.findElement(By.xpath(Constants.qtrChangeValue)).getText());
        wb.write(fos);
        fos.flush();
    }
    @Test(groups = {"Regression"},priority = '3')
    public void addYearChangeValues()throws Exception{
        DatabaseConnectionClass.createNewTable(driver.findElement(By.xpath(Constants.xpathYearChange)).getText().toString(),driver.findElement(By.xpath(Constants.yearChangeValue)).getText().toString());
        String filepath= (System.getProperty("user.dir")+"\\LatestThinking.xlsx");
        FileInputStream inputStream = new FileInputStream(new File(filepath));
        Workbook workbook = WorkbookFactory.create(inputStream);

        Sheet sh = workbook.getSheetAt(0);

        Row rw= sh.createRow(1);
        Cell cl=rw.createCell(0);
        cl.setCellType(CellType.STRING);
        cl.setCellValue(driver.findElement(By.xpath(Constants.xpathYearChange)).getText().toString());
        Cell cell=rw.createCell(1);
        cell.setCellType(CellType.STRING);
        cell.setCellValue(driver.findElement(By.xpath(Constants.yearChangeValue)).getText().toString());
        //wb.write(fos);
        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream("LatestThinking.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
    @Test(groups = {"Regression"},priority = '4')
    public void addQtrJobChangeValues()throws Exception{
        DatabaseConnectionClass.createNewTable(driver.findElement(By.xpath(Constants.xpathQtrJobChange)).getText().toString(),driver.findElement(By.xpath(Constants.xpathQtrChangeValue)).getText().toString());
        String filepath= (System.getProperty("user.dir")+"\\LatestThinking.xlsx");
        FileInputStream inputStream = new FileInputStream(new File(filepath));
        Workbook workbook = WorkbookFactory.create(inputStream);

        Sheet sh = workbook.getSheetAt(0);

        Row rw= sh.createRow(2);
        Cell cl=rw.createCell(0);
        cl.setCellType(CellType.STRING);
        cl.setCellValue(driver.findElement(By.xpath(Constants.xpathQtrJobChange)).getText().toString());
        Cell cell=rw.createCell(1);
        cell.setCellType(CellType.STRING);
        cell.setCellValue(driver.findElement(By.xpath(Constants.xpathQtrChangeValue)).getText().toString());
        //wb.write(fos);
        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream("LatestThinking.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
    @Test(groups = {"Regression"},priority = '5')
    public void addTotalCjofJobs()throws Exception{
        DatabaseConnectionClass.createNewTable(driver.findElement(By.xpath(Constants.xpathTotalCjobs)).getText(),driver.findElement(By.xpath(Constants.totalCjobsValue)).getText());
        String filepath= (System.getProperty("user.dir")+"\\LatestThinking.xlsx");
        FileInputStream inputStream = new FileInputStream(new File(filepath));
        Workbook workbook = WorkbookFactory.create(inputStream);

        Sheet sh = workbook.getSheetAt(0);

        Row rw= sh.createRow(3);
        Cell cl=rw.createCell(0);
        cl.setCellType(CellType.STRING);
        cl.setCellValue(driver.findElement(By.xpath(Constants.xpathTotalCjobs)).getText().toString());
        Cell cell=rw.createCell(1);
        cell.setCellType(CellType.STRING);
        cell.setCellValue(driver.findElement(By.xpath(Constants.totalCjobsValue)).getText().toString());
        //wb.write(fos);
        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream("LatestThinking.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}
