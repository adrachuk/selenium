package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/**
 * Created by adrachuk on 24/05/2017.
 */
public class TestBaseSetup {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    private void setDriver(String appURL) {
                driver = initChromeDriver(appURL);
    }
    private static WebDriver initChromeDriver(String appURL) {
        System.out.println("Launching google chrome with new profile..");
       // System.setProperty("webdriver.chrome.driver", driverPath
      //          + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.navigate().to(appURL);
        return driver;
    }

    @Parameters({ "appURL" })
    @BeforeClass
    public void initializeTestBaseSetup(String appURL) {
        try {
            setDriver(appURL);

        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
