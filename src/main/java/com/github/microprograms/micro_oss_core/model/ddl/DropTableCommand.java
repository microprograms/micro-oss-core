package com.github.microprograms.micro_oss_core.model.ddl;

public class DropTableCommand {
    private String tableName;

    public DropTableCommand(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
