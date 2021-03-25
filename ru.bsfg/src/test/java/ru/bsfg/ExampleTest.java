package ru.bsfg;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import ru.bsfg.app.Pages;

public class ExampleTest extends BaseTest {

    @Test
    public void menuIsVisible() {
        Pages.MAIN.getMainMenu().shouldBe(Condition.visible);
    }

    @Test
    public void subMenuIsVisible() {
        Pages.MAIN.getSubMenu().shouldBe(Condition.visible);
    }
}