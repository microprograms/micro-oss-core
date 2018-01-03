package com.github.microprograms.micro_oss_core.model.ddl;

import com.github.microprograms.micro_oss_core.model.TableDefinition;

public class CreateTableCommand {
    private TableDefinition tableDefinition;

    public TableDefinition getTableDefinition() {
        return tableDefinition;
    }

    public void setTableDefinition(TableDefinition tableDefinition) {
        this.tableDefinition = tableDefinition;
    }
}
