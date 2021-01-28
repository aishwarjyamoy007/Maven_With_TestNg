package com.company;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.util.Scanner;

public class DriverSetup extends Constants {
    static  WebDriver driver=null;
    public static Logger logger;
    public static ExtentTest test;
    public static ExtentReports report;


    @BeforeSuite(groups = {"Smoke","Regression"})
    @Parameters("browser")
    public static void getWebDriver(@Optional("Chrome") String browser)throws Exception{
        report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
        test = report.startTest("AutomationChallenge Extent Report");
        logger=Logger.getLogger("Automation Challenge");
        PropertyConfigurator.configure("Log4j.properties");

        if(browser.equalsIgnoreCase("Chrome")) {
            try {
                System.setProperty("webdriver.chrome.driver", "newDrivers\\chromedriver.exe");
                driver = new ChromeDriver();
            } catch (Exception e) {
                test.log(LogStatus.FAIL, Constants.chromeFailure);
            } finally {
                logger.info(Constants.chromeSuccess);
                test.log(LogStatus.PASS, Constants.chromeSuccess);


            }

        }
        else if(browser.equalsIgnoreCase("Edge")){
            try {
                // Set the driver path
                System.setProperty("webdriver.edge.driver", "newDrivers\\msedgedriver.exe");

// Start Edge Session
                driver = new EdgeDriver();
            } catch (Exception e) {
                test.log(LogStatus.FAIL, Constants.MicrosoftEdgeFailure);
            } finally {
                logger.info(Constants.MicrosoftEdgeSuccess);
                test.log(LogStatus.PASS, Constants.MicrosoftEdgeSuccess);


            }

        }
        try {
            driver.get(Constants.webUrl);
        } catch (Exception e) {
            test.log(LogStatus.FAIL, Constants.websiteFailure);
        } finally {
            logger.info(Constants.websiteSuccess);
            test.log(LogStatus.PASS, Constants.websiteSuccess);
            driver.manage().window().maximize();
            TakeScreenshot.takeSnapShot(driver, "WebsiteLaunched");
        }



    }
}
