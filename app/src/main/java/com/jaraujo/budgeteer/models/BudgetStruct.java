package com.jaraujo.budgeteer.models;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.List;

/**
 * Created by jaraujo on 06/09/2016.
 */
@JsonObject
public class BudgetStruct {

    @JsonField
    private List<Account> accounts;

    @JsonField
    private List<Category> categories;

    @JsonField
    private List<Envelope> envelopes;

    @JsonField
    private Settings settings;

    public BudgetStruct() {

    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public List<Envelope> getEnvelopes() {
        return envelopes;
    }

    public void setEnvelopes(List<Envelope> envelopes) {
        this.envelopes = envelopes;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "BudgetStruct{" +
                "accounts=" + accounts +
                ", categories=" + categories +
                ", envelopes=" + envelopes +
                ", settings=" + settings +
                '}';
    }
}
