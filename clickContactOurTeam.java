package com.company;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class clickContactOurTeam extends DriverSetup {
    @Test
    public static void clickContactOurTeam()throws Exception{
        try {

            driver.findElement(By.xpath(Constants.xpathContactOurTeam)).click();
        }
        catch (Exception e){
            test.log(LogStatus.FAIL, Constants.contactOurTeamFailure);
        }
        finally {
            logger.info(Constants.contactOurTeamSuccess);
            test.log(LogStatus.PASS, Constants.contactOurTeamSuccess);
            TakeScreenshot.takeSnapShot(driver,"ContactOurTeamMenuClicked");
        }
    }
}
