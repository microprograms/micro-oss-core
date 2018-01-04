package com.github.microprograms.micro_oss_core.model;

public class FieldDefinition {
    private String name;
    private String type;
    private Object defaultValue;
    private int primaryKey;

    public FieldDefinition(String name, String type, Object defaultValue, int primaryKey) {
        this.name = name;
        this.type = type;
        this.defaultValue = defaultValue;
        this.primaryKey = primaryKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }
}
