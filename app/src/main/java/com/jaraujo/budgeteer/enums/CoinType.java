package com.jaraujo.budgeteer.enums;

/**
 * Created by jaraujo on 06/09/2016.
 */
public enum CoinType {

    EURO("euro", "€"),
    USD("usd", "$");

    private String type;

    private String symbol;

    CoinType(String type, String symbol) {

        this.type = type;
        this.symbol = symbol;
    }
}
