package com.company;
import java.io.FileWriter;
import java.io.IOException;

import com.relevantcodes.extentreports.LogStatus;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.json.simple.JSONArray;
import org.openqa.selenium.support.ui.Select;
import  org.openqa.selenium.WebElement;
import java.util.List;

public class JSONFileCreateClass extends clickContactUsMenu {
    @Test(groups = {"Regression","Smoke"})
    public static void createJSONFile(){
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        String name=driver.findElement(By.xpath(Constants.xpathNameInputField)).getAttribute("placeholder");
        String email=driver.findElement(By.xpath(Constants.xpathEmailInputField)).getAttribute("placeholder");
        String organization=driver.findElement(By.xpath(Constants.xpathOrganizationInputField)).getAttribute("placeholder");
        String contactNumber=driver.findElement(By.xpath(Constants.xpathContactNumberInputField)).getAttribute("placeholder");
        JSONArray list = new JSONArray();
        Select dropdown = new Select(driver.findElement(By.xpath(Constants.xpathSelectRegionAttribute)));

        //Get all options
        List<WebElement> dd = dropdown.getOptions();

        //Get the length
        System.out.println(dd.size());

        // Loop to print one by one
        for (int j = 0; j < dd.size(); j++) {
            list.add(dd.get(j).getText());

        }
        JSONArray listEnquiry = new JSONArray();
        Select dropdownEnquiry = new Select(driver.findElement(By.xpath(Constants.xpathSelectEnquiryAttribute)));

        //Get all options
        List<WebElement> ddEnquiry = dropdownEnquiry.getOptions();

        //Get the length
        System.out.println(ddEnquiry.size());

        // Loop to print one by one
        for (int j = 0; j < dd.size(); j++) {
            listEnquiry.add(ddEnquiry.get(j).getText());

        }
        jsonObject.put("NAME", name);
        jsonObject.put("EMAIL", email);
        jsonObject.put("ORGANIZATION", organization);
        jsonObject.put("CONTACT NUMBER", contactNumber);
        jsonObject.put("REGION", list);
        jsonObject.put("INQUIRY TYPE", listEnquiry);
        jsonObject.put("MESSAGE", "New Message For New Users");


        try {
            FileWriter file = new FileWriter(System.getProperty("user.dir")+"\\InputSheet.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.info(Constants.jsonWriteFailureMessage);
            test.log(LogStatus.FAIL, Constants.jsonWriteFailureMessage);
        }
        finally {
            logger.info(Constants.jsonWriteSuccessMessage);
            test.log(LogStatus.PASS, Constants.jsonWriteSuccessMessage);
        }
    }
}
