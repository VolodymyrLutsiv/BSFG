package ru.bsfg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.bsfg.app.Driver;

public class BaseTest {

    @BeforeSuite
    public void setup() {
        Driver.init();
    }

    @AfterMethod
    public void clearCookies() {
        Driver.clearCookies();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        Driver.close();
    }
}