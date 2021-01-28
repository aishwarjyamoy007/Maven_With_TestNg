package com.company;

import org.testng.annotations.AfterSuite;

public class closeBrowser extends DriverSetup {
    @AfterSuite(groups = {"Smoke","Regression"})
    public static void closeBrowser(){
        report.endTest(test);
        report.flush();
        driver.close();

    }
}
