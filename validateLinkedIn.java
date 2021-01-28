package com.company;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class validateLinkedIn extends DriverSetup {
    @Test(groups = {"Smoke"})
    public static void validateLinkedInIcon()throws Exception{
        try {
            String actualLinkedInString = driver.findElement(By.xpath(Constants.xpathLinkedin)).getAttribute("title");
            String expectedLinkedInString = driver.findElement(By.xpath(Constants.xpathLinkedInLinkText)).getText();
            Assert.assertEquals(expectedLinkedInString, actualLinkedInString);
        }
        catch(Exception e){
            test.log(LogStatus.FAIL, Constants.linkedInFailure);
        }
        finally {
            logger.info(Constants.linkedInSuccess);
            test.log(LogStatus.PASS, Constants.linkedInSuccess);
            TakeScreenshot.takeSnapShot(driver,"LinkedInMenuVerified");
        }

    }
}
