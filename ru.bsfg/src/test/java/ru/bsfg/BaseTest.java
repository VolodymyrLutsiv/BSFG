package ru.bsfg;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    private static final String URL = "https://www.bsfg.ru/";
    protected final static String TEXT_FOR_PRODUCT_SEARCH = "Dress";

    @BeforeSuite
    public void setup(){
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        Configuration.pageLoadTimeout = 20000;
    }

    @BeforeSuite
    public void startDriver(){
        Selenide.open(URL);
    }

    @AfterSuite(alwaysRun = true)
    public void closeDriver(){Selenide.closeWebDriver();}
}


