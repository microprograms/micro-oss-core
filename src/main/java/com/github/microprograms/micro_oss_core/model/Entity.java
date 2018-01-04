package com.github.microprograms.micro_oss_core.model;

import java.util.List;

public class Entity {
    private String tableName;
    private List<Field> fields;

    public Entity(String tableName, List<Field> fields) {
        this.tableName = tableName;
        this.fields = fields;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
