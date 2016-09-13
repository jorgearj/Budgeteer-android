package com.jaraujo.budgeteer.models;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * Created by jaraujo on 05/09/2016.
 */
@JsonObject
public class Envelope {

    @JsonField
    private String id;

    @JsonField
    private String name;

    @JsonField
    private Double amount;

    @JsonField
    private String type;

    @JsonField
    private String categoryId;

    public Envelope() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }
}
