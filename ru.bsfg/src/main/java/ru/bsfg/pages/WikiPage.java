package ru.bsfg.pages;

public class WikiPage extends Page {

    protected final String baseUrl = "https://db.bsfg.ru/";

    /*
    private final SelenideElement menuLine = $x("//ul[@class='lbl_ul']");
    private final SelenideElement backToWikiButton = $x("//ul[@class='ul__left']//a[contains(.,'Главная')]");
    private final SelenideElement profListButton = $x("//ul[@class='lbl_ul']//a[contains(.,'Профессии')]");
    private final SelenideElement mapButton = $x("//ul[@class='lbl_ul']//a[contains(.,'Интерактивная карта')]");
    private final SelenideElement mainPageButton = $x("//ul[@class='lbl_ul']//a[contains(.,'Официальный сайт')]");
    private final SelenideElement guidesButton = $x("//ul[@class='lbl_ul']//a[contains(.,'Гайды')]");
    private final SelenideElement updateLogButton = $x("//a[@class='allver']");
    private final SelenideElement itemArea = $x("//ul[@class='lbl_ul']//a[contains(.,'Предметы')]");
    private final SelenideElement characteristicsArea = $x("//ul[@class='lbl_ul']//a[contains(.,'Характеристики')]");

    public void checkUpdatesLog(){
        updateLogButton.click();
    }
    public MainPage backToMainPage(){
       mainPageButton.click();
        return new MainPage();
    }
    public void checkGameMap(){
        mapButton.click();
    }
    public void watchToAllProfession(){
        profListButton.click();
    }
    public void watchGuides(){
        guidesButton.click();
    }
    public WikiPage backToWiki(){
        backToWikiButton.click();
        return new WikiPage();
    }
     */
}