package com.company;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.*;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class validateContactFields extends DriverSetup {
    @Test(groups = {"Smoke"},priority = 0)
    public static void validateNameField(){
        String expectedName="Name*";
        if(((driver.findElement(By.xpath(Constants.xpathNameAttribute))).getText()).equalsIgnoreCase(expectedName)){
            logger.info(Constants.nameAttributeSuccess);
            test.log(LogStatus.PASS, Constants.nameAttributeSuccess);
        }
        else{
            test.log(LogStatus.FAIL, Constants.nameAttributeFailure);
        }
    }
    @Test(groups = {"Smoke"},priority = 1)
    public static void validateEmailField(){
        String expectedEmail="Email*";
        if(driver.findElement(By.xpath(Constants.xpathEmailAttribute)).getText().equalsIgnoreCase(expectedEmail)){
            logger.info(Constants.emailAttributeSuccess);
            test.log(LogStatus.PASS, Constants.emailAttributeSuccess);
        }
        else{
            test.log(LogStatus.FAIL, Constants.emailAttributeFailure);
        }
    }
    @Test(groups = {"Smoke"},priority = 2)
    public static void validateOrganizationField(){
        String expectedOrganization="Organization*";
        if(driver.findElement(By.xpath(Constants.xpathOrganizationAttribute)).getText().equalsIgnoreCase(expectedOrganization)){
            logger.info(Constants.organizationAttributeSuccess);
            test.log(LogStatus.PASS, Constants.organizationAttributeSuccess);
        }
        else{
            test.log(LogStatus.FAIL, Constants.organizationAttributeFailure);
        }

    }
    @Test(groups = {"Smoke"},priority = 3)
    public static void validateContactNumberField(){
        String expectedContactNumber="Contact Number*";
        if(driver.findElement(By.xpath(Constants.xpathContactNumberAttribute)).getText().equalsIgnoreCase(expectedContactNumber)){
            logger.info(Constants.contactNumberAttributeSuccess);
            test.log(LogStatus.PASS, Constants.contactNumberAttributeSuccess);
        }
        else{
            test.log(LogStatus.FAIL, Constants.contactNumberAttributeFailure);
        }
    }
    @Test(groups = {"Smoke"},priority = 4)
    public static void validateRegionField(){
        int flag=0;
        Select s = new Select(driver.findElement(By.xpath(Constants.xpathSelectRegionAttribute)));
        List <WebElement> op = s.getOptions();
        List<String> actualValues=new ArrayList<String>();
        List<String> expectedValues= Arrays.asList(new String[]{"REGION*","North America","South America","Europe","Middle East","APAC","India"});
        int size = op.size();
        for(int i =0; i<size ; i++){
            String options = op.get(i).getText().toString();
            actualValues.add(options);
        }

        Collections.sort(actualValues);
        Collections.sort(expectedValues);

        if(expectedValues.equals(actualValues)){
            logger.info(Constants.regionAttributeSuccess);
            test.log(LogStatus.PASS, Constants.regionAttributeSuccess);
        }
        else{
            test.log(LogStatus.FAIL, Constants.regionAttributeFailure);
        }


    }
    @Test(groups = {"Smoke"},priority = 5)
    public static void validateEnquiryField(){
        Select s = new Select(driver.findElement(By.xpath(Constants.xpathSelectEnquiryAttribute)));
        List <WebElement> op = s.getOptions();
        List<String> actualValues=new ArrayList<String>();
        List<String> expectedValues= Arrays.asList(new String[]{"INQUIRY TYPE*","Alumni","Career Seekers","Investor Relations","Media","Partners","Alliances","Request for Services"});
        int size = op.size();
        for(int i =0; i<size ; i++){
            String options = op.get(i).getText().toString();
            actualValues.add(options);
        }
        Collections.sort(actualValues);
        Collections.sort(expectedValues);
        if(expectedValues.equals(actualValues)){
            logger.info(Constants.enquiryAttributeSuccess);
            test.log(LogStatus.PASS, Constants.enquiryAttributeSuccess);
        }
        else{
            test.log(LogStatus.FAIL, Constants.enquiryAttributeFailure);
        }
    }
    @Test(groups = {"Smoke"},priority = 6)
    public static void validateMessageField(){
        String expectedMessage="Message";
        if(driver.findElement(By.xpath(Constants.xpathMessageAttribute)).getText().equalsIgnoreCase(expectedMessage)){
            logger.info(Constants.messageAttributeSuccess);
            test.log(LogStatus.PASS, Constants.messageAttributeSuccess);
        }
        else{
            test.log(LogStatus.FAIL, Constants.messageAttributeFailure);
        }


    }
    @Test(groups = {"Smoke"},priority = 7)
    public static void writeExcelData()throws IOException {
        Select sel = new Select(driver.findElement(By.xpath(Constants.xpathSelectRegionAttribute)));
        List <WebElement> opNew = sel.getOptions();
        List<String> regionValues=new ArrayList<String>();
        List<String> enquiryValues=new ArrayList<String>();
        int size = opNew.size();
        for(int i =0; i<size ; i++){
            String options = opNew.get(i).getText().toString();
            regionValues.add(options);
        }
        Select selNew = new Select(driver.findElement(By.xpath(Constants.xpathSelectEnquiryAttribute)));
        List <WebElement> op = selNew.getOptions();
        int sizeNew = op.size();
        for(int i =0; i<sizeNew ; i++){
            String options = op.get(i).getText().toString();
            enquiryValues.add(options);
        }
        ExcelHandlingClass.write("ContactUs","ContactUs",regionValues,enquiryValues);
    }





}
