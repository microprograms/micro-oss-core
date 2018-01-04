package com.github.microprograms.micro_oss_core.model;

import java.util.List;

public class TableDefinition {
    private String tableName;
    private List<FieldDefinition> fields;

    public TableDefinition(String tableName, List<FieldDefinition> fields) {
        this.tableName = tableName;
        this.fields = fields;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<FieldDefinition> getFields() {
        return fields;
    }

    public void setFields(List<FieldDefinition> fields) {
        this.fields = fields;
    }
}
