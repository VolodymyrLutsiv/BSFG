package ru.bsfg.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import ru.bsfg.app.Trim;

public abstract class Page {

    protected String pageUrl;

    public Page(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        String url = Trim.right(Configuration.baseUrl) + "/" + Trim.left(pageUrl);
        Selenide.open(url);
    }
}