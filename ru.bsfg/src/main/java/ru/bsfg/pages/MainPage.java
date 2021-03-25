package ru.bsfg.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends Page {

    public MainPage(String pageUrl) {
        super(pageUrl);
    }

    /** JUST FOR EXAMPLE_TEST */
    private final SelenideElement mainMenu= $("ul.header__left");
    private final SelenideElement subMenu= $("div.secondary ul");

    public SelenideElement getMainMenu() {
        return mainMenu;
    }

    public SelenideElement getSubMenu() {
        return subMenu;
    }

/*
    private final SelenideElement mainButton = $x("//ul[@class='header__left']//a[contains(.,'Главная')]");
    private final SelenideElement wikiButton = $x("//div[@class='secondary']").$x(".//a[contains(.,'база Знаний')]");
    private final SelenideElement userAccountButton = $x("//span[contains(.,'Личный кабинет')]");

    public UserAccountPage loginIntoUserAccount(User user){
        userAccountButton.click();
        $x("//input[@name='username']").setValue(user.getUsernName());
        $x("//input[@name='password']").setValue(user.getPassword());
        $x("//button[@type='submit']").click();
        return new UserAccountPage();
    }

    public WikiPage goToWikiPage(){
        wikiButton.click();
        return new WikiPage();
    }

    public MainPage backToMainPage(){
        mainButton.click();
        return new MainPage();
    }
*/
}