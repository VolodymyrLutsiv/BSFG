package ru.bsfg.pages;

import com.codeborne.selenide.Selenide;
import ru.bsfg.app.Trim;

public class UserAccountPage extends Page {

    protected final String baseUrl = "https://cp.theabyss.ru/";

    public UserAccountPage(String pageUrl) {
        super(pageUrl);
    }

    @Override
    public void open() {
        String url = Trim.right(baseUrl) + "/" + Trim.left(pageUrl);
        Selenide.open(url);
    }
}