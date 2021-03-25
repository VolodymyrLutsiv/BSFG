package ru.bsfg.app;

import java.util.regex.Pattern;

public class Trim {

    public static String trim(String string) {
        return right(left(string));
    }

    public static String left(String string) {
        return string.replaceAll("^" + Pattern.quote("/") + "+", "");
    }

    public static String right(String string) {
        return string.replaceAll(Pattern.quote("/") + "+$", "");
    }
}