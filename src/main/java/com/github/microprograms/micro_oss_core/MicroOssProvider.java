package com.github.microprograms.micro_oss_core;

import java.util.List;

import com.github.microprograms.micro_oss_core.model.Entity;
import com.github.microprograms.micro_oss_core.model.ddl.CreateTableCommand;
import com.github.microprograms.micro_oss_core.model.ddl.DropTableCommand;
import com.github.microprograms.micro_oss_core.model.dml.DeleteCommand;
import com.github.microprograms.micro_oss_core.model.dml.InsertCommand;
import com.github.microprograms.micro_oss_core.model.dml.SelectCommand;
import com.github.microprograms.micro_oss_core.model.dml.SelectCountCommand;
import com.github.microprograms.micro_oss_core.model.dml.UpdateCommand;
import com.github.microprograms.micro_oss_core.model.dml.WriteCommand;

public interface MicroOssProvider {
    void createTable(CreateTableCommand command);

    void dropTable(DropTableCommand command);

    int deleteObject(DeleteCommand command);

    int insertObject(InsertCommand command);

    List<Entity> selectObject(SelectCommand command);

    int selectCount(SelectCountCommand command);

    int updateObject(UpdateCommand command);

    void transaction(List<WriteCommand> commands);
}
