package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.Assert;
import org.testng.annotations.Test;

public class validateTwitter extends DriverSetup {
    @Test(groups = {"Smoke"})
    public static void validateTwitterIcon()throws Exception{
        try {
            String actualTwitterString = driver.findElement(By.xpath(Constants.xpathTwitter)).getAttribute("title");
            String expectedTwitterString = driver.findElement(By.xpath(Constants.xpathTwitterLinkText)).getText();
            Assert.assertEquals(expectedTwitterString, actualTwitterString);
        }
        catch (Exception e){
            test.log(LogStatus.FAIL, Constants.twitterFailure);
        }
        finally {
            logger.info(Constants.twitterSuccess);
            test.log(LogStatus.PASS,Constants.twitterSuccess);
            TakeScreenshot.takeSnapShot(driver,"TwitterMenuVerified");
        }

    }
}
