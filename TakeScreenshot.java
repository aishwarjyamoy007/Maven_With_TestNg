package com.company;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class TakeScreenshot {
    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception{

        String FilePath=(System.getProperty("user.dir")+"\\"+"screenshots\\"+fileWithPath+".png");
        //Convert web driver object to TakeScreenshot


        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(FilePath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

    }
}
