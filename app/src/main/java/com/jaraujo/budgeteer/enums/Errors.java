package com.jaraujo.budgeteer.enums;

/**
 * Created by jaraujo on 06/09/2016.
 */
public enum Errors {

    UNABLE_TO_READ_DATA("Unable to read data."),

    DEFAULT("Ups, an unexpected error occurred!!!");

    private String msg;

    Errors(String msg) {

        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
