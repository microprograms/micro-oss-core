package com.github.microprograms.micro_oss_core.model.dml;

public class Condition {
    private String key;
    private Object value;

    public Condition(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
