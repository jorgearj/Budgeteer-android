package com.jaraujo.budgeteer.models;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * Created by jaraujo on 06/09/2016.
 */
@JsonObject
public class Settings {

    @JsonField
    private String coin;

    public Settings() {
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "coin='" + coin + '\'' +
                '}';
    }
}
