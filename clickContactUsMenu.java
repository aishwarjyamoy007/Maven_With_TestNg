package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class clickContactUsMenu extends DriverSetup {
    @Test(groups ={"Smoke"})
    public  static void clickcontactUsMenu()throws Exception{
        try {
            driver.findElement(By.xpath(Constants.xpathContactUs)).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(Constants.xpathFacebookLinkText)));

        }
        catch (Exception e){
            test.log(LogStatus.FAIL, Constants.contactUsFailure);
        }
        finally {
            logger.info(Constants.contactUsSuccess);
            test.log(LogStatus.PASS,Constants.contactUsSuccess);
            TakeScreenshot.takeSnapShot(driver,"ContactMenuClicked");
        }
    }
}
