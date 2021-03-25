package ru.bsfg.app;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class Driver {

    public static void init() {
        Configuration.baseUrl = "https://www.bsfg.ru";
        Configuration.startMaximized = true;
        Configuration.browser = Browsers.CHROME;
    }

    private static WebDriver getCurrentDriver() {
        return WebDriverRunner.getWebDriver();
    }

    public static void maximize() {
        getCurrentDriver().manage().window().maximize();
    }

    public static void setWindowSize(int width, int height) {
        getCurrentDriver().manage().window().setSize(new Dimension(width, height));
    }

    public static void clearCookies() {
        Selenide.open(Configuration.baseUrl);
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}