package com.jaraujo.budgeteer.models;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonIgnore;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.List;

/**
 * Created by jaraujo on 05/09/2016.
 */
@JsonObject
public class Category {

    @JsonField
    private String id;

    @JsonField
    private String name;

    @JsonField
    private List<Envelope> envelopes;

    public Category() {
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

    public List<Envelope> getEnvelopes() {
        return envelopes;
    }

    public void setEnvelopes(List<Envelope> envelopes) {
        this.envelopes = envelopes;
    }

    public void addEnvelope(Envelope env){
        this.envelopes.add(env);
    }

    public void removeEnvelope(Envelope env){
        this.envelopes.remove(env);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", envelopes=" + envelopes +
                '}';
    }
}
