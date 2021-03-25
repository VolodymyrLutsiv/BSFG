package ru.bsfg.pages;

import com.codeborne.selenide.SelenideElement;
import ru.bsfg.data.User;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement mainButton = $x("//ul[@class='header__left']//a[contains(.,'Главная')]");
    private final SelenideElement wikiButton = $x("//div[@class='secondary']").$x(".//a[contains(.,'база Знаний')]");
    private final SelenideElement userAccountButton = $x("//span[contains(.,'Личный кабинет')]");



    public UserAccountPage loginIntoUserAccount(User user){
        userAccountButton.click();
        $x("//input[@name='username']").setValue(user.getUsername());
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

}
