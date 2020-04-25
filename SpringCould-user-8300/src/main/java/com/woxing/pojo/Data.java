package com.woxing.pojo;

import java.util.ArrayList;

public class Data {
    private String type;

   private ArrayList<stack> stacks;

    public Data(String type, ArrayList<stack> stacks) {
        this.type = type;
        this.stacks = stacks;
    }

    public Data() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<stack> getStacks() {
        return stacks;
    }

    public void setStacks(ArrayList<stack> stacks) {
        this.stacks = stacks;
    }
}
