package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.AirlinesDeparturePage;
import pages.UnitedHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class UnitedBase {

    WebDriver driver;
    UnitedHomePage unitedHomePage;

    AirlinesDeparturePage airlinesDeparturePage;

    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();

        driver.get(ConfigReader.getProperty("appURL"));

        unitedHomePage = new UnitedHomePage();
    }

    @AfterMethod
    public void teardown() {
        //We will quit driver and do other proper clean ups

        Driver.quitDriver();
    }

}
