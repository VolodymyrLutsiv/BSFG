package ru.bsfg;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.bsfg.app.Driver;

public class BaseTest {

    @BeforeSuite
    public void setup() {
        Driver.init();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}