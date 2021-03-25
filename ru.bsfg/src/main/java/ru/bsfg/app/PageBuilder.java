package ru.bsfg.app;

import ru.bsfg.pages.MainPage;
import ru.bsfg.pages.UserAccountPage;
import ru.bsfg.pages.WikiPage;
import ru.bsfg.pages.useraccountpages.ShopPage;
import ru.bsfg.pages.wikipages.MapPage;

public class PageBuilder {

    public static MainPage buildMainPage() {
        return new MainPage("/");
    }

    public static UserAccountPage buildUserAccountPage() {
        return new UserAccountPage("/");
    }

    public static ShopPage buildShopPage() {
        return new ShopPage("/?act=donation");
    }

    public static WikiPage buildWikiPage() {
        return new WikiPage("");
    }

    public static MapPage buildMapPage() {
        return new MapPage("/map");
    }
}