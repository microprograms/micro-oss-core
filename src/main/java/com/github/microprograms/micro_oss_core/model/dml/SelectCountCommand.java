package com.github.microprograms.micro_oss_core.model.dml;

public class SelectCountCommand implements ReadCommand {
    private String tableName;
    private Condition where;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Condition getWhere() {
        return where;
    }

    public void setWhere(Condition where) {
        this.where = where;
    }
}
