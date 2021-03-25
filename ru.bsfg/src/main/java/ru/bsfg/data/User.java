package ru.bsfg.data;

public enum User {
    BRAT0K("BRAT0K","Lv197358246"),
    DEV1L("westua","iphonese4018");

    private String username;
    private String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsernName() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
