package ru.bsfg.data;

public enum User {

    BRAT0K("BRAT0K","Lv197358246"),
    DEV1L("westua","iphonese4018"),
    D1REWOLF("d1rewolf","iphonese4018");

    private final String login;
    private final String password;

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}