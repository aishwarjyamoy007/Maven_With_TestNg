package com.company;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.relevantcodes.extentreports.LogStatus;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class JSONFileReadClass extends clickContactUsMenu {
    public static String name;
    public static String email;
    public static String organization;
    public static String contact_number;
    public static JSONArray list;
    public static JSONArray listEnquiry;
    @Test(groups = {"Smoke","Regression"})
    public static void readJSONFile() throws IOException, ParseException {
        try{
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(System.getProperty("user.dir")+"\\InputSheet.json"));
         name = (String) jsonObject.get("NAME");
        email = (String) jsonObject.get("EMAIL");
        organization = (String) jsonObject.get("ORGANIZATION");
        contact_number = (String) jsonObject.get("CONTACT NUMBER");
            list = (JSONArray) jsonObject.get("REGION");
            listEnquiry= (JSONArray) jsonObject.get("INQUIRY TYPE");
        //Forming URL
        System.out.println("Contents of the JSON are: ");
        System.out.println("NAME :"+name);
        System.out.println("EMAIL: "+email);
        System.out.println("CONTACT NUMBER: "+contact_number);
        System.out.println("ORGANIZATION: "+organization);
        System.out.println("REGION: "+list);
        System.out.println("ENQUIRY TYPE: "+listEnquiry);
        System.out.println(" ");
    }
    catch (FileNotFoundException e) {
        e.printStackTrace();
        logger.info(Constants.jsonReadFailureMessage);
        test.log(LogStatus.FAIL, Constants.jsonReadFailureMessage);
    } catch (IOException e) {
        e.printStackTrace();
            logger.info(Constants.jsonReadFailureMessage);
            test.log(LogStatus.FAIL, Constants.jsonReadFailureMessage);
    } catch (ParseException e) {
        e.printStackTrace();
        logger.info(Constants.jsonReadFailureMessage);
        test.log(LogStatus.FAIL, Constants.jsonReadFailureMessage);
    }
        finally {
            logger.info(Constants.jsonReadSuccessMessage);
            test.log(LogStatus.PASS,Constants.jsonReadSuccessMessage);
        }
    }
  /*  @Test(groups = {"Smoke","Regression"})
    public static void validateContactFields(){
        driver.findElement(By.xpath(Constants.xpathNameInputField)).sendKeys(name);
        driver.findElement(By.xpath(Constants.xpathEmailInputField)).sendKeys(email);
        driver.findElement(By.xpath(Constants.xpathOrganizationInputField)).sendKeys(organization);
        driver.findElement(By.xpath(Constants.xpathContactNumberInputField)).sendKeys(contact_number);
        Select dropdown = new Select(driver.findElement(By.xpath(Constants.xpathSelectRegionAttribute)));
        dropdown.selectByIndex(1);
        Select dropdownEnquiry = new Select(driver.findElement(By.xpath(Constants.xpathSelectEnquiryAttribute)));
        dropdownEnquiry.selectByIndex(1);
        WebElement iFrame = driver.findElement(By.xpath("//*[@id='rc-anchor-container']"));
        driver.switchTo().frame(iFrame);
        WebElement iFrame_checkbox = driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]"));
        iFrame_checkbox.click();
        driver.findElement(By.xpath("//button[@id='conversation_submit']")).click();
    }*/
}
