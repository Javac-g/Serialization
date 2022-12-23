package com.company.Example;

import java.io.Serializable;

public class Car implements Serializable {
    private final static String firm;
    private int id;

    public Car(String firm, int id) {
        this.firm = firm;
        this.id = id;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
