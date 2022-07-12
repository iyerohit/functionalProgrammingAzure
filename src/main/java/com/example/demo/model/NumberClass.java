package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class NumberClass {

    @javax.persistence.Id
    public int id;

    public String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
