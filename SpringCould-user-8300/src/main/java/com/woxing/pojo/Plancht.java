package com.woxing.pojo;

import java.util.ArrayList;

public class Plancht {
    private String name;

    private ArrayList<Data> types;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plancht(String name, ArrayList<Data> types) {
        this.name = name;
        this.types = types;
    }

    public ArrayList<Data> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Data> types) {
        this.types = types;
    }

    public Plancht() {
    }
}
