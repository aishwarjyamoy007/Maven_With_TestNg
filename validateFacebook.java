package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class validateFacebook extends DriverSetup {
    @Test(groups = {"Smoke"})
    public static void validateFacebookIcon()throws Exception{
        try {
            String actualFacebookString = driver.findElement(By.xpath(Constants.xpathFacebook)).getAttribute("title");
            String expectedTFacebookString = driver.findElement(By.xpath(Constants.xpathFacebookLinkText)).getText();
            Assert.assertEquals(expectedTFacebookString, actualFacebookString);
        }
        catch (Exception e){
            test.log(LogStatus.FAIL, Constants.facebookFailure);
        }
        finally {
            logger.info(Constants.facebookSuccess);
            test.log(LogStatus.PASS,Constants.facebookSuccess);
            TakeScreenshot.takeSnapShot(driver,"FaceBookMenuVerified");

        }

    }
}
