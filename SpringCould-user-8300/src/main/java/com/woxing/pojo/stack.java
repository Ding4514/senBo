package com.woxing.pojo;

public class stack {
    private String type;

    private String value;

    private String unit;

    public stack(String type, String value, String unit) {
        this.type = type;
        this.value = value;
        this.unit = unit;
    }

    public stack() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
