package ru.bsfg.app;

import ru.bsfg.pages.MainPage;
import ru.bsfg.pages.UserAccountPage;
import ru.bsfg.pages.WikiPage;
import ru.bsfg.pages.useraccountpages.ShopPage;
import ru.bsfg.pages.wikipages.MapPage;

public class Pages {

    public static final MainPage MAIN;
    public static final WikiPage WIKI;
    public static final MapPage WIKI_MAP;
    public static final UserAccountPage USER_ACCOUNT;
    public static final ShopPage USER_ACCOUNT_SHOP;

    static {
        MAIN = PageBuilder.buildMainPage();
        WIKI = PageBuilder.buildWikiPage();
        WIKI_MAP = PageBuilder.buildMapPage();
        USER_ACCOUNT = PageBuilder.buildUserAccountPage();
        USER_ACCOUNT_SHOP = PageBuilder.buildShopPage();
    }
}