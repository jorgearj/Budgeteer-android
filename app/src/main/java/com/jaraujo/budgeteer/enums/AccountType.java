package com.jaraujo.budgeteer.enums;

/**
 * Created by jaraujo on 06/09/2016.
 */
public enum AccountType {

    CHECK("check"),
    SAVING("saving");

    private String type;

    AccountType(String type) {
        this.type = type;
    }
}
