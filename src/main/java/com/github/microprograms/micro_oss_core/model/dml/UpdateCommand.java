package com.github.microprograms.micro_oss_core.model.dml;

import java.util.List;

import com.github.microprograms.micro_oss_core.model.Field;

public class UpdateCommand implements WriteCommand {
    private String tableName;
    private List<Field> fields;
    private Condition where;

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

    public Condition getWhere() {
        return where;
    }

    public void setWhere(Condition where) {
        this.where = where;
    }
}
