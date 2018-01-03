package com.github.microprograms.micro_oss_core.model.dml;

import java.util.List;

import com.github.microprograms.micro_oss_core.model.Field;
import com.github.microprograms.micro_oss_core.model.Where;

public class UpdateCommand {
    private String tableName;
    private List<Field> fields;
    private Where where;

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

    public Where getWhere() {
        return where;
    }

    public void setWhere(Where where) {
        this.where = where;
    }
}
