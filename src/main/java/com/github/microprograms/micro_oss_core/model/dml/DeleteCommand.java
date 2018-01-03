package com.github.microprograms.micro_oss_core.model.dml;

import com.github.microprograms.micro_oss_core.model.Where;

public class DeleteCommand {
    private String tableName;
    private Where where;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Where getWhere() {
        return where;
    }

    public void setWhere(Where where) {
        this.where = where;
    }
}
