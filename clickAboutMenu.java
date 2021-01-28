package com.company;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class clickAboutMenu extends DriverSetup {
    @Test(groups = "Smoke")
    public static void clickaboutMenu()throws Exception{
        try {

            driver.findElement(By.xpath(Constants.xpathAbout)).click();
        }
        catch (Exception e){
            test.log(LogStatus.FAIL, Constants.aboutFailure);
        }
        finally {
            logger.info(Constants.aboutSuccess);
            test.log(LogStatus.PASS, Constants.aboutSuccess);
            TakeScreenshot.takeSnapShot(driver,"AboutMenuClicked");
        }
    }
}
